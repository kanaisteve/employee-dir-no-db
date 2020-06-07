package com.employeeinfo.model;


public class Employee {
	
	private int manNo;
	
	private String name;
	
	private String department;
	
	private String dob;

	public int getManNo() {
		return manNo;
	}
	
	// constructor
	public Employee(int manNo, String name,  String dob, String department){
	      this.manNo = manNo;
	      this.name = name;
	      this.department = department;
	      this.dob = dob;
	}

	// setters and getters
	public void setId(int manNo) {
		this.manNo = manNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [Man No.=" + manNo + ", name=" + name + ", department=" + department + ", dob=" + dob + ", getId()="
				+ getManNo() + ", getName()=" + getName() + ", getDepartment()=" + getDepartment() + ", getDob()="
				+ getDob() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}