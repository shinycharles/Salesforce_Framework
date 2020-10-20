package com.ta.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;

import com.ta.salesforce.testcases.BaseClass;


public class TestNG_Listeners extends BaseClass{
	public void test1()
	{
		System.out.println("I am at salesforce login page!");
		
	}
	
	public void test2() throws InterruptedException
	{
		System.out.println("I am at Home page!");
		
		driver.get("https://www.salesforce.com/");
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		//LoginToWebsite();
		WebDriverWait wait=new WebDriverWait (driver,5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
			
		WebDriverWait wait1=new WebDriverWait (driver,5);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
			
			
			driver.findElement(By.id("username")).click();
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("shiny@ati.com");
			
			Thread.sleep(1000);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).sendKeys("apple123");
			
			//Thread.sleep(1000);
			//driver.findElement(By.id("rememberUn")).click();
			 
			
			Thread.sleep(1000);
			driver.findElement(By.id("Login")).submit();
			System.out.println("We are Logged in!");
			
			driver.close();
			
	}

	
}
