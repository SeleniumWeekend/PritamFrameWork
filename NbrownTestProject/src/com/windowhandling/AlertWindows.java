package com.windowhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindows 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//span[contains(text(),'AGENT LOGIN')])[1]")).click();
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.id("loginbutton"));
		w1.click();
		
		Thread.sleep(3000);
		try
		{
			Alert alt = driver.switchTo().alert();
			
			String val1 = alt.getText();
			if(val1.equals("Enter User ID"))
			{
				alt.accept();
			}
		}
		catch(Exception e)
		{
			new Exception("Alert not present");
		}
		
		WebElement score = driver.findElement(By.xpath("//div[text()='IRE']//following::div[1]"));
		
		score.getText();
	}

}
