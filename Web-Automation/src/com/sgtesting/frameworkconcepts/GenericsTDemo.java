package com.sgtesting.frameworkconcepts;

class MyClass<T>
{
	private T obj=null;
	public void add(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return obj;
	}
}

public class GenericsTDemo {

	public static void main(String[] args) {
		MyClass<String> obj=new MyClass<String>();
		obj.add("Ranga");
		String s=obj.get();
		System.out.println(s);
		obj.add("Ranganath T P");
		String z=obj.get();
		System.out.println(z);
		
		MyClass obj1=new MyClass();
		obj1.add(125);
		int i=(int)obj1.get();
		System.out.println("Integer i: "+i);
		
		MyClass<Integer> obj2=new MyClass<Integer>();
		obj2.add(125);
		int b=obj2.get();
		System.out.println("int b: "+b);
		
	}

}
