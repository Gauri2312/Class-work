//WAp to print Welcome to springboot on mappping "/home"

package com.example.WelcomeSpringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/home")
	public String display()
	{
		return "Welcome to Springboot mapping.";
	}
	

}
