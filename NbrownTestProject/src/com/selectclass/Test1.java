package com.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/SHALINI%20KUMARI/Desktop/singleselect.html");
	
		WebElement w1 = driver.findElement(By.xpath("//select[@id='cityId']"));
		
		Select sel = new Select(w1);
		
		sel.selectByVisibleText("Chandigarh");
		
		sel.selectByValue("6");
		
		sel.selectByIndex(2);
		// Select expected value from Single selct Dropdown
		List<WebElement> lst = sel.getOptions();
		
		for(int i=0; i<=lst.size()-1; i++)
		{
			WebElement w2 = lst.get(i);
			String value = w2.getText();
			if(value.equals("Delhi"))
			{
				sel.selectByVisibleText("Delhi");
			}
		}
		
		
	
	}
}
