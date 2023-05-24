package com.siddhesh.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.siddhesh.project.exception.ResourceNotFoundException;
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
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeId(long id) {
		// TODO Auto-generated method stub
		Optional <Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent())
//		{
//			return employee.get();
//		}
//		else
//		{
//			throw new ResourceNotFoundException("Employee","Id",id);
//		}
		
		//Using Lambda expression
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","Id",id));
	}

}
