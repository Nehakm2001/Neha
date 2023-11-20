package com.infinite.service;
	import java.util.Set;
	import com.infinite.model.Employee;

	public interface EmployeeService {
		void add(Employee employee);
		
		Set<Employee> employees();
	}

