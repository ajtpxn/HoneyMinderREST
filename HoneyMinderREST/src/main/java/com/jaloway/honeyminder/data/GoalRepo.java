package com.jaloway.honeyminder.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaloway.honeyminder.entities.Goal;

public interface GoalRepo extends JpaRepository<Goal, Integer> {
	
	Goal findByName(String name);

}
