package com.ninja.springboot.dao;

import java.util.List;

import com.ninja.springboot.entity.User;

public interface UserDAO {
	
	public List<User> findAll();
	
	public User findById(int theId);
	
	public List<User> findByPhone(int phone);
	
	public void save(User theEmployee);
	
	public void deleteById(int theId);

}
