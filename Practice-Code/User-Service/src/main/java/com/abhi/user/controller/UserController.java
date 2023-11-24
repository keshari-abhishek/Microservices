package com.abhi.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.user.entities.User;
import com.abhi.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User savedUser= userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}
	
	@GetMapping("/get-all")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> users= userService.getAllUser();
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
	
	@GetMapping("/by-id/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id) {
		User user= userService.getUserById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(user);
	}
}
