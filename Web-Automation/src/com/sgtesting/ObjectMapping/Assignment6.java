package com.sgtesting.ObjectMapping;
//modify project
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver oBrowser=null;
	public static ObjectMapAssignment oMap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minFlyoutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
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
	
	private static void createProject()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("toclickonaddnewbutton")).click();
			oBrowser.findElement(oMap.getLocator("toaddnewproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("projectnametextfield")).sendKeys("Cloud Computing");
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("createprojectbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyProject()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("projectsettingsbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(oMap.getLocator("projectdescription")).sendKeys("Cloud computing based project is based on cloud data and we are following agile");
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("tocloseproject")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(oMap.getLocator("projectsettingsbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("projectactionbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("projectdeletebutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oMap.getLocator("projectdeleteconfirmation")).click();
			Thread.sleep(1000);
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
