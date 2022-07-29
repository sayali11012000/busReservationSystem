package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.User;
import com.lti.service.UserService;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user-api")
public class UserController {
	
	@Autowired
	UserService service;
	
	// Add new Users.
	//http://localhost:8090/user-api/adduser
	@PostMapping("/adduser")
	public int addUser(@RequestBody User a)
	{
		int UserId=service.addUser(a);
		return UserId;
	}
	
	// update the details or put the details
	//http://localhost:8090/user-api/updateuser
		@PutMapping(path="/updateuser",produces="application/json")
		public boolean updateUser(@RequestBody User a)
		{
			 boolean response=service.updateUser(a);
			 return response;
		}
		
		// get all_users
		// http://loclhost:8090/user-api/getuserlist
		@GetMapping("/getuserlist")
		public List<User> findUserList() {
			System.out.println("Controller");
			List<User> userList= service.findUserList();
			return userList;
		}
		
		// find user by User_id
		//http://localhost:8090/user-api/user
		@GetMapping(path="/user/{user_Id}")
		public User getUserById(@PathVariable("user_Id")int user_Id) {
			User e=service.findUserById(user_Id);
			return e;
		}
		
		// updating contact based on the id 
		//http://localhost:8090/user-api/updateUser
		@PutMapping("/updateUser/{user_Id}/{contact}")
		public boolean updateUser(@PathVariable("user_Id") int user_Id,@PathVariable("contact") int contact) throws Exception
		{
			 boolean response=service.updateUser(user_Id,contact);
			return response;
		}	
		
	
}
