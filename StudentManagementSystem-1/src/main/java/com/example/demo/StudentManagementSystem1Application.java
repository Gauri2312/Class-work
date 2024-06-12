package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Student;

@SpringBootApplication
public class StudentManagementSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
		System.out.println("Welcome to my student management system.");
		
	}

}
