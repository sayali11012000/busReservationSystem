//package com.lti.dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.lti.beans.Bus;
//
//
//@Repository
//public class BusDaoImpl implements BusDao{
//
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	
//	
//	@Override
//	@Transactional
//	public int addBus(Bus b) {
//		em.persist(b);
//		return 0;
//	}
//
//	@Override
//	public Bus searchBus() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean updateBus() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
