package com.ninja.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ninja.springboot.dao.UserDAO;
import com.ninja.springboot.entity.User;

@Service
public class UserServiceImplREST implements UserServiceREST {
	
	private UserDAO userDAO;
	
	@Autowired
	public UserServiceImplREST(UserDAO theUserDAO) {
		userDAO = theUserDAO;
	}

	@Override
	@Transactional
	public List<User> findAll() {
	
		return userDAO.findAll();
	}

	@Override
	@Transactional
	public User findById(int theId) {

		return userDAO.findById(theId);
	}

	@Override
	@Transactional
	public List<User> findByPhone(int phone) {
		
		return (List<User>) userDAO.findByPhone(phone);
	}

	@Override
	@Transactional
	public void save(User theUser) {
		
		userDAO.save(theUser);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
		userDAO.deleteById(theId);
	}

}
