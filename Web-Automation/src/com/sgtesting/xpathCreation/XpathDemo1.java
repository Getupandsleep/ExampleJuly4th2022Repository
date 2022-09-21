package com.sgtesting.xpathCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Absolute X-path

public class XpathDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		AbsoluteXpath();
		XpathwithTagnameandIndex();
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

	//Absolute x-path
	private static void AbsoluteXpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("admin");
			//oBrowser.findElement(By.xpath("html/body/div/form/input[2]")).sendKeys("manager");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//using tag name with index
	//Syntax: //<tagName>[index]
	private static void XpathwithTagnameandIndex()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("manager");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Using tag name with attribute name and value
	//<tag>[@Attribute='attribute value']
	
}
