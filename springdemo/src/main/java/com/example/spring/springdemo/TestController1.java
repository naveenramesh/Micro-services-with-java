package com.example.spring.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class TestController1 {
	
	@GetMapping("/")
	public String rest(@RequestParam("driver") String d,
			@RequestParam("database") String db, @RequestHeader("city") String city) {
		return "Driver-> "+d+" Database --> "+db+ " city "+city ;
	}

}
