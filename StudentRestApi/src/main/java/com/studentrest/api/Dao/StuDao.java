package com.studentrest.api.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentrest.api.entity.Student;

public interface StuDao extends JpaRepository<Student, Integer> {

}
