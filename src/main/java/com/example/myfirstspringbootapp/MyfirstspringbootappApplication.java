package com.example.myfirstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstspringbootappApplication { 

	public static void main(String[] args) {  
		SpringApplication.run(MyfirstspringbootappApplication.class, args);
	} 

	@GetMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hi %s!", name);
	}

}
