package com.sgtesting.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM {
	POM(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	
}
