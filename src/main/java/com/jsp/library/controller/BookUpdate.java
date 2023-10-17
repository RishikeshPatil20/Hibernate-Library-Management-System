package com.jsp.library.controller;

import com.jsp.library.service.BookService;

public class BookUpdate {
public static void main(String[] args) {
	BookService bookService=new BookService();
	if(bookService.updateBookNameById(2, "maths") != null) {
		System.out.println("updated");
	}
	else {
		System.out.println("not");
	}
}
}
