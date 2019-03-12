package com.jaloway.honeyminder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaloway.honeyminder.data.GoalRepo;
import com.jaloway.honeyminder.entities.Goal;

@RestController
@RequestMapping(path = "api")
@CrossOrigin({ "*", "http://localhost:4200" })
public class GoalController {
	
	@Autowired
	GoalRepo goalRepo;
	
	@GetMapping("/goals")
	public List<Goal> indexGoals() {
		System.out.println("********** test **********");
		return goalRepo.findAll();
	}
	
	@PostMapping("/goals")
	public Goal createGoal(@RequestBody Goal goal) {
		return goalRepo.save(goal);
	}

}
