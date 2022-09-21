package com.sgtesting.frameworkconcepts;



public class AutoBoxDemo {

	public static void main(String[] args) {
		int a=25;
		System.out.println("int a: "+a);
		
		//Explicit Conversion of primitive to object
		
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b: "+b);
		
		//Auto-boxing i.e internal conversion
		
		Integer c=a;
		System.out.println("Integer c: "+c);
	}

}
