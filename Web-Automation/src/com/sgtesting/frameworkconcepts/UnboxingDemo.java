package com.sgtesting.frameworkconcepts;

public class UnboxingDemo {

	public static void main(String[] args) {
		Integer a=Integer.valueOf(125);
		System.out.println("Integer a: "+a);
		
		//Explicitly convert object to primitive
		int b=a.intValue();
		System.out.println("int b: "+b);
		
		//Un-boxing , auto-conversion
		
		int c=a;
		System.out.println("int c: "+c);
	}

}
