package com.sgtesting.CSSSelectorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorCreationDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoluteCSSselector();
		//cssWithonlyTagname();
		//cssWithTagnameIDattributeandValue();
		//cssWithIDattributeValuealone();
		//cssWithTagnameClassAttributeandValue();
		//csswithClassAttributeValueAlone();
		//csswithTagnameAttributeNameandValue();
		//csswithTagnamewithMultipleAttributeNameandValue();
		//cssWithoutTagnameWithAttributeNameandValue();
		//cssWithPartialMatchingofAttributeNameandValue();
		//CSSWithTagnameandAttributeName();
		//cssBasedonParentChildRelationships();
		//cssBasedonParentnthChildRelationships();
		cssBasedonParentnthChildSiblings();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///G:/HTML/HTML%20WebPages/ToAutomate.html");
			//oBrowser.get("https://www.amazon.in/Bourge-Loire-1-Running-Shoes-8-Loire-1-Grey-08/dp/B07LFD7FDN?ref_=ast_sto_dp");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*Absolute Css selector
	 * for first name
	 * Syntax: html body form input
	 */
	private static void absoluteCSSselector()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("html body form input")).sendKeys("Ranganath T P");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//Relative CSS-Selectors 
	//CSS selector using tagname alone
	//Syntax: <input>
	private static void cssWithonlyTagname()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input")).sendKeys("Ranganath T P");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//CSS Selector with tagname with id attribute name and value
	//Syntax:<tagname>#<id attribute value>

	private static void cssWithTagnameIDattributeandValue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input#dob")).sendKeys("02/10/19960");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//CSS selector with id attribute value alone if id value is unique throughout
	//Syntax: #<id attribute value> 

	private static void cssWithIDattributeValuealone()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("#bb")).sendKeys("MysoreBranch");
			//String text=oBrowser.findElement(By.xpath("//span[@id='productTitle']")).getText();
			//System.out.println(text);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//CSS Selector with tag name and class attribute value
	//Syntax: <tagname>.<classattributevalue>

	private static void cssWithTagnameClassAttributeandValue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input.health")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//CSS Selector with class attribute value alone if class value is unique throughout
	//Syntax: .<classAttributeValue>

	private static void csswithClassAttributeValueAlone()
	{
		try
		{
			oBrowser.findElement(By.cssSelector(".health")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//CSS Selector along with tag name, attribute name and value
	//Syntax: <tagname>[attributename='attributevalue']

	private static void csswithTagnameAttributeNameandValue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input[value='Save']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//CSS Selector along with tag name, with multiple attribute name and value
	//Syntax: <tagname>[attributename='attributevalue'][attributename='attributevalue']

	private static void csswithTagnamewithMultipleAttributeNameandValue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input[type='button'][value='Save']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	//CSS selector with attribute name and value and without tag name
	//Syntax: *[attributename='attributevalue']
	
	private static void cssWithoutTagnameWithAttributeNameandValue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("*[value='Save']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//CSS selector with partial matching of attribute name and value
	//Syntax starts with: <tagname>[attributename ^='partial attribute value']
	//Syntax ends with: <tagname>[attributename $='partial attribute value']
	//Syntax contains: <tagname>[attributename *='partial attribute value']
	
	private static void cssWithPartialMatchingofAttributeNameandValue()
	{
		try
		{
			//oBrowser.findElement(By.cssSelector("input[id ^='cap']")).sendKeys("hduwhd");
			oBrowser.findElement(By.cssSelector("input[id *='tch']")).sendKeys("dnwhd");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//CSS selector with tag name and attribute name
	//Syntax: <tagname>[attributename]
	
	private static void CSSWithTagnameandAttributeName()
	{
		try
		{
			List<WebElement> oList=oBrowser.findElements(By.xpath(""));
			System.out.println("The number of input available are: "+oList.size());
			for(int i=0;i<oList.size();i++)
			{
				String oLis=oList.get(i).getText();
				System.out.println(oLis);
				if(oLis.contains("ll"))
				{
					oList.get(i).click();
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//CSS selector based on parent child relationship
	//Syntax: parent Element > child Element
	
	private static void cssBasedonParentChildRelationships()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("form#frm1>input")).sendKeys("ranga");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//CSS selector based on nth child relationship
	//Syntax: parent Element > :nth-child(number)
	

	private static void cssBasedonParentnthChildRelationships()
	{
		try
		{
			//oBrowser.findElement(By.cssSelector("form#frm1>:nth-child(3)")).sendKeys("ranga");
			oBrowser.findElement(By.cssSelector("form#frm1  >:nth-child(2)")).sendKeys("Ranga");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//CSS selector based on siblings
	//Syntax: ParentElement > <tagname>+<tagname>+<tagname>
	
	private static void cssBasedonParentnthChildSiblings()
	{
		try
		{
			//oBrowser.findElement(By.cssSelector("form#frm1> input + input")).sendKeys("ranga");
			oBrowser.findElement(By.cssSelector("form#frm1> input + input + input")).sendKeys("Ranga");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
