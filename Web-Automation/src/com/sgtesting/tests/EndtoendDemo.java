package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoendDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		login();
		mini();
		createuser();
		deleteuser();
		logout();
		closeapllication();
	}
	private static void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	 private static void mini()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 private static void createuser()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("lastName")).sendKeys("demouser");
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("email")).sendKeys("1@gmail.com");
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("username")).sendKeys("demo7");
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("password")).sendKeys("123123");
			 Thread.sleep(2000);
			 oBrowser.findElement(By.name("passwordCopy")).sendKeys("123123");
			 Thread.sleep(2000);
			 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			 Thread.sleep(3000);
			 
		 }catch(Exception e)
		 {
			e.printStackTrace(); 
		 }
	 }
	 private static void deleteuser()
	 {
		 try
		 {
			oBrowser.findElement(By.xpath("//span[text()='demouser, demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert  oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println("conent");
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
    	    oBrowser.findElement(By.id("logoutLink")).click();
    	    Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeapllication()
    {
    	try
    	{
    		oBrowser.close();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
