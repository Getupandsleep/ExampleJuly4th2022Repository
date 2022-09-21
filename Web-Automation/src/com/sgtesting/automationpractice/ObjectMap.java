package com.sgtesting.automationpractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	public Properties prop=null;
	ObjectMap(String filename)
	{
		FileInputStream fin=null;
		try
		{
			String path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\ObjectMap\\"+filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public By returnByObject(String logicalname)
	{
		By by=null;
		try
		{
			String value=prop.getProperty(logicalname);
			String locators[]=value.split(";");
			switch(locators[0].toLowerCase())
			{
			case "id":
				by=By.id(locators[1]);
				break;
			case "name":
				by=By.name(locators[1]);
				break;
			case "xpath":
				by=By.xpath(locators[1]);
				break;
			case "cssSelector":
				by=By.cssSelector(locators[1]);
				break;
			case "linktext":
				by=By.linkText(locators[1]);
				break;
			case "class":
				by=By.className(locators[1]);
				break;
			case "partiallinktext":
				by=By.partialLinkText(locators[1]);
				break;
			case "tagName":
				by=By.tagName(locators[1]);
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
}
