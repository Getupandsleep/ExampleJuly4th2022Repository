package com.sgtesing.collectionframework;


import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//addElements();
		//getAndRemoveElements();
		readElements();
	}
	
	private static void addElements()
	{
		TreeMap<String,Integer> obj=new TreeMap<String,Integer>();
		obj.put("Mango", 50);
		obj.put("Apple",180);
		obj.put("Banana",25);
		obj.put("Litchi",240);
		System.out.println(obj);
		TreeMap<String,Integer> obj1=new TreeMap<String,Integer>();
		obj1.put("Lime",48);
		obj1.put("Banana",48);
		obj1.put("Banana",48);
		obj.putAll(obj1);
		System.out.println(obj);
	}
	
	private static void getAndRemoveElements()
	{
		TreeMap<String,Integer> obj=new TreeMap<String,Integer>();
		obj.put("Mango", 50);
		obj.put("Apple",180);
		obj.put("Banana",25);
		obj.put("Litchi",240);
		System.out.println(obj);
		int i=obj.get("Mango");
		System.out.println(i);
		obj.remove("Mango");
		System.out.println(obj);
	}

	private static void readElements()
	{
		TreeMap<String,Integer> obj=new TreeMap<String,Integer>();
		obj.put("Mango", 50);
		obj.put("Apple",180);
		obj.put("Banana",25);
		obj.put("Ran",240);
		System.out.println(obj);
		obj.forEach((k,v) -> System.out.println(k+"--->"+v));
	}
}
