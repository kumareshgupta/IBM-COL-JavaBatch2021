package com.inhert.demo;

public class Person {
	 String name;
	 int age;
	public Person() {
		System.out.println("Person constructor....");
	}	
	
	public Person(String name, int age) {
		System.out.println("Person parameterized constructor....");
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name : " + name + "\n" + "Age : " +age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	
}
