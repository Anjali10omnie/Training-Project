package com.product.api.service;

import com.product.api.Entity.Student;

public interface StudentService {
	public Student createStudent(Student student);
	public Student getStudent(int id);

}
