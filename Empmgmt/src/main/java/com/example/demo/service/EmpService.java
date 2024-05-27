package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmpService {
	
	public Employee saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);

}
