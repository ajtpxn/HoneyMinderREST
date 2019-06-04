package com.jaloway.honeyminder.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jaloway.honeyminder.entities.User;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {
	
	@Autowired
	UserRepository userRepo;

	
	@Test
	@DisplayName("Test getOne. Should return brandon.")
	void test2() {
		User user = userRepo.findById(1).get();
		assertEquals("brandon", user.getUsername());
	}
	
	@Test
	@DisplayName("Test findByUsername. Should return 1.")
	void test1() {
		User user = userRepo.findByUsername("brandon");
		assertEquals(1, user.getId());
	}

}
