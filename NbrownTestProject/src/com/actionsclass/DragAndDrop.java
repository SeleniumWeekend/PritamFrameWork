package com.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("(//span[text()='Thrillers'])[1]"));
		
		WebElement destination = driver.findElement(By.xpath("(//span[text()='History'])[2]"));
	
		Actions act = new Actions(driver);
	
	// First Way
		Action act1 = act.clickAndHold(source).moveToElement(destination).release(destination).build();
		act1.perform();
		
	// 2nd  Way		
		act.dragAndDrop(source, destination).perform();
	
	// 3rd Way
		Point p1 = destination.getLocation();
		int xAxis = p1.x;
		int yAxis = p1.y;
		act.dragAndDropBy(source, xAxis, yAxis).perform();
	}

}
