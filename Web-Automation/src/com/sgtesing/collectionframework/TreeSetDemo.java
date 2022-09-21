package com.sgtesing.collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements();
		//readElements1();
		//readElements2();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		obj.add("Mango");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		TreeSet<String> obj1=new TreeSet<String>();
		obj1.add("Blue");
		obj1.add("Red");
		obj1.add("Violet");
		obj1.add("Indigo");
		obj.addAll(obj1);
		System.out.println(obj);
	}
	
	private static void removeElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		obj.add("Mango");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		obj.remove("Apple");
		obj.remove("Mango");
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	
	private static void readElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		obj.add("Mango");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		for(String s:obj)
		{
			System.out.println(s);
		}
	}
	
	private static void readElements1()
	{
		TreeSet<String> obj=new TreeSet<String>();
		obj.add("Mango");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void readElements2()
	{
		TreeSet<String> obj=new TreeSet<String>();
		obj.add("Mango");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		Object a[]=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	//TreeSet never supports without generics
	private static void withoutGenerics()
	{
		TreeSet obj=new TreeSet();
		obj.add(12);
		obj.add(1.25);
		obj.add('A');
		System.out.println(obj);
	}
	
	

}
