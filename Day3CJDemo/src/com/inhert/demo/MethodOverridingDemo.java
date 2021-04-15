package com.inhert.demo;

class A{
	 void display() {
		System.out.println("display method of A.....");
	}
}

class B extends A{
	void display() {
		//super.display();
		System.out.println("display method of B......");
	}
	
	void show() {
		display();
	}
}



public class MethodOverridingDemo {

	public static void main(String[] args) {
		B b = new B();
		b.display();
		b.show();
	}

}
