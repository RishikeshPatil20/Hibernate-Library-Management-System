package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Libriain;

public class LibriainDao {

	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Rishi");
	
	EntityManager entitymanager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entitymanager.getTransaction();
	
	//TO SAVE 
	public Libriain saveLibriain(Libriain librarian) {
	  entityTransaction.begin();
	  entitymanager.persist(librarian);
	  entityTransaction.commit();
		return librarian;
	
	}
	
	//TO DELETE
	public Libriain deleteLibrarianById(int id) {
		Libriain librarian = entitymanager.find(Libriain.class,id);
		entityTransaction.begin();
	       entitymanager.remove(librarian);
		   entityTransaction.commit();
		   return librarian;
	}
	
	
	//TO UPDATE 
	public Libriain updateLibrarianName(int id,String newname) {
		Libriain libriain=entitymanager.find(Libriain.class, id);
		libriain.setName(newname);
		entityTransaction.begin();
		entitymanager.merge(libriain);
		entityTransaction.commit();
		return libriain;
	}
	
	public Libriain updateLibrarianStatus(int id,String status) {
		Libriain librarian=entitymanager.find(Libriain.class, id);
		librarian.setName(status);
		
			entityTransaction.begin();
			entitymanager.merge(librarian);
			entityTransaction.commit();
			
		return librarian;
		}
	
	
	//TO DELETE
	public Libriain deleteLibriainById(int id) {
		Libriain libriain = entitymanager.find(Libriain.class,id);
		
	   entityTransaction.begin();
       entitymanager.remove(libriain);
	   entityTransaction.commit();
		
	   return libriain;
	
	}
	
	// TO GET BY ID
	public  Libriain  getLibriainById(int id) {
		Libriain libriain= entitymanager.find(Libriain.class,id);
		System.out.println("=================================");
		System.out.println(libriain.getId());
		System.out.println(libriain.getName());
		System.out.println(libriain.getStatus());
		System.out.println("=================================");
		return libriain;
	
	}
	
	//APPROVE
	public boolean approve(Libriain libriain) {
		entityTransaction.begin();
		entitymanager.merge(libriain);
		entityTransaction.commit();
		return true;
	}
	
	//TO GETALL DETAILS
	public List<Libriain> gettAllLibrarian(){
		String jpql="SELECT a FROM Libriain a";
		Query query=entitymanager.createQuery(jpql);
		List<Libriain> libriains= query.getResultList();
		for(Libriain l:libriains) {
			System.out.println("=================================");
			System.out.println(l.getId());
			System.out.println(l.getName());
			System.out.println(l.getStatus());
			System.out.println("=================================");
		}
		
		return libriains;
	}

	public boolean approveReject(Libriain libriain) {
		entityTransaction.begin();
		entitymanager.merge(libriain);
		entityTransaction.commit();
		return true;
	}
		
	
	
	
	
}
