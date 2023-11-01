package com.user.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	

	@GetMapping("/main")
	public String Base()
	{
		return "main";
		
	}
	
}
