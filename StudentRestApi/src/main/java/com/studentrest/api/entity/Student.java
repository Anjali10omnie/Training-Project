package com.studentrest.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Stu_Data")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(min=5,max=10, message="Enter the name here")
	@Column(name="s_name")
	private String name;
	
	@NotNull
	@Size(min=5,max=10, message="Enter the course here")
	@Column(name="s_course")
	private String course;
	
	@NotNull
	@Size(min=5,max=10, message="Enter the address")
	@Column(name="s_add")
	private String address;
	
	@NotNull
	@Email(message="format not valid")
	@Column(name="s_email",unique=true)
	private String email;
	
	@NotNull
	@Size(min=10,max=10, message="Enter the mobileNo here")
	@Column(name="s_mob",unique=true)
	private String mobno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public Student(int id, @NotNull @Size(min = 5, max = 10, message = "Enter the name here") String name,
			@NotNull @Size(min = 5, max = 10, message = "Enter the course here") String course,
			@NotNull @Size(min = 5, max = 10, message = "Enter the address") String address,
			@NotNull @Size(min = 5, max = 10, message = "Enter the email here") String email,
			@NotNull @Size(min = 10, max = 10, message = "Enter the mobileNo here") String mobno) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.address = address;
		this.email = email;
		this.mobno = mobno;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", address=" + address + ", email="
				+ email + ", mobno=" + mobno + "]";
	}
	
	
}
