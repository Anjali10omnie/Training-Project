package com.product.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.Entity.Student;
import com.product.api.service.StudentService;

@RestController
public class StudentController {
	
		@Autowired
	    private StudentService studentService;

	    @PostMapping("/Student")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.createStudent(student);
	    }

	    @GetMapping("/student/{id}")
	    public Student getStudent(@PathVariable int id) {
	        return studentService.getStudent(id);
	    }

}
