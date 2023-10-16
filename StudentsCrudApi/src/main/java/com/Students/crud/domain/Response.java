package com.Students.crud.domain;

import java.util.List;

import com.Students.crud.Entity.Student;

public class Response <T>{
	private Student student;
	private String status;
	private String message;
	private List<T>error;
	private T singleData;
	public T getSingleData() {
		return singleData;
	}
	public void setSingleData(T singleData) {
		this.singleData = singleData;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<List> getError() {
		return (List<List>) error;
	}
	public void setError(List<List> string) {
		this.error = (List<T>) string;
	}

	

}
