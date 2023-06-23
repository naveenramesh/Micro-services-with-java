package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdminclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminclientApplication.class, args);
	}
	
	@PostMapping("/post")
	public String posts() {
		return "Post method is called";
	}
	
	
	@GetMapping("/get")
	public String gets() {
		return "get method is called";
	}

}
