package com.sgtesting.reflection5;

public class StringBufferMethodDemo2 {
	
	public static void deleteString()
	{
		StringBuffer s=new StringBuffer("It is a very old book");
		System.out.println(s.delete(s.indexOf("very"),s.indexOf("book")));
	}
}
