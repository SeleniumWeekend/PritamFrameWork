package com.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\Downloads\\SeleniumJara\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/shop/signin/display.action?decoration=true&cm_sp=JDW-Header-_-SignIn-_-SignIn");
		
		WebElement w1 = driver.findElement(By.xpath("(//h2[text()='Sign In'])[1]"));
	

		String s1 = w1.getText();
		String s2 = "SIGN IN";
		
		if(s1.equals(s2))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		boolean b1 = w1.isDisplayed();
		if(b1)
		{
			System.out.println("Sign In Page Displayed");
		}
		else
		{
			System.out.println("Sign In Page not Displayed");
		}
		
		List<WebElement> lst = driver.findElements(By.xpath("(//h2[text()='Sign In'])[1]"));
		int len = lst.size();
		
		if(len>0)
		{
			System.out.println("Sign In Page Displayed");
		}
		else
		{
			System.out.println("Sign In Page not Displayed");
		}
	}
}
