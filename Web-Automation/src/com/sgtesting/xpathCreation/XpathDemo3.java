package com.sgtesting.xpathCreation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//UsingTagnamewithAttributeName();
		//gettingLinks();
		getAllLinks();
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
	
	/*case10:Relative x-path using tag name with attribute  
	 * Syntax: //<tag>[@attribute]
	 * 
	 */
	private static void UsingTagnamewithAttributeName()
	{
		try
		{
			//getting list of links
			List<WebElement> oList=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("The number of links available are: "+oList.size());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void gettingLinks()
	{
		try
		{
			List<WebElement> oList=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oList.size();i++)
			{
				String link=oList.get(i).getText();
				if(link.endsWith("HQ"))
				{
					oList.get(i).click();
					break;
				}
			}
			Thread.sleep(3000);
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//StaleElementReferenceException if we don't put a break then it searches the remaining links in opened web page where it will not gwt it
	private static void getAllLinks()
	{
		try
		{
			List<WebElement> oList=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oList.size();i++)
			{
				String link=oList.get(i).getText();
				if(link.contains("HQ"))
				{
					oList.get(i).click();
				}
			}
			//oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
