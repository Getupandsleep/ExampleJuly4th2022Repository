package com.sgtesting.frameworkconcepts;

class Generic
{
	public static <E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}

public class DemoGenerics {

	public static void main(String[] args) {
		Integer i[]= {1,3,5,6};
		Generic.readElements(i);
	}

}
