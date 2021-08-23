package com.luv2code.CRUD_DEMO.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.CRUD_DEMO.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
}
