package com.example.noteservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.noteservice.model.CommentsDto;

@FeignClient(name="COMMENTSERVICE")
public interface NoteProxyService {

	@GetMapping("comments/postid/{pid}")
	public List<CommentsDto> searchNotesByPid(@PathVariable("pid") int  pid);
	
	
	
}
