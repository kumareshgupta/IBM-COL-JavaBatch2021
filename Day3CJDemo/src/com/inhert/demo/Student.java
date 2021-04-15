package com.inhert.demo;

public class Student extends Person {
	 int rollNo;	 
	 String standard;	
	
	 public Student() {
		//super(); 
		System.out.println("Student constructor....");
		}
	 
	 
	public Student(int rollNo, String standard, String name, int age) {
		super(name, age);
		this.rollNo = rollNo;
		this.standard = standard;
		System.out.println("Student parameterized constructor....");
	}

	public void display() {
		System.out.println("Name : " + name + "\n" + "Age : " +age + "\n" + "Roll No : " + rollNo + "\n" + "Standard : "+ standard);
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	
}
