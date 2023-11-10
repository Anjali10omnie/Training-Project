package com.junit.Employee;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.junit.Employee.Entity.Employee;
import com.junit.Employee.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;


	//@Autowired
	//private EmployeeServiceImpl employeeServiceImpl;
	
//	@Test
//	@Disabled
//	public void saveEmployeetest() {
//		Employee employee=Employee.builder()
//				.firstName("Anjali")
//				.lastName("singh")
//				.email("anjalisingh@gmail.com")
//				.build();
//		employeeService.saveEmployee(employee);
//		assertThat(employee.getId()).isGreaterThan(0);
//	}

	@Test
	public void getEmployeeTest() {
		Employee employee=employeeService.getEmployeeById(3l).get();
		assertThat(employee.getId()).isEqualTo(3l);
	}
	
	@Test
	public void getAllEmployeeTest()
	{	
		List<Employee> employee=employeeService.getAllEmployees();
		assertThat(employee.size()).isGreaterThan(0);
	}

	@Test
	public void updateEmployeeTest() {
	   Employee employee=new Employee();
		Employee emp = employeeRepository.findById(8l).get();
		emp.setEmail("anjali@gmail.com");
		emp.setFirstName("Anjali");
		emp.setLastName("Singh");
		employeeRepository.save(emp);
		assertThat(emp.getId()).isEqualTo(8l);
		
	}
	
	@Test
	public void deleteEmployeetest() {
		employeeService.deleteEmployee(5l);		

		Employee emp2 = null;
		Optional<Employee> optionalEmployee = employeeRepository.findById(5l);
		
		if(optionalEmployee.isPresent()) {
			emp2 = optionalEmployee.get();
		}
		assertThat(emp2).isNull();
	}

}
