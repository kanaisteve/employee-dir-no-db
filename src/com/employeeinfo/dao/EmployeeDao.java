package com.employeeinfo.dao;

import java.util.List;

import com.employeeinfo.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int manNo);
	//public void updateEmployee(Employee employee);
	//public void deleteEmployee(Employee employee);
	
}
