package com.example.demo.utitity;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Student;
import com.example.demo.model.StudentDTO;

@Component
public class Converter {
	//convert DTO to Entity
		public Student convertToStudentEntity(StudentDTO studentDTO)
		{
			Student student=new Student();
			if(studentDTO!=null)
			{
				BeanUtils.copyProperties(studentDTO, student);
			}
			return student;
		}
		
		//Convert Entity to DTO
		public StudentDTO convertToStudentDTO(Student  student)
		{
			StudentDTO studentDTO=new StudentDTO();
			if(student!=null)
			{
				BeanUtils.copyProperties(student, studentDTO);
			}
			return studentDTO;
		}
		
}
