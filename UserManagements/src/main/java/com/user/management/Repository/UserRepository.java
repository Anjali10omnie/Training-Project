package com.user.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.management.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
