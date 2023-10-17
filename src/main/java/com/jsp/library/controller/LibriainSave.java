package com.jsp.library.controller;

import com.jsp.library.dto.Libriain;
import com.jsp.library.service.LibriainService;

public class LibriainSave {
public static void main(String[] args) {
	LibriainService libriainservice = new LibriainService();
	Libriain libriain = new Libriain();
	libriain.setName("shivani");
	libriain.setStatus("Unathorized");
	
	libriainservice.saveLibriain(libriain);
}
}
