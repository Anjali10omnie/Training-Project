package com.junit.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit.Employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
