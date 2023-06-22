package com.example.eureka;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;





@Service
public class NotesServieImpl implements NotesService {
	
	@Autowired
	CommentProxy proxy;
	
	@Autowired
	RestTemplate template;
	
	
	@Autowired
	NoteRepository nrepo;

		@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return nrepo.findAll();
	}

		@Override
		public Notes insertNotes(Notes notes) {
			// TODO Auto-generated method stub
			return nrepo.save(notes);
		}

		@Override
		public Optional<Notes> getNotes(int pid) {
			// TODO Auto-generated method stub
			return  nrepo.findById(pid);
		}

		@Override
		public void deleteNotes(int pid) {
			// TODO Auto-generated method stub
			nrepo.deleteById(pid);
			
		}

		@Override
		public List<Notes> findAllByAuthor(String author) {
			// TODO Auto-generated method stub
			return nrepo.findByAuthor(author);
		}

		@Override
		public List<Notes> findByTitle(String title) {
			// TODO Auto-generated method stub
			return nrepo.findByTitle(title);
		}

		@Override
		public List<Notes> getNotesBetweenId(int pid1, int pid2) {
			// TODO Auto-generated method stub
			return nrepo.findNotesBetweenIds(pid1, pid2);
		}

		@Override
		public List<NotesDto> findAuthorNTitle() {
			// TODO Auto-generated method stub
			return nrepo.findAuthorNTitles();
		}

		@Override
		public List<CommentsDto> findCommentsByPid(int pid) {
			// TODO Auto-generated method stub
		//	String url = "http://localhost:8082/comments/postid/"+pid;
			String url = "http://COMMENTSERVICE/comments/postid/"+pid;

			//List<CommentsDto> data = template.getForObject(url, List.class);
			List<CommentsDto> data = proxy.getAllCommentsByPid(pid);
			return data;
		}

		@Override
		public String getCommentsPort() {
			// TODO Auto-generated method stub
			String url = "http://COMMENTSERVICE/comments/port";
			//return template.getForObject(url, String.class);
			return proxy.getCommentsPort();
		}
}
