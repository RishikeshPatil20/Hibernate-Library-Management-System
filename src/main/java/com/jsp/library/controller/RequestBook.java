package com.jsp.library.controller;

import com.jsp.library.service.LibriainService;

public class RequestBook {
public static void main(String[] args) {
	LibriainService libriainService=new LibriainService();
	boolean res=libriainService.RequestBookById(2, 2, 4);
	System.out.println(res);
}
}
