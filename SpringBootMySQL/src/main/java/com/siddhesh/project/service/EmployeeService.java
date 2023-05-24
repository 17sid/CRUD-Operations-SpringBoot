package com.siddhesh.project.service;

import java.util.List;

import com.siddhesh.project.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee (Employee employee);
	List<Employee> getAllEmployees();

}
