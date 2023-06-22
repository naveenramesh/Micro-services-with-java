package com.example.eureka;

import java.util.List;
import java.util.Optional;



public interface NotesService {
	public List<NotesDto> findAuthorNTitle();
	public List<Notes> getNotesBetweenId(int pid1, int pid2);
	public List<Notes> getAllNotes();
	public Notes insertNotes(Notes notes);
	public Optional<Notes> getNotes(int pid);
	public void deleteNotes(int pid);
	public List<Notes> findAllByAuthor(String author);
	public List<Notes> findByTitle(String title);
	public List<CommentsDto> findCommentsByPid(int pid);
	public String getCommentsPort();
}