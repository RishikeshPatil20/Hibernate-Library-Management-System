package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.library.dto.Book;

public class BookDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Rishi");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//TO SAVE
	public Book saveBook(Book book) {
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		
		return book;
	}
	
	public Book updateBookNameById(int id,String name) {
		Book book=entityManager.find(Book.class, id);
		book.setName(name);
		
			entityTransaction.begin();
			entityManager.merge(book);
			entityTransaction.commit();
		
		return book;
		
		}
	
	public boolean updateBookStatusById(int id,String Status) {
		Book book=entityManager.find(Book.class, id);
		book.setStatus(Status);
		
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return true;
	}
	
	
	// TO DELETE BY ID
			public boolean deleteBookById(int id) {
				Book book = entityManager.find(Book.class,id);
				entityTransaction.begin();
				   entityManager.remove(book);
				   entityTransaction.commit();
				return true;
			}
	
			//TO GET ADMIN ID
			public Book getBookById(int id) {
			Book book=entityManager.find(Book.class,id);	
				return book;
			}
				
			//TO GET ALL DETAILS OF ADMIN
			public List<Book> gettAllBook(){
				String sql="SELECT b FROM Book b";
				Query query=entityManager.createQuery(sql);
				List<Book> books= query.getResultList();
				return books;
			
			}	
			//TO ISSUE THE BOOK
			public boolean issue(Book book) {
				entityTransaction.begin();
				entityManager.merge(book);
				entityTransaction.commit();
				return true;
			}
			
			//TO RETURN THE BOOK
			public boolean Return(Book book) {
				entityTransaction.begin();
				entityManager.merge(book);
				entityTransaction.commit();
				return true;
			}
			//TO REQUEST THE BOOK
			public boolean request(Book book) {
				entityTransaction.begin();
				entityManager.merge(book);
				entityTransaction.commit();
				return true;
			}
}
