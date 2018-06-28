package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args)
	{
		// Step 1: Set the browser server
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\Downloads\\SeleniumJara\\chromedriver.exe");
		
		// Step 2: Open Empty Browser
		WebDriver driver = new ChromeDriver();
		
		// Step 3: Pass URL in Browser
		driver.get("https://www.jdwilliams.co.uk/");
		
		// Step 4: Identify the WebElement
		WebElement signInWebElm = driver.findElement(By.xpath("(//a[@title='Sign In'])[1]"));
		
		// 5: Perform the action on the WebElement
		signInWebElm.click();
		
		// Step 6: Verify the result
		WebElement signInText = driver.findElement(By.xpath("//h2[text()='Sign In']"));
		String actualTxt = signInText.getText();
		System.out.println(actualTxt);
		String expectedTxt = "SIGN IN";
		
		if(actualTxt.equals(expectedTxt))
		{
			System.out.println("We are in correct page");
		}
		
		// Step : 7 Close the browser
		driver.close();
		

	}
}
