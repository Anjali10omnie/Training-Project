package com.Junit.Example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Junit.Example.UserService;
import com.Junit.Example.Entity.User;
import com.Junit.Example.repo.UserRepository;

@RestController
public class MyController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		return this.userRepository.findAll();                   
	}
	
	@PostMapping("/createUser")
	public User saveUser(@RequestBody User user)
	{
		return this.userRepository.save(user);
	}
	@GetMapping("user/{email}")
	public Optional<User> findByEmail(@PathVariable("email") String  email)
	{
		return this.userService.getByEmailids(email);
	}
	
//	@GetMapping("/user/{id}")
//	public Optional<User> findById(@PathVariable int id)
//	{
//		return this.userRepository.findById(id);
//	}
}
