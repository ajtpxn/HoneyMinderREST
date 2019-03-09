package com.jaloway.honeyminder.services;

import com.jaloway.honeyminder.entities.User;

public interface AuthenticationService {

	boolean checkDB(User user);

	User register(User user);

}
