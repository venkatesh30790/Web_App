package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class Fleet_InviteDriver extends TestBase {
	
	public Fleet_InviteDriver(){
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setUp(){
		initialization();			
	}
	
	
	
	@Test(priority=1)
	public void InviteDriver1() throws InterruptedException{
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Drivers']")).click();
		

		driver.findElement(By.xpath("//app-button[@ng-reflect-title='Add Driver']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys("both700@mailinator.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='INVITE']")).click();
		driver.findElement(By.xpath("//label[text()='Select a Vehicle']")).click();
		driver.findElement(By.xpath("//span[text()='HH 68']")).click();
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='ADD_TO_FLEET']")).click();
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='Close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	
	
	
	}
	
	@Test(priority=2)
	public void InviteDriver2() throws InterruptedException{
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Drivers']")).click();
		

		driver.findElement(By.xpath("//app-button[@ng-reflect-title='Add Driver']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys("both700@mailinator.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='INVITE']")).click();
		driver.findElement(By.xpath("//label[text()='Select a Vehicle']")).click();
		driver.findElement(By.xpath("//span[text()='HH 68']")).click();
		//driver.findElement(By.xpath("//app-button[@ng-reflect-title='ADD_TO_FLEET']")).click();
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='Close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	
	
	
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
