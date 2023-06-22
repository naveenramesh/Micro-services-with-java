package com.example.eureka;

import java.util.List;

import org.springframework.stereotype.Service;



import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CommentServiceImpl implements CommentService {
	
	CommentRepository repo;
	

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Comments postComment(Comments comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}

	@Override
	public String deleteComment(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "comment deleted";
	}

	@Override
	public List<Comments> findCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return repo.findByPid(pid);
	}

}
