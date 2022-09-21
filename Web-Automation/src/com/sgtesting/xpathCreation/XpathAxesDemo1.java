package com.sgtesting.xpathCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//enterSalforSachin();
		//saltopersonNexttoRahul();
		//makeFreedomFighterStatusActive();
		//statusActiveFor2ndpreviousPersonfromSachin();
		getTableIDbasedonSachintextField();
		//basedonTableEnterThesalfor6thRecord();
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Enter salary into person sachin tendulkar
	
	private static void enterSalforSachin()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("20000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Enter salary into person who is next to rahul dravid
	
	private static void saltopersonNexttoRahul()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("20000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//make the status active for Indian freedom fighter
	
	private static void makeFreedomFighterStatusActive()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//From the sachin Tendulkar his previous 2nd record make the status as active
	
	private static void statusActiveFor2ndpreviousPersonfromSachin()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Based on Sachin tendulkar text field get ancestor/table id
	
	private static void getTableIDbasedonSachintextField()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
			String val=oEle.getAttribute("id");
			System.out.println(val);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Based on table enter the salary for 6th record
	
	private static void basedonTableEnterThesalfor6thRecord()
	{
		try
		{
			oBrowser.findElement(By.xpath("//table/descendant::tr[6]/td[6]/input")).sendKeys("20000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
