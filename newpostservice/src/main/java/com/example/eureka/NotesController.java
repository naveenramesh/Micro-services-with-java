package com.example.eureka;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NotesController {
	
	
	@Autowired
	NotesService service;
	
	@GetMapping("/commentsport")
	public String getCommentsPort() {
		return service.getCommentsPort();
	}
	
	@GetMapping("/comments/{pid}")
	public List<CommentsDto> findAllComemntsForPid(@PathVariable int pid){
		return service.findCommentsByPid(pid);
	}
	
	@GetMapping("/authorNtitle")
	public List<NotesDto> findAuthorNTitle(){
		return service.findAuthorNTitle();
	}
	
	@GetMapping("/{pid1}/{pid2}")
	public List<Notes>findPids(@PathVariable int pid1,
			@PathVariable int pid2) {
		
		return service.getNotesBetweenId(pid1, pid2);
	}
	@GetMapping("/author/{author}")
	public List<Notes> getAllByAuthor(@PathVariable String author){
		return service.findAllByAuthor(author);
	}
	@GetMapping("/title/{title}")
	public List<Notes> getAllByTitle(@PathVariable String title){
		return service.findByTitle(title);
	}
	
	
	@DeleteMapping("{pid}")
	public String deleteNotes(@PathVariable int pid) {
		service.deleteNotes(pid);
		return "Notes deleted";
	}
	
	@GetMapping("/search/{pid}")
	public Optional<Notes> getNotesById(@PathVariable int pid) {
		return service.getNotes(pid);
	}
	
	@PostMapping("/add")
	public Notes createNotes(@RequestBody Notes notes) {
		return service.insertNotes(notes);
	}

	@GetMapping("/all")
	public List<Notes> getAllNotes(){
		return service.getAllNotes();
	}
	
	

}
