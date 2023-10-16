package com.Students.crud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Students.crud.Entity.Student;
import com.Students.crud.domain.Response;
import com.Students.crud.service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	private StudentService StuService;
	
	@GetMapping("/stu")
	public ResponseEntity<List<Student>> getStudent()
	{
			return this.StuService.getStudent();
	
	
	}
	
	@GetMapping("/stu/{id}")
	public ResponseEntity<Response> getById(@PathVariable("id") int id)
	{
	 return this.StuService.getById(id)	;
	}
	
	@PostMapping("/stu")
	public ResponseEntity<Response> addStudent(@RequestBody Response<Student> student)
	{
		return this.StuService.addStudent(student);
		
	}
	
	@PutMapping("/stu/{id}")
	public ResponseEntity<Response> updateStudent(@PathVariable int id)
	{
		return this.StuService.updateStudent(id);
	}
	
	@DeleteMapping("/stu/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		StuService.deleteStudent(id);
		
		return"Student Details Sucessfully Deleted";
	}


	@GetMapping("/stus")
	public ResponseEntity<Response>getAllStudent()
	{
		return this.StuService.getAllStudent();


	}

	@GetMapping("/stus1")
	public ResponseEntity<Response>getAllStudent1()
	{
		return this.StuService.getAllStudent1();


	}
}