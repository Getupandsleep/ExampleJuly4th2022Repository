package com.sgtesting.testngseleniumautomation;
//create user
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUserTestngSeleniumAutomation {
	public static WebDriver oBrowser=null;
	
	@BeforeClass
	private static void launchBrowser()
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
	
	@Test(priority=1,dataProvider="LoginDetails")
	private static void logIn(String username,String Password)
	{
		try
		{
			String expected="actiTIME - Login";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected,actual);
			oBrowser.findElement(By.id("username")).sendKeys(username);
			oBrowser.findElement(By.name("pwd")).sendKeys(Password);
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
	
	@Test(priority=3,dataProvider="createUserDetails")
	private static void createUser(String fname,String lastname,String mail,String user,String pwd,String retypepwd)
	{
		try
		{
			String expected="http://localhost:81/administration/userlist.do";
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			String actual=oBrowser.getCurrentUrl();
			Assert.assertEquals(expected, actual);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			oBrowser.findElement(By.name("lastName")).sendKeys(lastname);
			oBrowser.findElement(By.name("email")).sendKeys(mail);
			oBrowser.findElement(By.name("username")).sendKeys(user);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(retypepwd);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			System.out.println(oAlert);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
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
	public Object[][] LoginDetails()
	{
		Object obj[][]= {{"admin","manager"}};
		return obj;
	}
	
	@DataProvider
	public Object[][] createUserDetails()
	{
		Object obj[][]= {{"Ranganath","Thimmanahalli","Ranga@gmail.com","ranga","12345","12345"}};
		return obj;
	}
}
