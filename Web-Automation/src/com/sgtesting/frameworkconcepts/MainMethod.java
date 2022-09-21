package com.sgtesting.frameworkconcepts;

public class MainMethod {

	public static void main(String[] args) {
		DemoTclass<String> obj=new DemoTclass<String>();
		obj.setObj("Ranga");
		String s=obj.getObj();
		System.out.println(s);
		
		//Auto-Boxing
		int i=100;
		Integer j=Integer.valueOf(i);
		Integer k=i;
		System.out.println(i+j+k);
		
		//Un-Boxing
		
		Integer g=Integer.valueOf(125);
		int h=g.intValue();
		int z=g;
		System.out.println(g+h+z);
	}

}
