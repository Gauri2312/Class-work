package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/Emp")
public class EmployeeController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/add")
	public String add(@RequestBody Employee emp)
	{
		empService.saveEmployee(emp);
		
		return "New Employee Added.";
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}

}
