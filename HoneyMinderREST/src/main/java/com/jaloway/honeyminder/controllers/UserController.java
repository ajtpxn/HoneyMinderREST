package com.jaloway.honeyminder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaloway.honeyminder.data.UserRepository;
import com.jaloway.honeyminder.entities.User;

@RestController
@RequestMapping(path = "api")
@CrossOrigin({ "*", "http://localhost:4200" })
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/user/{username}")
	public User findUser(@PathVariable("username") String username) {
		User user = userRepo.findByUsername(username);
		user.setPassword(null);
		return user;
	}

}
