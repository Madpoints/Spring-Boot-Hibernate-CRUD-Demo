package com.madpoints.springboot.cruddemo.DAO;

import java.util.List;

import com.madpoints.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
}
