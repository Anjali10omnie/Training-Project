package com.product.api.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.api.Entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
