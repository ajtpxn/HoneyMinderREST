package com.jaloway.honeyminder.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaloway.honeyminder.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
