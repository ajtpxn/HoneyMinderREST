package com.jaloway.honeyminder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jaloway.honeyminder.data.GoalRepo;
import com.jaloway.honeyminder.entities.Goal;

@Service
public class GoalServiceImplementation implements GoalService {
	
	@Autowired
	GoalRepo goalRepo;
	
	@Override
	public List<Goal> indexGoals() {
		return goalRepo.findAll();
	}

	@Override
	public Goal save(Goal goal) {
		return goalRepo.saveAndFlush(goal);
	}

}
