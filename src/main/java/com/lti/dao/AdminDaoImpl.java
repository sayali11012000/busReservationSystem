package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;


@Repository
public class AdminDaoImpl implements AdminDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Admin> findAdminList() {
		
		Query qry=em.createQuery("Select al.security_id,al.passcode from Admin al");
//		System.out.println();
		List<Admin> adminList=qry.getResultList();
		System.out.println(adminList);
		return adminList;
	}
}
