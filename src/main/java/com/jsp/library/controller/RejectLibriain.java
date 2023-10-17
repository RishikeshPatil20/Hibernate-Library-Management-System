package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class RejectLibriain {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
	boolean res=adminService.rejectLibriainById(1, 1);
	System.out.println(res);
}
}
