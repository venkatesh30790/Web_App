package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class Invite_Vehicle extends TestBase {
	
	public Invite_Vehicle(){
		super();
		}
	
	@BeforeMethod
	public void setUp(){
		initialization();			
	}
	
	
	@Test(priority=1)
	public void InviteVehicle1() throws InterruptedException{
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Vehicles']")).click();
		

		driver.findElement(By.xpath("//app-button[@ng-reflect-title='Add']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter License Plate Number']")).sendKeys("JJJJJJJJ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='ADD_VEHICLE']")).click();
		
		WebElement ValText = driver.findElement(By.xpath("//span[text()='Vehicle Not Found']"));
		
		if(ValText.isDisplayed()==true){
			System.out.println("Vehicle not found try adding new vehicle");
		}else{
			System.out.println("Vehicle added successfully");
		}
		
		driver.findElement(By.xpath("//span[@class='fa fa-fw fa-close']")).click();
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
	}
	
	@Test(priority=2)
	public void InviteVehicle2() throws InterruptedException{
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Vehicles']")).click();
		

		driver.findElement(By.xpath("//app-button[@ng-reflect-title='Add']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter License Plate Number']")).sendKeys("HH 69");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-button[@ng-reflect-title='ADD_VEHICLE']")).click();
		
//		WebElement ValText = driver.findElement(By.xpath("//span[text()='Vehicle Not Found']"));
//		
//		if(ValText.isDisplayed()==true){
//			System.out.println("Vehicle not found try adding new vehicle");
//		}else{
//			System.out.println("Vehicle added successfully");
//		}
		
		driver.findElement(By.xpath("//span[@class='fa fa-fw fa-close']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("HH 69");
		boolean displayed = driver.findElement(By.xpath("//span/b[text()='HH 69']")).isDisplayed();
		if (displayed==true){
			System.out.println("Vehicle Added successfully");
		}else{
			System.out.println("Vehicle not Added successfully");
		}
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
