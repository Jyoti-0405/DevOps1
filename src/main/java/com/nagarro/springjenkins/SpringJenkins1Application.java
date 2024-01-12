package com.nagarro.springjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkins1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkins1Application.class, args);
	}
	
	@GetMapping("/welcome")
		public String welcome() {
			return "Welcome to the Simple Spring Boot App!";
		}
}
