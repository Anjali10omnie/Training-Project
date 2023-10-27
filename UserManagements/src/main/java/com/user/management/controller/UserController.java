package com.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.user.management.entity.User;
import com.user.management.service.UserServices;

@Controller
public class UserController {
	
	@Autowired
	private UserServices userServices;
	
	
	@GetMapping("/base")
	public String Base()
	{
		return "Base";
		
	}
	
	@GetMapping("/")
	public String Login()
	{
		return "Login";
	}
	
	@GetMapping("/Logout")
	public String Logout()
	{
		return "Logout";
	}
	
	@GetMapping("/Registration")
	public String Registration()
	{
		return "Registration";
	}
		
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user)
	{
		User user1=userServices.createUser(user);
		return "redirect:/Registration";
	
	
	}
}
