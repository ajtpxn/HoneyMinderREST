package com.jaloway.honeyminder.services;

import java.util.List;

import com.jaloway.honeyminder.entities.Goal;

public interface GoalService {

	List<Goal> indexGoals();

	Goal save(Goal goal);

}
