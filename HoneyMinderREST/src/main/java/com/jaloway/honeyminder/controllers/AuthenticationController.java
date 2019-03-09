package com.jaloway.honeyminder.controllers;


import java.security.Principal;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jaloway.honeyminder.entities.User;
import com.jaloway.honeyminder.services.AuthenticationService;

@RestController
@CrossOrigin({ "*", "http://localhost:4200" })
public class AuthenticationController {

	@Autowired
	AuthenticationService authService;

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public User register(@RequestBody User user, HttpServletResponse res) {
		if (user == null) {
			res.setStatus(400);
			return null;
		}
		else {
			boolean usernameTaken = authService.checkDB(user);
			if (usernameTaken) {
				res.setStatus(400);
				return null;
			}
			else {
				User newUser = authService.register(user);
				return newUser;
			}
		}
	}

	@RequestMapping(path = "/authenticate", method = RequestMethod.GET)
	public Principal authenticate(Principal principal) {
		System.out.println("Auth**");
		return principal;
	}

}
