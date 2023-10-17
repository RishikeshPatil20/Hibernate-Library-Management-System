package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;



public class AdminGetAll {

	public static void main(String[] args) {
		AdminService adminservice= new AdminService();
		List<Admin> admins=adminservice.getAllAdmin();
		
		for(Admin a : admins) {
			System.out.println("=========================================");
			System.out.println(a.getId());
			System.out.println(a.getUsername());
			System.out.println(a.getPassword());
			System.out.println("=========================================");
		}
		}
}
