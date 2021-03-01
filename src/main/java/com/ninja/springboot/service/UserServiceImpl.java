package com.ninja.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninja.springboot.dao.UserRepository;
import com.ninja.springboot.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	

	@Autowired
	public UserServiceImpl(UserRepository theUserRepository) {
		userRepository = theUserRepository;
	}
	
	@Override
	public List<User> findAll() {

		return userRepository.findAllByOrderByDateDesc();
	}
	
	@Override
	public User findByPhone(int phone) {
		User theUser = null;
		User result = userRepository.findByPhone(phone);
		if(result != null) {
			theUser = result;
		} else {
			throw new RuntimeException("Did not find anything");
		}
		
		return theUser;
	}


	@Override
	public User findById(int theId) {

		Optional<User> result = userRepository.findById(theId);
		User theUser = null;
		
		if(result.isPresent()) {
			theUser = result.get();
		} else {
			throw new RuntimeException("Did not find anything");
		}
		
		return theUser;
	}

	@Override
	public void save(User theUser) {
		userRepository.save(theUser);
		
	}

	@Override
	public void deleteById(int theId) {
		userRepository.deleteById(theId);
		
	}

	
}
