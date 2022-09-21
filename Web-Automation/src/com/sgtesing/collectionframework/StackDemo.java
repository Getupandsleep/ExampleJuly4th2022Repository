package com.sgtesing.collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		pushDemo(st,100);
		pushDemo(st,200);
		pushDemo(st,300);
		pushDemo(st,400);
		pushDemo(st,500);
		pushDemo(st,600);
		pushDemo(st,700);
		popDemo(st);
		popDemo(st);
		
	}

	private static void pushDemo(Stack st,int a)
	{
		st.push(a);
		System.out.println(a);
	}
	
	private static void popDemo(Stack st)
	{
		int a=(int) st.pop();
		System.out.println("Removed Element :"+a);
	}
}
