package com.jaloway.honeyminder.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.jaloway.honeyminder.data.UserRepository;
import com.jaloway.honeyminder.entities.User;

public class UserServiceImplementation implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public User findByUsername(String username) {
		User user = userRepo.findByUsername(username);
		user.setPassword(null);
		return user;
	}

}
