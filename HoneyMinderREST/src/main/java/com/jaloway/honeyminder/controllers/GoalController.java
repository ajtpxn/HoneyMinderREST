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
import com.jaloway.honeyminder.services.GoalService;

@RestController
@RequestMapping(path = "api")
@CrossOrigin({ "*", "http://localhost:4200" })
public class GoalController {
	
	@Autowired
	GoalService goalService;
	
	@GetMapping("/goals")
	public List<Goal> indexGoals() {
		return goalService.indexGoals();
	}
	
	@PostMapping("/goals")
	public Goal createGoal(@RequestBody Goal goal) {
		return goalService.save(goal);
	}

}
