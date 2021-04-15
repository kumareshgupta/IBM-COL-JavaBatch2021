package com.inhert.demo;

public class FinalDemo {

	static final int totalCount=30;
	
	public static void main(String[] args) {
		//totalCount++; //compilation error
		//1.
		final int num;
		num = 100;
		
		//2.
		final int num1 = 123;
		
		
		
		//num = 200; //compilation error
	}

}
