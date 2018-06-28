package com.actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		
		WebElement emailWebElm = driver.findElement(By.name("identifier"));
		emailWebElm.sendKeys("seleniumweekend");
		
		WebElement nxtWebElm = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtWebElm.click();
		Thread.sleep(4000);
		
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("Abcd@123");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(7000);
		
		List<WebElement> lst = driver.findElements(By.xpath("//span[text()='SampleFolder']"));
		
		if(lst.size()>0)
		{
			for(int i=0; i<lst.size(); i++)
			{
				WebElement fld = lst.get(i);
				fld.click();
				
				driver.findElement(By.xpath("(//div[@aria-label='Remove'])[1]/div")).click();
			}
		}
		
		Actions act = new Actions(driver);
		
		WebElement newWebElm = driver.findElement(By.xpath("(//div[text()='New'])[1]"));
//		newWebElm.click();
		act.moveToElement(newWebElm).click(newWebElm).perform();
		Thread.sleep(1000);
		
		WebElement fldWebElm = driver.findElement(By.xpath("(//div[text()='Folder'])[1]"));
		fldWebElm.click();
		Thread.sleep(1000);
		
		
		act.sendKeys("SampleFolder").perform();
		
		driver.findElement(By.xpath("(//button[@name='ok'])[1]")).click();
		
		
		
		
	
	}
	
}
