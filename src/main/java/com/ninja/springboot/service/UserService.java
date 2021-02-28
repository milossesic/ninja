package com.ninja.springboot.service;

import java.util.List;

import com.ninja.springboot.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(int theId);
	
	public User findByPhone(int phone);
	
	public void save(User theEmployee);
	
	public void deleteById(int theId);

}
