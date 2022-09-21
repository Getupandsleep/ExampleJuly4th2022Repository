package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefoxBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		Login();
		Logout();
		closeWeb();
	}

	private static void launch()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",path+"\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:8081/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("ranga@123");
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Logout()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("html.ext-strict body.submit_tt.myTT.with-navigation.ext-gecko.ext-gecko2 div.navBg.withSubMenu table#topnav.navTable tbody tr td.menuCell.navCell table tbody tr td div.menuCellDiv table.menuTableWrap tbody tr.logoutContainer td.logoutCell a#logoutLink.logout")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeWeb()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
