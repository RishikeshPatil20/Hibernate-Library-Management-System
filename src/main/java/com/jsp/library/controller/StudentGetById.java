package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class StudentGetById {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	Student student=studentService.getStudentById(1);
	System.out.println("=========================");
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getEmail());
	System.out.println("=========================");
	
}
}
