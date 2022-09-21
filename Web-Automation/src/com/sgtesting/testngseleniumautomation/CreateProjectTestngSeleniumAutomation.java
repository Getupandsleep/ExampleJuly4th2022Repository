package com.sgtesting.testngseleniumautomation;
//create project
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateProjectTestngSeleniumAutomation {
	public static WebDriver oBrowser=null;
	
	@BeforeClass
	private static void launchBrowserNavigate()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");			
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	private static void logIn()
	{
		try
		{
			String expected="actiTIME - Login";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected,actual);
			Thread.sleep(2000);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3,dataProvider="customerDetails")
	private static void createCustomer(String customer)
	{
		try
		{
			String expected="http://localhost:81/tasks/tasklist.do";
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(3000);
			String actual=oBrowser.getCurrentUrl();
			Assert.assertEquals(expected, actual);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(customer);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4,dataProvider="projectDetails")
	private static void createProject(String projectname)
	{
		try
		{
			String expected="http://localhost:81/tasks/tasklist.do";
			String actual=oBrowser.getCurrentUrl();
			Assert.assertEquals(expected, actual);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(projectname);
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void logOut()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterClass
	private static void closeWeb()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] customerDetails()
	{
		Object obj[][]= {{"Infosys"}};
		return obj;
	}
	
	@DataProvider
	public Object[][] projectDetails()
	{
		return new Object[][] {{"Cloud Computing"}};
	}
}
