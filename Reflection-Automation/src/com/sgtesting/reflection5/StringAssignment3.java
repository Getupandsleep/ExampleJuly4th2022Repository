package com.sgtesting.reflection5;

//check whether the string is palindrome or not

public class StringAssignment3 {

	public void Palindrome()
	{
		String s1="gadag";
		String s2="";
		char ch[]=s1.toCharArray();
		int n=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			s2=(s2+ch[i]);
			n++;
		}
		System.out.println("Comparing :"+s1.equalsIgnoreCase(s2));
	}
}
