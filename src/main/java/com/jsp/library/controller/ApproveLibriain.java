package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class ApproveLibriain {
public static void main(String[] args) {
	AdminService adminservice= new AdminService();
	boolean res=adminservice.approveLibriainById(2, 1);
	System.out.println(res);
}
}
