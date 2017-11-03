package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class UpdateFleet extends TestBase  {
	
	public UpdateFleet(){
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setUp(){
		initialization();			
	}
	
	@Test(priority=2)
	public void VehicleBooking() throws InterruptedException{
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Vehicle Booking']")).click();
		driver.findElement(By.xpath("//span[text()='New Request']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Requestor Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Requestor Name']")).sendKeys("venkatesh30790@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Requestor Phone Number']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Requestor Phone Number']")).sendKeys("8431453001");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Requestor Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Requestor Email']")).sendKeys("Both 7000 Orgnaisation");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Pickup location']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Pickup location']")).sendKeys("Badami");
		driver.findElement(By.xpath("//span[text()='Badami, Karnataka, India']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter drop location']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter drop location']")).sendKeys("Bagalkot");
		driver.findElement(By.xpath("//span[text()='Bagalkot, Karnataka, India']")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Pickup Time']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Enter Optional Comments']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Optional Comments']")).sendKeys("Urgent Requiremnt please come fast");
		
		driver.findElement(By.xpath("//button[@type='undefined']")).click();
		
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
	}
	
	
	
	@Test(priority=1)
	public void UpdateFleet1() throws InterruptedException{
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Settings']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter organisation name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter organisation name']")).sendKeys("Both 7000 Orgnaisation");
		driver.findElement(By.xpath("//input[@placeholder='Enter Street']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Street']")).sendKeys("Nanjappa Layout");
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@placeholder='Enter State']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@placeholder='Enter Country']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@placeholder='Enter Zip Code']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Zip Code']")).sendKeys("560031");
		driver.findElement(By.xpath("//button[@type='undefined']")).click();
		driver.findElement(By.xpath("//span[text()='Fleet']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Both 7000 Orgnaisation");
		driver.findElement(By.xpath("//button[@type='undefined']")).click();
		
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
