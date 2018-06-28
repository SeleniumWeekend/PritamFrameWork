package com.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("file:///C:/Users/SHALINI%20KUMARI/Desktop/singleselect.html");
		
		WebElement preLoc = driver.findElement(By.id("locationPrefId"));
	
		Select sel = new Select(preLoc);
		
		boolean b1 = sel.isMultiple();
		String[] s1 = {"Pune", "Ahmedabad", "Chennai", "Delhi"};
		
		List<WebElement> lst = sel.getOptions();
		
		if(b1)
		{
			for(String s : s1)
			{
				for(int i=0; i<lst.size(); i++)
				{
					String val = lst.get(i).getText();
					if(val.equals(s))
					{
						sel.selectByVisibleText(s);
						break;
					}
				}
			}
			
			// Capture all selected options
			List<WebElement> allWebElm = sel.getAllSelectedOptions();
			
			for(WebElement w : allWebElm)
			{
				System.out.println(w.getText());
			}
			
			// Fetch first seelcted option 
			WebElement w = sel.getFirstSelectedOption();
			
			System.out.println("First Selcted : "+w.getText());
			
			// deselect single option
			
			sel.deselectByVisibleText("Pune");
			
			// deselect all options
			
			sel.deselectAll();
			
		}
	
	}
}
