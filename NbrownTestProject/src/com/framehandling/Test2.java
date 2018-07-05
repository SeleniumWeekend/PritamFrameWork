package com.framehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://drive.google.com");
		
		List<WebElement> lst = driver.findElements(By.xpath("//div[text()='SampleFolder']"));
	
		int i=0;
		for(i=0; i<=lst.size()-1; i++)
		{
			lst.get(i).click();
			WebElement w1 = driver.findElement(By.xpath("//div[text()='SampleFile']"));
			String s1 = w1.getText();
			if(s1.equals("SampleFile"))
			{
				break;
			}
		}
		
		WebElement w1 = driver.findElement(By.xpath("(//div[text()='SampleFolder'])["+i+"]"));
		w1.click();
		
		
		
	}
}
