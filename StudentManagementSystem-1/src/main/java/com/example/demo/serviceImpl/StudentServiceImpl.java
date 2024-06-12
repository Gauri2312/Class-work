package com.example.demo.serviceImpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.model.StudentDTO;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.utitity.Converter;

@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	Converter converter;
	@Override
	public StudentDTO createStudent(Student student) 
	{
		Student stud=studentRepository.save(student);
		return converter.convertToStudentDTO(stud);
	}
	@Override
	public List<StudentDTO> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findAll();
		List<StudentDTO> dtos=new ArrayList<>();
		for(Student s:students)
		{
			dtos.add(converter.convertToStudentDTO(s));
		}
		
		
		return dtos;
	}
	@Override
	public StudentDTO getStudentById(int id) 
	{
		Student s=studentRepository.findById(id).get();
		return converter.convertToStudentDTO(s);
	}
	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Student deleted";
	}
	@Override
	public StudentDTO updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		
		Student s1=studentRepository.findById(id).get();
		s1.setName(student.getName());
		s1.setPhNo(student.getPhNo());
		s1.setAddress(student.getAddress());
		 
		Student stud=studentRepository.save(s1);
		return converter.convertToStudentDTO(stud);
	}

}
