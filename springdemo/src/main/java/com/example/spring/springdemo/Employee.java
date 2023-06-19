package com.example.spring.springdemo;

public class Employee {
	
	String empid;
	String name;
	public Employee() {
		empid="1001";
		name="Praveen"; 
	}
	public Employee(String empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	

}
