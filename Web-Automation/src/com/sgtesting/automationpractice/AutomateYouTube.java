package com.sgtesting.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateYouTube {
	public static WebDriver oBrowser=null;
	public static PageObjectClass oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		EnterValuestoAutomationDemo();
	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new PageObjectClass(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://demo.automationtesting.in/Register.html");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void EnterValuestoAutomationDemo()
	{
		try
		{
			oPage.firstnameTextField().sendKeys("Ranga");
			oPage.lastnameTextField().sendKeys("Gowda");
			oPage.mailidTextField().sendKeys("rangnath.t.p@gmail.com");
			oPage.phoneTextField().sendKeys("9902224731");
			oPage.genderRadioButton().click();
			oPage.hobbiesChechBox1().click();
			oPage.hobbiesChechBox2().click();
			oPage.Language().sendKeys("Kannada");
			oPage.submitbtnPress().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
