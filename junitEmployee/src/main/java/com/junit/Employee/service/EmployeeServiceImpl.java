package com.junit.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.Employee.EmployeeRepository;
import com.junit.Employee.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	 
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		return employeeRepository.findById(id);
	}

//	@Override
//	public Employee updateEmployee(Employee updateEmployees) {
//		employeeRepository.save(updateEmployees);
//		return updateEmployees;
//	}

	@Override
	public void deleteEmployee(Long id) {
	employeeRepository.deleteById(id);
	}

}
