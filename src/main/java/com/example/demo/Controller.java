package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/")
	public String get() {
		System.out.println("get...");
		return "{\"id\": \"12345\"}";			
	}
}