package com.sgtesing.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElements3();
		withoutGenericsaddElements();
	}

	private static void addElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Blue");
		obj1.add("Red");
		obj1.add("Violet");
		obj1.add("Indigo");
		obj.addAll(obj1);
		System.out.println(obj);
	}
	
	private static void removeElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		obj.remove(0);
		obj.remove("Mango");
		System.out.println(obj);
		obj.remove(3);
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	
	private static void readElements1()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		for(String s:obj)
		{
			System.out.println(s);
		}
	}
	
	private static void readElements2()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElements3()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void withoutGenericsaddElements()
	{
		ArrayList obj=new ArrayList();
		System.out.println(obj);
		obj.add(125);
		obj.add(1.25);
		obj.add("Mango");
		obj.add('A');
		System.out.println();
	}
}
