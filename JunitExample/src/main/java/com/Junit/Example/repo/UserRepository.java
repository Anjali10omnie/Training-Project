package com.Junit.Example.repo;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Junit.Example.Entity.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Integer> {
 //Boolean isUserExistById(int id);
 
	public Optional<User> findByEmail(String email);


}
