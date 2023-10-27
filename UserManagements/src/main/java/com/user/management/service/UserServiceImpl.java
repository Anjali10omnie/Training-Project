package com.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.management.Repository.UserRepository;
import com.user.management.entity.User;

@Service
public class UserServiceImpl implements UserServices {

	
	@Autowired
	private UserRepository userRepo;
	
	public User createUser(User user) {
		
		return  userRepo.save(user);
	}

}
