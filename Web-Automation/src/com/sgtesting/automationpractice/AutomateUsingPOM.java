package com.sgtesting.automationpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateUsingPOM {
	public static WebDriver oBrowser=null;
	public static POM oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getWindowHandles();
	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new POM(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void getWindowHandles()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			Thread.sleep(3000);
			System.out.println("Parent popup browser "+parentBrowser);
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(3000);
			Object[] oObj=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<oObj.length;i++)
			{
				String win=oObj[i].toString();
				System.out.println(win);
				oBrowser.switchTo().window(win);
				Thread.sleep(3000);
				oBrowser.findElement(By.linkText("Try Free")).click();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
