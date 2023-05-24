package com.siddhesh.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhesh.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
