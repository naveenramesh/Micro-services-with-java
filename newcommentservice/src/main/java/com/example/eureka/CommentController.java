package com.example.eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	
	@Value("${server.port}")
	public String port;
	
	@Autowired
	CommentService service;
	
	@GetMapping("/port")
	public String getPort() {
		return "CommentService on port "+port;
	}
	
	@GetMapping("/all")
	public List<Comments> getAllComments(){
		return service.getAllComments();
	}
	
	@PostMapping("/add")
	public Comments addComment(@RequestBody Comments comment) {
		return service.postComment(comment);
	}
	
	@DeleteMapping("/{cid}")
	public String deleteComment(@PathVariable int cid) {
		return service.deleteComment(cid);
	}
	
	@GetMapping("/postid/{pid}")
	public List<Comments> getAllCommentsByPid(@PathVariable int pid){
		return service.findCommentsByPid(pid);
	}
	

}
