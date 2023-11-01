package com.user.management.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.management.Repository.UserRepository;
import com.user.management.entity.User;


@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Autowired
	private UserRepository userRepo;
	
	
	public User createUser(User user) {
	user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//		String pwd= BCrypt.hashpw(user.getPassword(),BCrypt.gensalt(12));
//		user.setPassword(pwd);
		return  userRepo.save(user);
	}


	


//	@Override
//	public User findByUsername(User user) {
//		
//		return userRepo.findByUsername(user);
//	}



//	@Override
//	public User save(UserDto userDto) {
//		User user=new User(0, userDto.getUsername(),userDto.getEmail(),userDto.getRole(), null);
//		return userRepo.save(user);
//	}

}