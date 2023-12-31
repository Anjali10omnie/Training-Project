package com.jwt.Example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.Example.Repo.UserRepository;
import com.jwt.Example.entity.User;

@Service
public class CustomUserDetailsService  implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user=	userRepo.findByEmail(username).orElseThrow(()->new RuntimeException("User not found"));
		
		//load user from database
		return user;
	}

}
