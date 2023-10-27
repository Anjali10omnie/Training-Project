package com.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;

import com.user.management.Repository.UserRepository;
import com.user.management.entity.User;

public interface UserServices {
	public User createUser(User user);
	
	
 }

	

