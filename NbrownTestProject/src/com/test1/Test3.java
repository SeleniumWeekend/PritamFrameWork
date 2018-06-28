package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplybe.com/en-in/login");
		
		Thread.sleep(4000);
		
		WebElement signInTxtWebElm = driver.findElement(By.id("j_username"));
		
		// Clear the text Value 
		signInTxtWebElm.clear();
		
		//Enter the Value inside the text box
		signInTxtWebElm.sendKeys("abcd@jdw.com");
		
		//Capture the back end attribute value
		String attValue = signInTxtWebElm.getAttribute("type");
		System.out.println(attValue);
		
		// Capture the xAxis and yAxis of the web Element at run time
		Point p = signInTxtWebElm.getLocation();
		
		int xAxis = p.x;
		int yAxis = p.y;
		System.out.println(xAxis+" , "+yAxis);
		
		// Capture the Style of the web element like color, font size..etc
		String color = signInTxtWebElm.getCssValue("background-color");
		System.out.println(color);
		
		// Capture the dimension of the Web Element
		Dimension d1 = signInTxtWebElm.getSize();
		int h1 = d1.height;
		int w1 = d1.width;
		
		System.out.println(h1+" "+w1);
		
		
		WebElement w2 = driver.findElement(By.xpath("//label[@class='sign-in show-password']"));
		w2.click();
		
		boolean b1 = w2.isSelected();
		
		System.out.println(b1);
		
		String tagName = w2.getTagName();
		System.out.println(tagName);
		
		w2.submit();
		
		
		
	}

}
