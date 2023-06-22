package com.example.eureka;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="COMMENTSERVICE")
public interface CommentProxy {
	
	@GetMapping("comments/postid/{pid}")
	public List<CommentsDto> getAllCommentsByPid(@PathVariable int pid);

	@GetMapping("comments/port")
	public String getCommentsPort();

}

