package com.product.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.Dao.StudentDao;
import com.product.api.Entity.Student;
import com.product.api.service.StudentService;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Override
	public Student createStudent(Student student) {
	
		 studentDao.save(student);
		 return student;
	}

	@Override
	public Student getStudent(int id) {
	
		return studentDao.getById(id) ;
	}

}
