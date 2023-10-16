package com.studentrest.api.Service;

import java.util.List;

import com.studentrest.api.entity.Student;

public interface StuService {
	
	
	 public	List<Student> getStudent(Student stu);
	 public Student saveStudent(Student emp);
	 public Student  getById(int id) ;
	 public void deleteStudent(int id);
	 public Student updateStudent(Student stu);
		
		

}
