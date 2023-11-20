package com.infinite.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.infinite.model.Employee;
import com.infinite.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private Set<Employee> employees = new HashSet<Employee>();

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public Set<Employee> employees() {
		return employees;
	}

}