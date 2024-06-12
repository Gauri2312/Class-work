package com.example.demo.service;


import java.util.List;

import com.example.demo.entities.Student;
import com.example.demo.model.StudentDTO;

public interface StudentService {
	StudentDTO createStudent(Student student);
	List<StudentDTO> getAllStudents();
	StudentDTO getStudentById(int id);
	String deleteStudentById(int id);
	StudentDTO updateStudent(int id, Student student);

	

}
