package com.jwt.Example.controller;

import java.security.Principal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.Example.Service.UserService;

import com.jwt.Example.entity.User;

@RestController
@RequestMapping("/home")
public class UserController {
	@Autowired
	private UserService userSer;
	
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		return userSer.getUser();
	}
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal)
	{
		return principal.getName();
	}
	

}
