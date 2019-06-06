package com.jaloway.honeyminder.services;

import com.jaloway.honeyminder.entities.User;

public interface UserService {

	User findByUsername(String username);

}
