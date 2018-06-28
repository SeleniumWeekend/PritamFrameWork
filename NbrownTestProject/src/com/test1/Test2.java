package com.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\Downloads\\SeleniumJara\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplybe.com/en-in/login");
		
		Thread.sleep(4000);
		
		String[] s1 = {"pritam", "pritam#$", "pritam1234$"};
		
		driver.findElement(By.xpath("//button[@id='signin-new-customer-btn']")).click();
		
		for(String s: s1)
		{
			WebElement fName = driver.findElement(By.xpath("//input[@id='firstName']"));
			fName.clear();
			fName.sendKeys(s);
			WebElement lName = driver.findElement(By.id("lastName"));
			lName.click();
			
			List<WebElement> lst = driver.findElements(By.xpath("//div[text()='Please enter a valid first name']"));
			if(lst.size()>0)
			{
				System.out.println("First name is not valid");
			}
			else
			{
				System.out.println("First name is valid");
			}
		}
	}
}
