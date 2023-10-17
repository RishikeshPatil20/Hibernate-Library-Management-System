package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class StudentDelete {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	studentService.deleteStudentById(2);
}
}
