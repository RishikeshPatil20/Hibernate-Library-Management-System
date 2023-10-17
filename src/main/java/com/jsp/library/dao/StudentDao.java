package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.library.dto.Student;

public class StudentDao {

EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Rishi");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//TO SAVE
		public Student saveStudent(Student student) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			
			return student;
		}
		//TO UPDATE 
		public Student updateStudentNameById(int id,String name) {
			Student student=entityManager.find(Student.class, id);
			student.setName(name);
			
				entityTransaction.begin();
				entityManager.merge(student);
				entityTransaction.commit();
			
			return student;
			
			}
		
		public Student updateStudentMailById(int id, String mail) {
			Student student=entityManager.find(Student.class, id);
			student.setEmail(mail);
			
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			
			return student;
		}
		
		// TO DELETE BY ID
					public boolean deleteStudentById(int id) {
						Student student = entityManager.find(Student.class,id);
						entityTransaction.begin();
						   entityManager.remove(student);
						   entityTransaction.commit();
						return true;
					}
		
			//TO GET STUDENT ID
			public Student getStudentById(int id) {
			   Student student=entityManager.find(Student.class,id);	
					return student;
					}
									
			//TO GET ALL DETAILS OF ADMIN
			public List<Student> gettAllStudent(){
				String sql="SELECT s FROM Student s";
				Query query=entityManager.createQuery(sql);
				List<Student> students= query.getResultList();
				return students;
			
			}	
}
