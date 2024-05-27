package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControlller {
	@GetMapping("/index")
	public String getMessage()
	{
		return "My New way to creating Springbbot!!! Really interesting.";
	}
	
	@GetMapping("/maths")
	public int getResult()
	{
		return 25+68;
	}
	
	@GetMapping("/chk")
	public String display()
	{
		return "MY WEB APP";
	}

}
