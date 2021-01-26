package com.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;

@RestController
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/")
	public void getUser() {
		logger.info("Hello Controller");
	}
	
	@PostMapping(path="/addUser", consumes = "application/json", produces = "application/json")
	public User getModifiedUser(@RequestBody User user) {
		logger.info("User Details recieved");
		System.out.println(user);
		return user;
	}
}
