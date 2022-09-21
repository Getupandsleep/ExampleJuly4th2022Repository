package com.sgtesing.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements();
		//readElements2();
		//readElements3();
		//readElements4();
		//withoutGenerics();
		stackExtendsVector();
	}

	private static void addElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("Blue");
		obj1.add("Red");
		obj1.add("Violet");
		obj1.add("Indigo");
		obj.addAll(obj1);
		System.out.println(obj);
	}
	
	private static void removeElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		obj.remove(3);
		obj.remove("Apple");
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	
	private static void readElements()
	{
		Vector<String> obj=new Vector<String>();
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
		Vector<String> obj=new Vector<String>();
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
		Vector<String> obj=new Vector<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		Enumeration<String> enu=obj.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}
	
	private static void readElements4()
	{
		Vector<String> obj=new Vector<String>();
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
	
	private static void withoutGenerics()
	{
		Vector obj=new Vector();
		obj.add(125);
		obj.add(1.25);
		obj.add('A');
		obj.add("Ranga");
		System.out.println(obj);
	}
	
	private static void stackExtendsVector()
	{
		Vector<String> obj=new Stack<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
	}
	
	
}
