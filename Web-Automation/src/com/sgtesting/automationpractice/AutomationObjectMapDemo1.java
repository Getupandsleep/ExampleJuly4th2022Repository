package com.sgtesting.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationObjectMapDemo1 {
	public static WebDriver oBrowser=null;
	public static ObjectMap oMap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginWithCredentials();
		createUser();
	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oMap=new ObjectMap("ObjectMapDemo.properties");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://enigmatic-meadow-39517.herokuapp.com/students");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginWithCredentials()
	{
		try
		{
			oBrowser.findElement(oMap.returnByObject("loginemailidtextfield")).sendKeys("rangnath.t.p@gmail.com");
			oBrowser.findElement(oMap.returnByObject("loginpasswordtextfield")).sendKeys("Ranga@123");
			oBrowser.findElement(oMap.returnByObject("loginsubmitbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(oMap.returnByObject("clickonusersbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oMap.returnByObject("clickonnewuserbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.returnByObject("userfirstnametextfield")).sendKeys("Jathin");
			oBrowser.findElement(oMap.returnByObject("userlasttextnamefield")).sendKeys("Pal");
			oBrowser.findElement(oMap.returnByObject("useremailtextfield")).sendKeys("Jat@gmail.com");
			oBrowser.findElement(oMap.returnByObject("userphonenumber")).sendKeys("9902224731");
			oBrowser.findElement(oMap.returnByObject("useraddresstextfield")).sendKeys("Bangalore");
			Thread.sleep(1000);
			oBrowser.findElement(oMap.returnByObject("userstatebarselection")).click();
			Thread.sleep(1000);	
			oBrowser.findElement(oMap.returnByObject("userselectstate")).click();
			oBrowser.findElement(oMap.returnByObject("userspincode")).sendKeys("560098");
			oBrowser.findElement(oMap.returnByObject("userscreatesubmitbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
