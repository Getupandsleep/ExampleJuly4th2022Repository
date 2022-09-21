package com.sgtesting.frameworkconcepts;

class GenericsElements
{
	public static <E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}

public class ElementReading {

	public static void main(String[] args) {
		Double d[]= {1.23,3.45,5.5,6.5};
		GenericsElements.readElements(d);
	}

}
