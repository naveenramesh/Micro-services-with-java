package com.example.spring.springdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/rest/post--> POST


@RestController
@RequestMapping(value="/rest1")
public class TestController {
	
	@GetMapping("/name/{name}/{city}")
	public String getName(@PathVariable String city, 
			@PathVariable String name) {
		return "Hello " +name+" welcome to "+city;
	}
	
	@GetMapping("/emp")
	public  ResponseEntity<Employee> getEmployee(@RequestBody Employee emp) {
		emp.setEmpid("99999");
		return new ResponseEntity(emp,HttpStatus.CREATED);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> xyz() {
		return new ResponseEntity("post method is called",HttpStatus.CREATED);
	}
	
	@PutMapping("/put")
	public String puts() {
		return "Put method is called";
	}
	
	//@DeleteMapping("/delete")
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public String del() {
		return "delete method is called";
	}
	
	//@GetMapping("/")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String test() {
		return "Hello Controller is working";
	}
	
	@GetMapping("/test")
	public String test1() {
		return "Hello Controller test1 method is working";
	}

	@GetMapping("/test2")
	public String test2() {
		return "Hello Controller test2 method is working";
	}
}
