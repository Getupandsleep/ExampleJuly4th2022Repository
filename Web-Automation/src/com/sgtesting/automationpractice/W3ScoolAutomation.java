package com.sgtesting.automationpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3ScoolAutomation {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getWWWlinks();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://en.wikipedia.org/wiki/World_Wide_Web");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void getWWWlinks()
	{
		try
		{
			List<WebElement> oList=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oList.size();i++)
			{
				String link=oList.get(i).getText();
				System.out.println(link);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
