package com.userapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapp.model.UserResponse;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public UserResponse sayHello() {
		UserResponse userResponse =  new UserResponse();
		userResponse.setUserName("Ajay");
		userResponse.setUserMessage("Hello..");
		return userResponse;
	}

}
