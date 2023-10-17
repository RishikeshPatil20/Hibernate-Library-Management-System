package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Student;

public class StudentService {

	StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public Student updateStudentNameById(int id,String name) {
		return studentDao.updateStudentNameById(id, name);
	}
	
	public Student updateStudentMailById(int id, String mail) {
		return studentDao.updateStudentMailById(id, mail);
	}
	
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	
	public List<Student> gettAllStudent(){
		return studentDao.gettAllStudent();
	}
}
