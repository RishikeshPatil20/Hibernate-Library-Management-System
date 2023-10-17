package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class StudentUpdateName {
public static void main(String[] args) {
	StudentService studentService=new StudentService();
	studentService.updateStudentNameById(3, "shardul");
}
}
