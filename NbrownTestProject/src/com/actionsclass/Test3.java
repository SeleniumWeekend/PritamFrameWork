package com.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		
		WebElement emailWebElm = driver.findElement(By.name("identifier"));
		emailWebElm.sendKeys("seleniumweekend");
		
		WebElement nxtWebElm = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtWebElm.click();
		Thread.sleep(4000);
		
		WebElement w1 = driver.findElement(By.xpath("//div[text()='seleniumweekend@gmail.com']"));
		
		Actions act = new Actions(driver);
		System.out.println();
		act.doubleClick(w1).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform();
		
		WebElement pw = driver.findElement(By.name("password"));
		
		act.sendKeys(pw, Keys.chord(Keys.CONTROL, "v")).perform();
		
	}
}
