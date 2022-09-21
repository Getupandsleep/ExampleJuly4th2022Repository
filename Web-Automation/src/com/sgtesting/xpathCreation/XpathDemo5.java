package com.sgtesting.xpathCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo5 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		insertValues();
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
			oBrowser.get("file:///G:/Selenium/Xpath%20Creation/WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void insertValues()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("20000");
			//oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("2000");
			//oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
			//oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
			//oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[6]/td[6]/input")).sendKeys("20000");
			WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
			String attri=oEle.getAttribute("id");
			System.out.println("The table id is: "+attri);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
