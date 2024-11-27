package com.azhar;

public class Employees {

	String name;
	String department;
	int salary;
	public Employees(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}


	public String getDepartment() {
		return department;
	}


	public int getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employees [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	

	
	
}
