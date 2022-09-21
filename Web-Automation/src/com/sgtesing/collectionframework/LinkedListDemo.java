package com.sgtesing.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements();
		//readElements1();
		//readElements2();
		//withoutGenerics();
		interfaceQueue();
	}
	
	public static void addElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("Mango");
		obj.add("Apple");
		obj.add(0,"Chickoo");
		obj.add("Litchi");
		System.out.println(obj);
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Banana");
		obj1.add("Chickoo");
		obj1.add("Apple");
		obj1.add(0,"Grapes");
		obj1.add("Mango");
		obj1.addAll(obj1);
		System.out.println(obj1);
	}
	
	public static void removeElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println(obj);
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Chickoo");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Mango");
		System.out.println(obj);
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Banana");
		obj1.add("Chickoo");
		obj1.add("Apple");
		obj1.add(0,"Grapes");
		obj1.add("Mango");
		obj.addAll(obj1);
		System.out.println(obj);
		obj.remove(3);
		obj.remove("Mango");
		obj.remove("Apple");
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	
	private static void readElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
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
	
	private static void readElements1()
	{
		LinkedList<String> obj=new LinkedList<String>();
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
	
	private static void readElements2()
	{
		LinkedList<String> obj=new LinkedList<String>();
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
		LinkedList obj=new LinkedList();
		obj.add(420);
		obj.add(1.25);
		obj.add("Ranga");
		obj.add(0,'A');
		System.out.println();
	}
	
	private static void interfaceQueue()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		obj.add(700);
		System.out.println(obj);
		obj.remove();
		obj.remove();
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println();
	}
	

}
