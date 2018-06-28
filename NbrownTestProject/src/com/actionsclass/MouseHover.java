package com.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplybe.com/en-sb/?site=simplyBe-row&clear=true");
		
		Thread.sleep(3000);
		
		WebElement fwWebElm = driver.findElement(By.linkText("FOOTWEAR"));
	
		Actions act= new Actions(driver);
		act.moveToElement(fwWebElm).perform();
		
		WebElement w1 = driver.findElement(By.xpath("(//a[@id='topNavDDMref_Boots'])[1]"));
		//w1.click();
		act.click(w1).perform();
		System.out.println("");
		
	
	}
}
