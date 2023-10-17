package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.BookService;

public class BookSave {
public static void main(String[] args) {
	BookService bookService=new BookService();
	Book book=new Book();
	
	book.setName("XYZ");
	book.setAuthor("pqr");
	book.setStatus("issued");
	bookService.saveBook(book);
}
}
