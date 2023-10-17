package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Libriain;

public class AdminDao {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Rishi");
		
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		
		
		//TO SAVE ADMIN
		public Admin saveAdmin(Admin admin) {
			entityTransaction.begin();
			entitymanager.persist(admin);
			entityTransaction.commit();
			
			return admin;
		}
		
		// TO UPDATE BY ID
		public Admin updateAdminUserNameByIdPass(int id,String username) {
			Admin admin=entitymanager.find(Admin.class, id);
			admin.setUsername("Shraddha");
			
				entityTransaction.begin();
				entitymanager.merge(admin);
				entityTransaction.commit();
			
			return admin;
			
			}
		
		public boolean updateStatusById(int id,String Status) {
			Libriain l=entitymanager.find(Libriain.class, id);
		    l.setStatus(Status);
		if(l!=null) {
			entityTransaction.begin();
			entitymanager.merge(l);
			entityTransaction.commit();
			return true;
		
		}
		return false;
		}
		
		// TO DELETE BY ID
		public boolean deleteAdminById(int id) {
			Admin admin = entitymanager.find(Admin.class,id);
			entityTransaction.begin();
			   entitymanager.remove(admin);
			   entityTransaction.commit();
			return true;
		}
		
		
		//TO GET ADMIN ID
		public Admin getAdminById(int id) {
			Admin admin=entitymanager.find(Admin.class,id);	
			return admin;
		}
		
		
		//TO GET ALL DETAILS OF ADMIN
		public List<Admin> gettAllAdmin(){
			String sql="SELECT a FROM Admin a";
			Query query=entitymanager.createQuery(sql);
			List<Admin> admins= query.getResultList();
			return admins;
		
		}
		
}
