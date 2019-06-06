package com.jaloway.honeyminder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaloway.honeyminder.entities.User;
import com.jaloway.honeyminder.services.UserService;

@RestController
@RequestMapping(path = "api")
@CrossOrigin({ "*", "http://localhost:4200" })
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user/{username}")
	public User findUser(@PathVariable("username") String username) {
		return userService.findByUsername(username);
	}

}
