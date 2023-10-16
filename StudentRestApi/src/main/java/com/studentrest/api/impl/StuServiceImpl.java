package com.studentrest.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentrest.api.Dao.StuDao;
import com.studentrest.api.Service.StuService;
import com.studentrest.api.entity.Student;

@Service
public class StuServiceImpl  implements StuService{

	@Autowired
	private StuDao studao;
	public List<Student> getStudent(Student stu) {
		return studao.findAll();
	}

	@Override
	public Student saveStudent(Student stu) {
	
			return studao.save(stu);
	}

	@Override
	public Student getById(int id) {
	
		return studao.getById(id); 
	}

	@Override
	public void deleteStudent(int id) {
	
		studao.deleteById(id);
	}

	@Override
	public Student updateStudent(Student stu) {
	
		return studao.save(stu);
	}

}
