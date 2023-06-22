package com.example.eureka;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigs {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p.path("/get")
						  .filters(f->f.addRequestHeader("header1","praveen")
								  .addRequestHeader("header2", "kumar")
								  .addRequestParameter("city1", "Hyderabad")
								  .addRequestParameter("city2","bangalore"))
						  	.uri("http://httpbin.org:80"))
				
				
				.route(p->p.path("/notes/**").uri("lb://POSTSERVICE/notes"))
				.route(p->p.path("/comments/**").uri("lb://COMMENTSERVICE/comments"))
				.build();
	}
			

}
