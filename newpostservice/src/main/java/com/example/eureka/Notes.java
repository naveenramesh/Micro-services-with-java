package com.example.eureka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="notes")
@Entity
public class Notes {

	
	@Id
	int pid;
	
	String author;
	
	String description;
	
	String title;
	public Notes() {
		
	}
	
	public Notes(int pid, String author, String description, String title) {
		super();
		this.pid = pid;
		this.author = author;
		this.description = description;
		this.title = title;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
