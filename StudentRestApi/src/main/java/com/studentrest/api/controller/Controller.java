package com.studentrest.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentrest.api.Service.StuService;
import com.studentrest.api.entity.Student;

import jakarta.validation.Valid;

@RestController
public class Controller {
	
	@Autowired
	private StuService stuservice;
	
	@GetMapping("/student")
	public List <Student> getStudent( Student stu) 
	{
		return this.stuservice.getStudent(stu);
		
	}
		
	@PostMapping("/student")
	public Student saveStudent (@RequestBody @Valid Student  stu)
	{
		return this.stuservice.saveStudent(stu);
		
	}
	

	@GetMapping("/stu/{id}")
	public Student getById(@Valid @PathVariable("id") int id)
	{
	 return this.stuservice.getById(id)	;
	}
	
	@DeleteMapping("/stu/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return "Data deleted sucessufully ";
	}
	
	
	@PutMapping("/stu/{id}")
	public Student updateStudent( @PathVariable int id,@Valid @RequestBody Student stu  )
	{
		stu.setId(id);
		return this.stuservice.updateStudent(stu);
	}

	
	}
	

