package com.jsp.library.controller;

import com.jsp.library.service.LibriainService;

public class IssueBook {
public static void main(String[] args) {
	LibriainService libriainService=new LibriainService();
	boolean res=libriainService.issueBookById(2, 2, 4);
	System.out.println(res);
}
}
