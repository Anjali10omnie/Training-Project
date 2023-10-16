package com.Students.crud.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.Students.crud.Entity.Student;
import com.Students.crud.domain.Response;

public interface StudentDao extends JpaRepository<Student, Integer> {

	void save(Response student);

	

	

	


	

}
