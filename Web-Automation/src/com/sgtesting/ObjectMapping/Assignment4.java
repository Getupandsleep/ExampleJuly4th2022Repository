package com.sgtesting.ObjectMapping;
//modify customer
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static WebDriver oBrowser=null;
	public static ObjectMapAssignment oMap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minFlyoutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
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
	
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("toclickontasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("toclickonaddnewbutton")).click();
			oBrowser.findElement(oMap.getLocator("toclickonnewcustomerbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("customernametextfield")).sendKeys("Infosys");
			oBrowser.findElement(oMap.getLocator("toclickoncreatecustomerbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyCustomer()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("customersettingsbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("customerdescription")).sendKeys("Infosys is in tie up with us since 2007 and is a trust worthy customer" );
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("closecustomerdetails")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("customersettingsbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("customeractionbutton")).click();
			oBrowser.findElement(oMap.getLocator("customerdeletebutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("customerdeleteconfirmation")).click();
			Thread.sleep(2000);
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