package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.service.AdminService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin-api")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	// http://localhost:8090/admin-api/getadminlist
	@GetMapping("/getadminlist")
	public List<Admin> findAdminList() {
		System.out.println("Controller");
		List<Admin> adminList= service.findAdminList();
		return adminList;
	}
	

}
