package com.user.management.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.management.entity.User;
import com.user.management.service.UserServices;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserServices userServices;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	@Autowired
//	UserDetailsService userDetailsService;
	

	@GetMapping("/base")
	public String Base()
	{
		return "Base";
		
	}
	
//	@GetMapping("/")
//	public String Login()
//	{
//		return "Login";
//	}
	
	@GetMapping("/Logout")
	public String Logout()
	{
		return "Logout";
	}
	
	@GetMapping("/Registration")
	public String Registration( @Valid Model model)
	{
		model.addAttribute("user", new User());
		return "Registration";
	}
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute ("user") User user, Model model)
	{		
		userServices.createUser(user);
		 model.addAttribute("message", "User registered successfully");
		return "Registration";
		
//	}
//	@GetMapping("/getUser")
//	public String findByUsername(// @ModelAttribute User user, Model model) {
////		userServices.findByUsername(user);
////		if(user!=null)
////		{
////			return "home";
////		}
//		return "home";
//	
//	}
		
		
	}
	
//	@GetMapping("/Login")
//	@ResponseBody
//	public String LoginProcess(@RequestParam("username") String Username,
//			@RequestParam("Username") String password)
//	{
//		User dbUser=userServices.findByUsername(Username);
//		Boolean isPwd=(BCrypt.checkpw(password,dbUser.getPassword()));
//		if( isPwd==true)
//		{
//			return "home" + dbUser.getUsername();
//		}
//		else
//			return"failed to login";
//	}

//	@GetMapping("/Login")
//	public String LoginProcess()
//	{
//		return "home";
//	}
	
//	@GetMapping("/logins")
//    public String showLoginForm() {
//        return "Login";
//    }
 
//    @PostMapping("/logins")
//    public String loginUser(@RequestParam String userName, @RequestParam String password,User users) {
//        User user = userServices.(userName);
//        if (user != null && user.getPassword().equals(password)) {
//            // Successful login
//            return "user";
//        } else {
//            // Invalid credentials
//        	if (!password.equals(user.getPassword())) {
//        		throw new UsernameNotFoundException("password does not exist");
//			}
//        	if(!userName.equals(user.getUserName())){
//        		throw new UsernameNotFoundException("userName does not exist");
//        	}
//        	else {
//        		return "Login";
//			}
//        }
}

	
	

