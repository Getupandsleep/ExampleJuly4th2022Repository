package com.sgtesting.frameworkconcepts;

class Elements
{
	public static <E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}

public class GenericEDemo {

	public static void main(String[] args) {
		String s[]= {"Red","Blue","Green","Yellow"};
		Elements.readElements(s);
	}

}
