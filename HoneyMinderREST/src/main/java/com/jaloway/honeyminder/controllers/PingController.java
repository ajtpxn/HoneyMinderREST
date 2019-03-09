package com.jaloway.honeyminder.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({ "*", "http://localhost:4200" })
public class PingController {
	
	@GetMapping("/ping")
	public String ping() {
		System.out.println("Ping");
		System.out.println("Pong");
		return "pong";
	}

}
