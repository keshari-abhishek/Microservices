package com.abhi.user.service;

import java.util.List;

import com.abhi.user.entities.User;

public interface UserService {

	User saveUser(User user);
	
	User getUserById(String id);
	
	List<User> getAllUser();
}
