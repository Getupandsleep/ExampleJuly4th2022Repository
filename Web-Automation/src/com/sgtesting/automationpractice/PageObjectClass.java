package com.sgtesting.automationpractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {

	PageObjectClass(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	
	@FindBy(xpath="//img[@src]")
	private List<WebElement> noOfVideos;
	
	public List<WebElement> noOfVideosYouTube()
	{
		return noOfVideos;
	}
	
	@FindBy(xpath="//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")
	private WebElement firstname;
	
	public WebElement firstnameTextField()
	{
		return firstname;
	}
	
	@FindBy(xpath="//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")
	private WebElement lastname;
	
	public WebElement lastnameTextField()
	{
		return lastname;
	}
	
	@FindBy(xpath="//*[@id=\'eid\']/input")
	private WebElement mail;
	
	public WebElement mailidTextField()
	{
		return mail;
	}
	
	@FindBy(xpath="//*[@id=\'basicBootstrapForm\']/div[4]/div/input")
	private WebElement phone;
	
	public WebElement phoneTextField()
	{
		return phone;
	}
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement gender;
	
	public WebElement genderRadioButton()
	{
		return gender;
	}
	
	private WebElement checkbox1;
	
	public WebElement hobbiesChechBox1()
	{
		return checkbox1;
	}
	
	private WebElement checkbox2;
	
	public WebElement hobbiesChechBox2()
	{
		return checkbox2;
	}
	
	private WebElement checkbox3;
	
	public WebElement hobbiesChechBox3()
	{
		return checkbox3;
	}
	
	private WebElement msdd;
	
	public WebElement Language()
	{
		return msdd;
	}
	
	private WebElement countries;
	
	public WebElement countriesSelection()
	{
		return countries;
	}
	
	private WebElement submitbtn;
	
	public WebElement submitbtnPress()
	{
		return submitbtn;
	}
	
	@FindBy(xpath="//li[text()='India']")
	private WebElement selectCountry;
	
	public WebElement selectCountry()
	{
		return selectCountry;
	}
	
	@FindBy(xpath="@FindBy(xpath=\'//li[text()='India']\')")
	private WebElement clickCountry;
	
	public WebElement clickOnCountry()
	{
		return clickCountry;
	}
}
