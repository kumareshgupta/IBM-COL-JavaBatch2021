package com.wrapper.demo;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10; // convert into Integer Object
		
		Integer intObj = new Integer(i);
		
		Integer intObj1 = i; // autoboxing
		
		int j = intObj; //auto unboxing
		
		Integer a = 102;
		
		System.out.println("Maximum int value " + Integer.MAX_VALUE );
		System.out.println("Minimum int value " + Integer.MIN_VALUE);
		
		
		System.out.println("Maximum byte value " + Byte.MAX_VALUE);
		System.out.println("Minimum byte value " + Byte.MIN_VALUE);
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(123.45f);
		int k = (int) list.get(0);
	}

}
