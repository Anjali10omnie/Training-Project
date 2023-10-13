package com.employee.ap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Table(name="Emp_Details")
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@NotNull
@Size(min=4 ,max=10,message="Enter the name")
@Column(name="EmpName")
private String name;


@NotNull
@Size(min=4 ,max=10,message="Enter the city")

@Column(name="EmpCity")
private String city;

@NotNull
@Column(name="EmpEmail")
private String email;

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Employee(int id,  String name,
		 String city, String email) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.email = email;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + "]";
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}