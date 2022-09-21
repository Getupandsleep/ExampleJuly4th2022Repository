package com.sgtesting.xpathCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Relative x path

public class XpathDemo2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//xpathwithTagAttributeandValue();
		//xpathwithonlyAttributeandValue();
		//withoutTagandAttributeonlywithattributeValue();
		//usingTagnamewithMultipleAttributesanditsValue();
		//usingTagnameMultipleattributesandValueswithAndOperator();
		//usingTagnameMultipleattributesandValueswithOROperator();
		//usingTagnamewithPartialmatchingofAttributesandValues();
		//usingtagNamewithTextContent();
		usingTagwithPartialTextContent();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///G:/Selenium/Xpath%20Creation/Sample.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	
	//Using tag name with attribute name and value
	//<tag>[@Attribute='attribute value']
	
	private static void xpathwithTagAttributeandValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Without tag name but with attribute name and its value
	//syntax: //*[@Attribute='attribute value']
	private static void xpathwithonlyAttributeandValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Without tag name and attribute name using only attribute value
	// Syntax: //*[@*='attribute value']
	
	private static void withoutTagandAttributeonlywithattributeValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with multiple attributes and its values
	//Syntax: //<tag>[@attribute1='Value1'][@attribute2='Value2']
	
	private static void usingTagnamewithMultipleAttributesanditsValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit'][@class='submit1btn1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with multiple attributes and values using and operator
	//Syntax: //<tag>[@attribute1='Value1' and @attribute2='Value2']
	
	private static void usingTagnameMultipleattributesandValueswithAndOperator()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit' and @class='submit1btn1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with multiple attributes and values using OR operator
	//Syntax: //<tag>[@attribute1='Value1' or @attribute2='Value2']
	
	private static void usingTagnameMultipleattributesandValueswithOROperator()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit' or @class='submit1btn1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with partial matching of attribute name and values
	// starts-with(@attribute,'value')
	// ends-with(@attribute,'value')
	// contains(@attribute,'value')
	// Syntax: //<tag>[starts-with(@attribute,'value')]
	
	private static void usingTagnamewithPartialmatchingofAttributesandValues()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//input[starts-with(@value,'Sub')]")).click();
			oBrowser.findElement(By.xpath("//input[contains(@name,'mit1')]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with text content if present b/w open and close tag.
	//Syntax: //<tag>[text()='text content']
	
	private static void usingtagNamewithTextContent()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[text()='S G Software Testing']")).click();
			Thread.sleep(3000);
			oBrowser.navigate().back();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with partial text content
	//starts-with(text(),'partial text content')
	//ends-with(text(),'partial text content')
	//contains(text(),'partial text content')
	//Syntax: //<tag>[starts-with(text(),'partial text content')]
	
	private static void usingTagwithPartialTextContent()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
			//oBrowser.findElement(By.xpath("//a[contains(text(),'ware')]")).click();
			oBrowser.findElement(By.xpath("//a[ends-with(text(),'ing')]")).click();
			Thread.sleep(2000);
			oBrowser.navigate().back();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Note: x-path never never allows ends with operator!!!!!!!!!!!
}
