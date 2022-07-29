package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
import com.lti.dao.AdminDao;

@Service
public class AdminSerImpl implements AdminService{
	
	@Autowired
	AdminDao dao;
	
	@Override
	public List<Admin> findAdminList() {
		// TODO Auto-generated method stub
		List<Admin> adminList= dao.findAdminList();
		return adminList;
	}
}
