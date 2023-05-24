package com.siddhesh.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddhesh.project.model.Employee;
import com.siddhesh.project.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class employeeController {
	
	private EmployeeService employeeService;

	public employeeController(EmployeeService employeeService) {
		super();
		// TODO Auto-generated constructor stub
		this.employeeService = employeeService;
	}

	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
}
