package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class AdminValidate {
public static void main(String[] args) {
	AdminService adminService = new AdminService();

	boolean res = adminService.validateAdmin(1, "shraddha", "cdba");

	if (res) {
		System.out.println("Validate Successfully");
	}

	else {
		System.out.println("validate unsucessfully");
	}
}
}

