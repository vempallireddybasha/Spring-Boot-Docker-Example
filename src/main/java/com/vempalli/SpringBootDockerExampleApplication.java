package com.vempalli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerExampleApplication {

	@GetMapping("/get")
	public String get() {
		return "Docker Image is Running...";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerExampleApplication.class, args);
	}

}
