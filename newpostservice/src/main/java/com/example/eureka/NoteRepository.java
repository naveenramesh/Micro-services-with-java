package com.example.eureka;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface NoteRepository extends JpaRepository<Notes,Integer>{

	public List<Notes> findByAuthor(String author);
	public List<Notes> findByTitle(String title);
	@Query("select n from Notes n where n.pid>=?1 and n.pid<=?2")
	public List<Notes> findNotesBetweenIds(int pid1,int pid2);
	
	@Query(nativeQuery = true, value="select n.title,n.author from Notes n")
	public List<NotesDto> findAuthorNTitles();
	
}
