package com.jsp.library.controller;


import com.jsp.library.service.LibriainService;

public class LibriainGetAll {
public static void main(String[] args) {
	LibriainService libriainService=new LibriainService();
	
	libriainService.getAllLibrarians();
	
	
}
}
