package com.junit.Employee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.junit.Employee.Entity.Employee;
import com.junit.Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/createEmployee")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee>getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id)
	{
		return employeeService.getEmployeeById(id)
				.map(ResponseEntity::ok)
				.orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PutMapping("/update/{id}")
	public Optional<Employee> updateEmployee( @PathVariable ("id") long Id)

	{
		return employeeService.getEmployeeById(Id);
			
	}
	
	public String deleteEmployee(@PathVariable("id") long id)
	{
		employeeService.deleteEmployee(id);
		return "Employee deleted sucessfully!!!";
		
	}
	
}
