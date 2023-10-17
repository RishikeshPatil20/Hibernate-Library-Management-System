package com.jsp.library.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Libriain;

public class TestMapping {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();

    Libriain libriain = new Libriain();
    libriain.setName("ABC");
    libriain.setStatus("Authorised");
	
	Admin admin=new Admin();
	admin.setUsername("Shardul");
	admin.setPassword("12345");

	libriain.setAdmin(admin);
	
	
	entityTransaction.begin();
	entityManager.persist(admin);
	entityManager.persist(libriain);
	entityTransaction.commit();
}
}
