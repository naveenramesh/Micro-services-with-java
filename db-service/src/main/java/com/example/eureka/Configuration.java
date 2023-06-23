package com.example.eureka;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("db-service")
@Data
public class Configuration {
	
	String driver;
	String username;
	String password;
	

}
