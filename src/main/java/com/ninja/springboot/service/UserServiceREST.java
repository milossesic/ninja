package com.ninja.springboot.service;

import java.util.List;

import com.ninja.springboot.entity.User;

public interface UserServiceREST {
	
	public List<User> findAll();
	
	public User findById(int theId);
	
	public List<User> findByPhone(int phone);
	
	public void save(User theUser);
	
	public void deleteById(int theId);

}
