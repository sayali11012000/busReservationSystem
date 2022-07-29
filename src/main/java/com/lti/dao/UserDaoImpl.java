package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.User;


@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addUser(User a) {
		System.out.println(" Inside Dao method");		
		em.persist(a);	
		return a.getUser_Id();
	}

	@Override
	@Transactional
	public boolean updateUser(User a) {
		em.merge(a);
		return true;
	}
	
	
	public List<User> findUserList() {
		
		Query qry=em.createQuery("Select u from User u");
//		System.out.println();
		List<User> userList=qry.getResultList();
		System.out.println(userList);
		return userList;
	}

	@Override
	public User findUserById(int user_Id) {
		System.out.println("Dao layer find by id");
	    return em.find(User.class, user_Id);
	}
	
	@Override
	@Transactional
	public boolean updateUser(int user_Id,int contact) {
		
		Query qry= em.createQuery("update User a SET a.contact=:cont where a.user_Id=:id ");
		qry.setParameter("cont",contact);
		qry.setParameter("id",user_Id);
		qry.executeUpdate();		
		return true;
	}

}
