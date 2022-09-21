package com.sgtesting.ObjectMapping;
//modify user
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ObjectMapAssignment oMap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minFlyoutWindow();
		createUser();
		modifyUser();
		deleteuser();
		logout();
		closeApp();
	}

	private static void launchBrowser()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oMap=new ObjectMapAssignment("objectmapassignment1.properties");
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
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("loginpageusernamelocator")).sendKeys("admin");
			oBrowser.findElement(oMap.getLocator("loginpagepasswordlocator")).sendKeys("manager");
			oBrowser.findElement(oMap.getLocator("loginpageloginbuttonlocator")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("homepageminflyoutwindow")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("toclickonusers")).click();
			Thread.sleep(3000);
			oBrowser.findElement(oMap.getLocator("toclickonaddnewuser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(oMap.getLocator("firstnametextfield")).sendKeys("Sandy");
			oBrowser.findElement(oMap.getLocator("lastnametextfield")).sendKeys("Sandesh");
			oBrowser.findElement(oMap.getLocator("emailtextfield")).sendKeys("S@gmail.com");
			oBrowser.findElement(oMap.getLocator("usernametextfield")).sendKeys("Sandu");
			oBrowser.findElement(oMap.getLocator("passwordtextfield")).sendKeys("sandy@123");
			oBrowser.findElement(oMap.getLocator("retypepasswordtextfield")).sendKeys("sandy@123");
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("createuserbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("toclickonexistinguser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("emailtextfield")).clear();
			oBrowser.findElement(oMap.getLocator("emailtextfield")).sendKeys("San@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("savechangesbutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("toclickonexistinguser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(oMap.getLocator("todeleteuserbutton")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
