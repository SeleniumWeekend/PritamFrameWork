package com.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("file:///C:/Users/SHALINI%20KUMARI/Desktop/singleselect.html");
		
		WebElement prefLoc = driver.findElement(By.id("locationPrefId"));
	
		Select sel = new Select(prefLoc);
		
		boolean b = sel.isMultiple();
		
		if(b)
		{
			List<WebElement> lst = sel.getOptions();
			for(int i=0; i<=lst.size()-1; i++)
			{
				WebElement w2 = lst.get(i);
				String s1= w2.getText();
				if(s1.equals("Chandigarh"))
				{
					sel.selectByVisibleText("Chandigarh");
				}
				
				else if(s1.equals("Gurgaon"))
				{
					sel.selectByVisibleText("Gurgaon");
				}
				
				else if(s1.equals("Mumbai"))
				{
					sel.selectByVisibleText("Mumbai");
				}
			}
			
			
		}
	}
}
