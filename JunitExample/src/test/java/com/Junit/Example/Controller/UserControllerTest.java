package com.Junit.Example.Controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.Junit.Example.UserService;
import com.Junit.Example.Entity.User;


@SpringBootTest
public class UserControllerTest {
	
	@Autowired
	private UserService userService;
	
	
	
	 	@Test
	    public void testSaveUser() {
	        User user = new User();
//	        user.setName("Sundram");
//			user.setEmail("sundram@gmail.com");
//	      userService.saveUser(user);
	      
	      assertThat(user.getId()).isGreaterThan(0);
      
	       
	    }

}
