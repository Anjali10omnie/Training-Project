package com.user.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@NotEmpty
	@Size(min=4,max=15,message="Username must be min of 4 characters ")
	private String Username;
	@NotEmpty
	@Email(message="Email Address not valid")
	private String email;
	
	@NotEmpty
	@Size(min=8,max=16,message="password must be min of 8 chars and max of 16")
	private String password;
	

}
