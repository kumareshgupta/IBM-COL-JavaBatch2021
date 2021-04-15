package com.inhert.demo;

public class Employee extends Person {
	 int empId;	
	 String company;	
	
	 public Employee() {
			System.out.println("Employee constructor....");
		}
	 
	 public void display() {
			System.out.println("Name : " + name + "\n" + "Age : " +age 
					+ "\n" + "Emp No : " + empId + "\n" + "Company : "+ company);
		}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
