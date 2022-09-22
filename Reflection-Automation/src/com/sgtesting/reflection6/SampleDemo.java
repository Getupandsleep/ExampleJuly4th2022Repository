package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class[] para=new Class[1];
			para[0]=String.class;
			
			Method method=obj.getClass().getMethod("method1", para);
			method.invoke(obj,"Ranga");
			
			Class[] para1=new Class[2];
			para1[0]=String.class;
			para1[1]=String.class;
			
			Method method1=obj.getClass().getMethod("method2", para1);
			method1.invoke(obj,"Mech","Bus");
			
			Class[] para2=new Class[1];
			para2[0]=Integer.TYPE;
			
			Method method3=obj.getClass().getMethod("method3", para2);
			method3.invoke(obj,420);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
