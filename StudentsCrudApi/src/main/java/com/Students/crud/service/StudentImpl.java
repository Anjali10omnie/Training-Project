package com.Students.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.Students.crud.Entity.Student;
import com.Students.crud.dao.StudentDao;
import com.Students.crud.domain.Response;

@Service
public  class StudentImpl  implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	// Get Student Data
	public ResponseEntity<List<Student>> getStudent() {
		Response res11=new Response();
			List<Student>student=new ArrayList<Student>();
	studentDao.findAll().forEach(student::add);
	if(student.isEmpty())
	{
		res11.setStatus("00");
		res11.setMessage("Data not present here");
		
		
		
	}
	else
	{
		res11.setStatus("111");
		res11.setMessage("Data is present");
		
	}
		return new ResponseEntity<List<Student>>(student,HttpStatus.OK);
	}

	
		// Get the student Details By Id
	
	public ResponseEntity<Response> getById(int id) {
		Response res=new Response();
		Optional<Student>student=studentDao.findById(id);
		if(student.isPresent())
		{
			res.setStatus("00");
			res.setMessage("Student fetched successfully.");
			res.setStudent(student.get());
		}else {
			res.setStatus("01");
			res.setMessage("Student not found.");
		}
		return new ResponseEntity<Response>(res,HttpStatus.FOUND);
	}
	
// Delete Student data

	@Override
	public void deleteStudent(int id) {
		studentDao.deleteById(id);
	}

	
	// Update Student Data
	public ResponseEntity<Response>updateStudent(int id) {
		Response res1=new Response();
	Optional<Student>student=studentDao.findById(id);
	
	if(student.isPresent())
	{
		res1.setStatus("11");
		res1.setMessage("dataAlready present");
		res1.setStudent(student.get());
	}
		
	else {
		
	
		res1.setStatus("12");
		res1.setMessage("DataUpdated SucessFully");
		
	}
	return new ResponseEntity<Response>(res1,HttpStatus.FOUND);
	
	}
	
	//Add Student Data

	


	@Override
	public ResponseEntity<Response> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ResponseEntity<Response> getAllStudent1() {
		Response res=new Response();
		List<Student>student=studentDao.findAll();
		if(student.listIterator() != null)
		{
			res.setStatus("00");
			res.setMessage("Student fetched successfully.");
			res.setStudent(Student.get());
			
		}else {
			res.setStatus("01");
			res.setMessage("Student not found.");
		}
		return new ResponseEntity<Response>(res,HttpStatus.FOUND);
	}


	@Override
	
		
		public ResponseEntity<Response> addStudent(Response student) 
		{
			Response res5=new Response();
					
				 studentDao.save(student);
				 if(student != null)
				 {

					res5.setStatus("1");
					res5.setMessage("Data Added Sucessfully");
				 }
				 else
				 {
					 res5.setMessage("Data Not added Sucessfully");
				 }
				return new ResponseEntity<Response>(res5,HttpStatus.FOUND);
		}
	}


	
	
	

