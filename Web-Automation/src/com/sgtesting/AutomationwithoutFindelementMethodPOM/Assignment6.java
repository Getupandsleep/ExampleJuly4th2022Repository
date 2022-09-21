package com.sgtesting.AutomationwithoutFindelementMethodPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//modify project

public class Assignment6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logOut();
		closeBrowser();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			Thread.sleep(2000);
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
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logIn()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			oPage.getTasks().click();
			Thread.sleep(2000);
			oPage.addnewCustomerorProject().click();
			Thread.sleep(2000);
			oPage.newCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomernameTextField().sendKeys("Infosys");
			oPage.createCustomer().click();
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
			oPage.addnewCustomerorProject().click();
			Thread.sleep(1000);
			oPage.newProjectButton().click();
			Thread.sleep(1000);
			oPage.projectNameTextField().sendKeys("Cloud Computing");
			oPage.createProjectButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyProject()
	{
		try
		{
			oPage.projectSettingButton().click();
			Thread.sleep(1000);
			oPage.projectDescription().sendKeys("The project is ongoing and we are working on cloud Computing");
			Thread.sleep(1000);
			oPage.closeProject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oPage.projectSettingButton().click();
			Thread.sleep(1000);
			oPage.projectActionButton().click();
			oPage.deleteProjectButton().click();
			Thread.sleep(1000);
			oPage.deleteProjectConfirmation().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			oPage.customerSettingButton().click();
			Thread.sleep(1000);
			oPage.actionButtonCustomer().click();
			Thread.sleep(2000);
			oPage.deleteCustomerButton().click();
			oPage.deleteCustomerConfirmation().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logOut()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeBrowser()
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
