package com.sgtesting.reflection3;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		try
		{
			Sample obj=new Sample();
			Method methods[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<methods.length;i++)
			{
				String name=methods[i].getName();
				System.out.println(name);
				methods[i].invoke(obj);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
