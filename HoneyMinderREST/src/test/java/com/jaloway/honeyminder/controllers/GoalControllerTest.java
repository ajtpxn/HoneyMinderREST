package com.jaloway.honeyminder.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jaloway.honeyminder.data.GoalRepo;
import com.jaloway.honeyminder.entities.Goal;

@RunWith(SpringRunner.class)
@SpringBootTest
class GoalControllerTest {
	
	@Autowired
	GoalController goalCon;
	GoalRepo goalRepo;

	@Test
	@DisplayName("Test Controller")
	void test1() {
		Goal goal = new Goal();
		LocalDateTime date = LocalDateTime.now();
		String name = date.toString();
		goal.setName(name);
		goal.setUserId(1);
		goalCon.createGoal(goal);
		Goal actual = goalRepo.findByName(name);
		assertEquals(name, actual.getName());
	}

}
