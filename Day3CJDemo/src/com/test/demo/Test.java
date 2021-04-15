package com.test.demo;

class A {
	int i = 10;
	public void printValue() {
		System.out.println("ValueA");
		}
	}

class B extends A{
	int i = 12;
	public void printValue() {
		System.out.print("ValueB");
		}
	} 

public class Test{
	public static void main(String argv[]){
		A a = new B();
		a.printValue();
		System.out.println(a.i);
		
		B b = new B();
		b.printValue();
		System.out.println(b.i);
		
		}
	}