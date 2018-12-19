package com.just.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.just.jpa.domain.User;
import com.just.jpa.domain.UserRepository;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	@PostMapping(path = "/addUser")
	public void addUser(User user){
		userRepository.save(user);
	}
	
	@RequestMapping(path = "/findUserByName")
	public User findUserByName(String name){
		return userRepository.findUserByName(name);
	}
	
	@RequestMapping(path = "/findAll")
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
}
