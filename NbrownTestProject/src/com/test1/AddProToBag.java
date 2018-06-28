package com.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProToBag {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplybe.com/en-in/");
		
		Thread.sleep(4000);
		
		WebElement searchTxtBox = driver.findElement(By.id("searchString1"));
		searchTxtBox.sendKeys("Jeans");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@id='searchBoxSubmitBtn']"));
		searchBtn.click();
		Thread.sleep(4000);
		
		List<WebElement> lst = driver.findElements(By.xpath("//p[@class='product-title']"));
		if(lst.size()>0)
		{
			System.out.println("We are in PLP Page");
		}
		else
		{
			System.out.println("We are not in PLP Page");
		}
		WebElement plpProduct = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		plpProduct.click();
		
		WebElement addProductToBAgBtn = driver.findElement(By.id("addToCartButton"));
		boolean  flag = addProductToBAgBtn.isDisplayed();
		
		if(flag)
		{
			System.out.println("We are in PDP page");
		}
		else
		{
			System.out.println("Not in PDP page");
		}
		
		Test12.capturePageSource();
		
		WebElement colorWebElm = driver.findElement(By.xpath("//span[text()='Dark Blue']"));
		colorWebElm.click();
		Thread.sleep(1000);
		
		WebElement sezeWebElm = driver.findElement(By.xpath("//span[text()='12']"));
		sezeWebElm.click();
		Thread.sleep(3000);
		
		List<WebElement> lst1 = driver.findElements(By.id("inStockStatus"));
		
		if(lst1.size()==1)
		{
			System.out.println("Product is in Stock");
		}
		else
		{
			System.out.println("Product is out of Stock");
		}
		
		addProductToBAgBtn.click();
		Thread.sleep(2000);
		
		WebElement w2 = driver.findElement(By.xpath("//div[contains(text(),'This item has been added to your bag.')]"));
		String actualMsg = w2.getText();
		
		if(actualMsg.contains("added to your bag"))
		{
			System.out.println("Product has been added to the bag");
		}
		else
		{
			System.out.println("Product is not added to the bag");
			System.out.println("mbnbmnb");
		}
		
		int count =0;
		List<WebElement> lst3 = driver.findElements(By.xpath("//p[@class='productTitle']/a"));
		
		for(int i=0; i<=lst3.size()-1; i++)
		{
			WebElement w1 = lst3.get(i);
			String s1 = w1.getText();
			if(s1.contains("Black"))
			{
				count++;
			}
		}
		
		System.out.println("Total no of Black jeans is : "+count);
	
	}

}
