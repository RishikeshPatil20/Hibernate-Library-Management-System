package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class AdminDelete {
public static void main(String[] args) {
	AdminService adminservice=new AdminService();
	
	boolean admin= adminservice.deleteAdminById(2);
	if (admin==true) {
		System.out.println("Admin deleted");
		}
		else {
			System.out.println("Admin not deleted");
			}
		}
}

