package com.Junit.Example.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.Junit.Example.Entity.User;



@SpringBootTest
public class UserRepo {
	
	@Autowired
	private UserRepository userRepository;
	
	//Test Cases of Sucess find by emailId
//	
	@Test
	void testfindByEmail()
	{
	User user=new User();
	user.setEmail("Singh@gmail.com");
	assertThat(user.getEmail()).isEqualTo("Singh@gmail.com");
	}
	@Test
	void testnotfindByEmail()
	{
	User user=new User();
	user.setEmail("anjali@gmail.com");
	assertThat(user.getEmail()).isNotNull();
	}

}
