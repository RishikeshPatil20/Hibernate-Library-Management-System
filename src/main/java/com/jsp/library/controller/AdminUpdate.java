package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class AdminUpdate {

	
	public static void main(String[] args) {
		
		AdminService adminservice=new AdminService();
		adminservice.updateAdminUserNameByIdPass(1, "shraddha");
		
		

	}
}
