package com.sgtesting.automationpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomation {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getMobiles();
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
			oBrowser.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void getMobiles()
	{
		try
		{
			//List<WebElement> oList=oBrowser.findElements(By.xpath("//a[@href]"));
			oBrowser.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
			oBrowser.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(5000);
			List<WebElement> oList=oBrowser.findElements(By.xpath("//img[@alt]"));
			int links=oList.size();
			System.out.println("The number of links are "+links);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
