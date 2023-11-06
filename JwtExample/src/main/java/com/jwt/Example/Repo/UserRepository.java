package com.jwt.Example.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.Example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
public Optional <User>findByEmail(String email);
}
