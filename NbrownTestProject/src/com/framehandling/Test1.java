package com.framehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://drive.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement emailWebElm = driver.findElement(By.name("identifier"));
		emailWebElm.sendKeys("seleniumweekend");
		
		WebElement nxtWebElm = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtWebElm.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("Abcd@123");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[text()='New'])[1]")));
	
		WebElement sampleFldWebElm = driver.findElement(By.xpath("(//span[text()='SampleFolder'])[1]"));
		sampleFldWebElm.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(@aria-label,'Share')])[1]/div")).click();
		Thread.sleep(2000);
		
		// Identified Frame WebElement
		WebElement frameWebElm = driver.findElement(By.xpath("//iframe[@title='Share with others']"));
		
		// Switching to Particular Frame
		TargetLocator t1 = driver.switchTo();
		t1.frame(frameWebElm);
		
		// Action Performed
		driver.findElement(By.xpath("//span[text()='Share with others']//following::textarea[2]")).sendKeys("abcd@jdw.com");
		
		
		// Came back to main Window
		//t1.defaultContent();
		driver.switchTo().defaultContent();
		
	}
}
