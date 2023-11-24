package com.abhi.user.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.user.entities.User;
import com.abhi.user.exception.ResourceNotFoundException;
import com.abhi.user.repositories.UserRepository;
import com.abhi.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId=UUID.randomUUID().toString();
		user.setId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found with given id : "+id));
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
