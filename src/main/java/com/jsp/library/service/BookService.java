package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.BookDao;
import com.jsp.library.dto.Book;

public class BookService {

	BookDao bookDao= new BookDao();
	
	public Book saveBook(Book book) {
		return bookDao.saveBook(book);
	}
	
	public Book updateBookNameById(int id,String name) {
		return bookDao.updateBookNameById(id, name);
	}
	
	public boolean updateBookStatusById(int id,String Status) {
		return bookDao.updateBookStatusById(id, Status);
	}
	
	public boolean deleteBookById(int id) {
		return bookDao.deleteBookById(id);
	}
	
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}
	
	public List<Book> gettAllBook(){
		return bookDao.gettAllBook();
	}
	
	
}
