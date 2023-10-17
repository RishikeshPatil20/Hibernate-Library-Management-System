package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Libriain;
import com.jsp.library.service.AdminService;

public class ViewUnapprovedLibriains {
public static void main(String[] args) {
	
	AdminService adminService= new AdminService();
	
	List<Libriain> libriains=adminService.viewAllUnapprovedLibriains();
	
	for(Libriain l : libriains) {
		System.out.println("==========================");
		System.out.println(l.getId());
		System.out.println(l.getName());
		System.out.println(l.getStatus());
		System.out.println("===========================");
	}
}
}
