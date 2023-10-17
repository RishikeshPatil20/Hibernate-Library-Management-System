package com.jsp.library.controller;

import com.jsp.library.service.BookService;

public class BookDelete {
public static void main(String[] args) {
	BookService bookService=new BookService();
	boolean book= bookService.deleteBookById(4);
	if (book==true) {
		System.out.println("book deleted");
		}
		else {
			System.out.println("book not deleted");
			}
		}
}

