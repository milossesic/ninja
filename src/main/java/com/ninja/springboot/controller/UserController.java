package com.ninja.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ninja.springboot.entity.User;
import com.ninja.springboot.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService theUserService) {
		userService = theUserService;
	}

	/*private List<User> theUsers;
	
	@PostConstruct
	private void loadDate() {
		
		Date date = new java.sql.Date(2017-10-10);
		Time timestart = new Time(161616);
		Time timeend = new Time(171717);
		
		
		User user1 = new User(1,date,"Cvetko1",555666,"cveta",timestart,timeend,5,55,"ljubica","vlajko");
		User user2 = new User(2,date,"Cvetko2",555666,"cveta",timestart,timeend,5,55,"ljubica","vlajko");
		User user3 = new User(3,date,"Cvetko3",555666,"cveta",timestart,timeend,5,55,"ljubica","vlajko");
		
		theUsers = new ArrayList<>();
		theUsers.add(user1);
		theUsers.add(user2);
		theUsers.add(user3);
		
		
		
	}*/
	
	@GetMapping("/list")
		public String listUsers(Model theModel) {
			List<User> theUsers = userService.findAll();
			theModel.addAttribute("users", theUsers);
			return "list-users";
		}
	
}
	

