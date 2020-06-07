package com.employeeinfo.dao;

import java.util.ArrayList;
import java.util.List;

import com.employeeinfo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	// list is working as database
	List<Employee> employees;
	
	public EmployeeDaoImpl() {
		employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(0, "Kanai Steve", "24-09-91", "IT");
		Employee employee2 = new Employee(1, "Makasa Peter", "23-09-93", "Procurement");
		Employee employee3 = new Employee(2, "Bupe Karen", "12-06-89", "Sales");
		Employee employee4 = new Employee(3, "Muchona Agatha", "04-11-73", "Marketing");
		Employee employee5 = new Employee(4, "Pezo Rose", "24-05-05", "Design");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}
	
	@Override
	public Employee getEmployee(int manNo) {
		return employees.get(manNo);
	}
	
	//@Override
	//public void updateEmployee(Employee employee) {
		//employees.get(employee.getManNo()).setName(employee.getName());
		//System.out.println("Employee: Man No " + employee.getManNo() + ", updated in the database");
	//}
	
}
