package com.Junit.Example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Junit.Example.Entity.User;
import com.Junit.Example.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User>getAllUser()
	{
		return userRepository.findAll();
	}
	
	public User saveUser(User user)
	{
		userRepository.save(user);
		return user;
	}
	public User getUserById(int id) {
		return userRepository.getById(id);
		
	}

	public Optional<User> getByEmailids(String email)
	{
		return userRepository.findByEmail(email);
	}

	
}
