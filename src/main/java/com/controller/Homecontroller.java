package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	
	@GetMapping
	public void get() {
		
		System.out.println("Hello");
	}
}
