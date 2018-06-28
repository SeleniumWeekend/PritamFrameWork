package com.actionsclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardOperation {

	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\NbrownTestProject\\Server\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		Timeouts t1 = waitForPageLoad();
		t1.implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement emailWebElm = driver.findElement(By.name("identifier"));
		emailWebElm.sendKeys("seleniumweekend");
		
		WebElement nxtWebElm = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtWebElm.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("Abcd@123");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		t1.pageLoadTimeout(60, TimeUnit.SECONDS);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[text()='New'])[1]")));
		
		WebElement w1 = driver.findElement(By.xpath("(//div[text()='New'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(w1).click(w1).perform();
		
		
		
		
//		driver.navigate().refresh();
//		System.out.println(lst.size());
//		if(lst.size()>0)
//		{
//			for(int i=0; i<lst.size(); i++)
//			{
//				WebElement fld = lst.get(i);
//				Actions act = new Actions(driver);
//				act.contextClick(fld).perform();
//				act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_UP).perform();
//				act.sendKeys(Keys.ENTER).perform();
//				Thread.sleep(1000);
//			}
//		}
		
	}
	
	public static Timeouts waitForPageLoad()
	{
		Timeouts t1=null;
		try
		{
			Options o1 = driver.manage();
			t1 = o1.timeouts();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return t1;
	}

}
