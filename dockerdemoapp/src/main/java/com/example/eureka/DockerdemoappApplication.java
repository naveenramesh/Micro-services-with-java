package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoappApplication.class, args);
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2 is working";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "test1 is working";
	}

}
