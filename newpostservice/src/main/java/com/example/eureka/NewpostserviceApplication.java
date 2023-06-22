package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("com.example.eureka")
public class NewpostserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewpostserviceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
