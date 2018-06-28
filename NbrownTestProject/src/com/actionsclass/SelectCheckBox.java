package com.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectCheckBox
{
	WebDriver driver = null;
	public boolean selectCheckBoxAndVerify(String labelName)
	{
		boolean b1 = false;
		try
		{
			WebElement chkBox = driver.findElement(By.xpath("//div[contains(text(),'"+labelName+"')]//following::div[1]"));
			chkBox.click();
			b1 = chkBox.isSelected();
		}
		catch(Exception e)
		{
			new Exception("Check box is not checked");
		}
		return b1;
	}
	
	@Test
	public void verifyCheckBox()
	{
		try
		{
			System.setProperty("wedriver.chrome.driver", "Path os the chrome driver");
			driver = new ChromeDriver();
			driver.get("Pass Url");
			boolean b = selectCheckBoxAndVerify("CheckBox Label Name");
			if(b)
			{
				System.out.println("hdhdh");
				Assert.assertTrue(b, "Check Box is not Selected");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
