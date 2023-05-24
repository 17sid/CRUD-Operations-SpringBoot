package com.siddhesh.project.service.impl;

import org.springframework.stereotype.Service;

import com.siddhesh.project.model.Employee;
import com.siddhesh.project.repository.EmployeeRepository;
import com.siddhesh.project.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
