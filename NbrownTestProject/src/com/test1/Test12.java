package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	
	public static WebDriver driver=null;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.simplybe.com/en-in/");
	}
	
	public static void selectCountry()
	{
		String url = driver.getCurrentUrl();
		if(url.contains("uk"))
		{
			System.out.println("Select USA");
		}
	}
	
	public static void capturePageSource()
	{
		String code = driver.getPageSource();
		
		if(code.contains("JOANNA HOPE EMBELLISHED JEANS"))
		{
			System.out.println("Product is present in Page Source");
		}
	}
	
	public static void searchProduct(String ProductName, String value) throws InterruptedException
	{
		WebElement w1 = driver.findElement(By.id("searchString1"));
		w1.sendKeys(ProductName);
		
		WebElement w2 = driver.findElement(By.xpath("//button[@id='searchBoxSubmitBtn']"));
		w2.click();
		
		Thread.sleep(4000);
		
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(value))
		{
			System.out.println("We are in PLP Page");
		
		}
	}
	public static void naviagteTo(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void navigateBack()
	{
		driver.navigate().back();
	}
	
	public static void navigateForward()
	{
		driver.navigate().forward();
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}
}
