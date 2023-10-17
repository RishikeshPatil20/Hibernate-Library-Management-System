package com.jsp.library.controller;

import com.jsp.library.service.LibriainService;

public class LibriainGetById {
public static void main(String[] args) {
	
	LibriainService libriainService=new LibriainService();
	libriainService.getLibrarianById(1);
	
}
}
