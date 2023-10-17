package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class StudentSave {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	Student student=new Student();
	student.setName("PQR");
	student.setEmail("PQR@mail.com");
	studentService.saveStudent(student);
}
}
