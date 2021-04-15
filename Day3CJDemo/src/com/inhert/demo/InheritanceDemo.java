package com.inhert.demo;

public class InheritanceDemo {
	/*
	public static void showEmployeeDetails(Employee employee) {
		employee.display();
	}

	public static void showStudentDetails(Student student) {
		student.display();
	}
	*/
	
	public static void showPersonDetails(Person person) {
		person.display();
	}
	
	public static void main(String[] args) {
		//Person person = new Person();
		Student student = new Student(10, "XII", "Mohan", 18);
		Employee employee = new Employee();
		
		Person person = new Student(20, "X", "Sohan", 16);
		person = employee;
		
	/*	
		person = student;
		person = employee;
		*/
		
		System.out.println("------------------------------------------------------------------");
		showPersonDetails(person);
		showPersonDetails(student);
		showPersonDetails(employee);
		
	}

}
