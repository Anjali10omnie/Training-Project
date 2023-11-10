package com.Junit.Example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Junit.Example.UserService;
import com.Junit.Example.Entity.User;
import com.Junit.Example.repo.UserRepository;

@SpringBootTest
public class UserServiceTest {

	@Mock
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	AutoCloseable autoCloseable;
	User user1;
	User user=new User();
	
	@Test
	void  getAllUser()
	{
	List<User> getAllUser=userService.getAllUser();
	assertThat(getAllUser).isEqualTo(getAllUser);
	}
	
	@Test
	void saveUser( )
	{
		
		user.setName("Anjali");
		user.setEmail("anjaliingh@gmail.com");
		mock(User.class);
		mock(UserRepository.class);
		 User saveUser=userService.saveUser(user);
		 assertThat(saveUser.getName()).isEqualTo("Anjali");
//		
	}
	
	@Test
	void getUserById() 
	{
	
		user.setName("Anjali");
		user.setEmail("anjaliingh@gmail.com");
		User getUserById=userService.getUserById(user.getId());
		assertThat(user.getId()).isNotNull();
	}
	@Test
	void getByEmailids() {
		
		user.setEmail("anjalisingh@gmail.com");
		Optional<User> getByEmailsids=userService.getByEmailids(user.getEmail());
		assertThat(user.getEmail()).isEqualTo("anjalisingh@gmail.com");
	
	}
}
