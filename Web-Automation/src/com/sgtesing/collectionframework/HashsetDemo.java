package com.sgtesing.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

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
		HashSet<String> obj=new HashSet<String>();
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("Blue");
		obj1.add("Red");
		obj1.add("Violet");
		obj1.add("Indigo");
		obj.addAll(obj1);
		System.out.println(obj);
	}
	
	private static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		obj.remove("Mango");
		obj.remove("Apple");
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	
	private static void readElements()
	{
		HashSet<String> obj=new HashSet<String>();
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
		HashSet<String> obj=new HashSet<String>();
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
		HashSet<String> obj=new HashSet<String>();
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Litchi");
		System.out.println(obj);
		Object s[]=obj.toArray();
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	private static void withoutGenerics()
	{
		HashSet obj=new HashSet();
		obj.add(1.25);
		obj.add(100);
		obj.add('a');
		obj.add("Ranga");
		System.out.println(obj);
	}
	

}
