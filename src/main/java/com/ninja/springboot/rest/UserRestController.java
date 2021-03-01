package com.ninja.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninja.springboot.entity.User;
import com.ninja.springboot.service.UserService;
import com.ninja.springboot.service.UserServiceREST;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	private UserServiceREST userServiceREST;
	
	@Autowired
	public UserRestController(UserServiceREST theUserService) {
		userServiceREST = theUserService;
	}
	
	@GetMapping("/users")
	public List<User> findAll(){
		return userServiceREST.findAll();
	}
	
	@GetMapping("/users/{phone}")
	public List<User> getUserByPhone(@PathVariable int phone) {
		List<User> theUser = (List<User>) userServiceREST.findByPhone(phone);
		if(theUser == null) {
			throw new RuntimeException("User not found with "+phone+" phone number");
		}
		return theUser;
		
	}

}
