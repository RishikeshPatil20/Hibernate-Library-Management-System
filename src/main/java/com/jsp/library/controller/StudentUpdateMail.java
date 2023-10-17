package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class StudentUpdateMail {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	studentService.updateStudentMailById(3, "shivani@mail.com");
}
}
