package com.example.eureka;

import java.util.List;



public interface CommentService {
	
	public List<Comments> getAllComments();
	public Comments postComment(Comments comment);
	public String deleteComment(int cid);
	public List<Comments> findCommentsByPid(int pid);

}
