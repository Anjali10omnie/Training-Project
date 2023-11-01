package com.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.user.management.Repository.UserRepository;
import com.user.management.customUser.CustomUserDetail;
import com.user.management.entity.User;

@Service
public class CustomUserDetailsService  implements UserDetailsService{

	@Autowired
	private  UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	User user=userRepo.findByEmail(email);
	if(user==null)
	{
		throw new UsernameNotFoundException("user not found");
	}
		return   new CustomUserDetail(user);
	}

	
}
