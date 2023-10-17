package com.jsp.library.controller;

import com.jsp.library.service.LibriainService;

public class ReturnBook {
public static void main(String[] args) {
	LibriainService libriainService=new LibriainService();
	libriainService.returnBookById(2);
}
}
