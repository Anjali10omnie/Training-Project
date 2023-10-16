package com.Students.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.Students.crud.Entity.Student;
import com.Students.crud.domain.Response;

public interface StudentService {
	
	public ResponseEntity<List<Student>> getStudent();
	public ResponseEntity<Response> getById(int id);

	public ResponseEntity<Response> updateStudent(int id);
	public void deleteStudent(int id);
	public ResponseEntity<Response> getAllStudent();
	public ResponseEntity<Response> getAllStudent1();

	ResponseEntity<Response> addStudent(Response student);
	

}
