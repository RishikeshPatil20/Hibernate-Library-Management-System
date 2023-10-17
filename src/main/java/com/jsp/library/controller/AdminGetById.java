package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class AdminGetById {
public static void main(String[] args) {
	AdminService adminservice=new AdminService();
	Admin admin=adminservice.getAdminById(1);
	if(admin!=null) {
	System.out.println(admin.getUsername());
	System.out.println(admin.getPassword());
	}
	else {
		System.out.println("Incorrect Id");
	}

	}
}

