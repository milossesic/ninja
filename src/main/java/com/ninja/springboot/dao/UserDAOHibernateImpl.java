package com.ninja.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ninja.springboot.entity.User;

@Repository
public class UserDAOHibernateImpl implements UserDAO{

	private EntityManager entityManager;
	
	@Autowired
	UserDAOHibernateImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	public List<User> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> theQuery = currentSession.createQuery("from User",User.class);
		List<User> users = theQuery.getResultList();
		
		return users;
	}
	
	public List<User> findByPhone(int phone) {

		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> theQuery = currentSession.createQuery("select u from User u where u.phone= :phone",User.class);
		theQuery.setParameter("phone", phone);
		List<User> users = theQuery.getResultList();
		
		return users;
	}

	public User findById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);
		User theUser = currentSession.get(User.class, theId);
			
		return theUser;
	}

	public void save(User theUser) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theUser);
		
	}

	public void deleteById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from User where id= :userId");
		theQuery.setParameter("userId", theId);
		theQuery.executeUpdate();
		
	}

}
