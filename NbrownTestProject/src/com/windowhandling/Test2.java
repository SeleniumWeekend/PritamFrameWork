package com.windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Capture the window id where the control is active presently
		
		String mainWinId = driver.getWindowHandle();
		
		// Capture all window Ids
		
		Set<String> allWinIds = driver.getWindowHandles();
		
		for(String winId :allWinIds)
		{
			if(!(mainWinId.equals(winId)))
			{
				driver.switchTo().window(winId);
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWinId);
		
		
		WebElement jobWebElm = driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobWebElm.click();
		
		Set<String> allWinId1 = driver.getWindowHandles();
		
		for(String winId :allWinId1)
		{
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle();
			
			if(actualTitle.contains("Browse Jobs by Company"))
			{
				WebElement w1= driver.findElement(By.xpath("//h2[text()='Browse Jobs by Locations']/../ul/li/a/span[@class='mum']"));
				w1.click();
				driver.close();
			}
		}
	}
}
