package com.junit.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.junit.Employee.Entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee>getAllEmployees();
	Optional<Employee>getEmployeeById(long id);
	//Employee updateEmployee(Employee updateEmployees);
	void deleteEmployee(Long id);
	

}
