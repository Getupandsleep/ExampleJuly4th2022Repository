package com.sgtesing.collectionframework;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//addKeyValue();
		//getandremoveElements();
		readElements();
		//withoutGenerics();
	}

	private static void addKeyValue()
	{
		HashMap<String,Integer> obj=new HashMap<String,Integer>();
		obj.put("Mango", 50);
		obj.put("Apple",180);
		obj.put("Banana",25);
		obj.put("Litchi",240);
		System.out.println(obj);
		HashMap<String,Integer> obj1=new HashMap<String,Integer>();
		obj1.put("Chickoo",70);
		obj1.put("Lime",80);
		obj1.put("Orange",170);
		obj.putAll(obj1);
		System.out.println(obj);
	}
	
	private static void getandremoveElements()
	{
		HashMap<String,Integer> obj=new HashMap<String,Integer>();
		obj.put("Mango", 50);
		obj.put("Apple",180);
		obj.put("Banana",25);
		obj.put("Litchi",240);
		System.out.println(obj);
		int v1=obj.get("Mango");
		System.out.println(v1);
		obj.remove("Mango");
		System.out.println(obj);
		int v2=obj.get("Mango");
		System.out.println(v2);
	}
	
	private static void readElements()
	{
		HashMap<String,Integer> obj=new HashMap<String,Integer>();
		obj.put(null, 50);
		obj.put("Apple",180);
		obj.put("Banana",25);
		obj.put("Litchi",240);
		System.out.println(obj);
		obj.forEach((k,v) -> System.out.println(k+"-->"+v));
	}
	
	private static void withoutGenerics()
	{
		HashMap obj=new HashMap();
		obj.put(120,"Ranga");
		obj.put(1.20,'r');
		obj.put(120,true);
		obj.put(120,12.5);
		System.out.println(obj);
	}
}
