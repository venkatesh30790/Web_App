package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class LoginPageTest extends TestBase{
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
			
	}
	
	@Test(priority=1)
	public void loginLogout() throws InterruptedException{
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//button[@id='cbfm-Login-button']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("both7000@mailinator.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//i[@class='material-icons avatar']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
		
		
		
	}
	
	@Test(priority=2)
	public void loginLogoutvalidation() throws InterruptedException{
		
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
			
		WebElement ValText = driver.findElement(By.xpath("//span[text()='This field must be a valid email address']"));
		WebElement ValText1 = driver.findElement(By.xpath("//span[text()='Input should be 6-10 characters in length']"));
		
		boolean displayed = ValText.isDisplayed();
		boolean displayed2 = ValText1.isDisplayed();
		
		if(displayed && displayed2 == true ){
			System.out.println("Both Email and Password are invalid");
		}else if(displayed == true){
			System.out.println("Entered email id is invalid enter proper emailid");
		}
		else{
			System.out.println("Entered password is invalid enter proper password");
		}
	}
	
	
	@Test(priority=3)
	public void loginLogoutvalidation1() throws InterruptedException{
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("both7000");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
			
		WebElement ValText = driver.findElement(By.xpath("//span[text()='This field must be a valid email address']"));
		WebElement ValText1 = driver.findElement(By.xpath("//span[text()='Input should be 6-10 characters in length']"));
		boolean displayed = ValText.isDisplayed();
		boolean displayed2 = ValText1.isDisplayed();
		
		if(displayed && displayed2 == true ){
			System.out.println("Both Email and Password are invalid");
		}else if(displayed == true){
			System.out.println("Entered email id is invalid enter proper emailid");
		}
		else{
			System.out.println("Entered password is invalid enter proper password");
		}
	}
	
	@Test(priority=4)
	public void loginLogoutvalidation2() throws InterruptedException{
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("789555");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
			
			WebElement ValText = driver.findElement(By.xpath("//span[text()='This field must be a valid email address']"));
			WebElement ValText1 = driver.findElement(By.xpath("//span[text()='Input should be 6-10 characters in length']"));
			
			boolean displayed = ValText.isDisplayed();
			boolean displayed2 = ValText1.isDisplayed();
			
			if(displayed && displayed2 == true ){
				System.out.println("Both Email and Password are invalid");
			}else if(displayed == true){
				System.out.println("Entered email id is invalid enter proper emailid");
			}
			else{
				System.out.println("Entered password is invalid enter proper password");
			}
	}	
	
	
	@Test(priority=5)
	public void forgotpassword() throws InterruptedException{
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("both700@mailinator.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement Text = driver.findElement(By.xpath("//span[text()='This field is required']"));
		WebElement Text1 = driver.findElement(By.xpath("//span[text()='This field must be a valid email address']"));
		//WebElement Text2 = driver.findElement(By.xpath("//p[text()='The verification Email has been sent to your registered Email account.']"));
		
		if(Text.isDisplayed() == true){
			System.out.println("You did not enter Email id Please re-enter ");
		}else if(Text1.isDisplayed() == true){
			System.out.println("Please enter valid email id");
		}else{
			driver.findElement(By.xpath("//a[text()='Back to Login']")).click();
		}
		
		
	}
	
	
	
	@Test(priority=6)
	public void forgotpasswordVal1() throws InterruptedException{
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gfddsf");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement Text = driver.findElement(By.xpath("//span[text()='This field is required']"));
		WebElement Text1 = driver.findElement(By.xpath("//span[text()='This field must be a valid email address']"));
		//WebElement Text2 = driver.findElement(By.xpath("//p[text()='The verification Email has been sent to your registered Email account.']"));
		
		if(Text.isDisplayed() == true){
			System.out.println("You did not enter Email id Please re-enter ");
		}else if(Text1.isDisplayed() == true){
			System.out.println("Please enter valid email id");
		}else{
			driver.findElement(By.xpath("//a[text()='Back to Login']")).click();
		}
		
		
	}
	
	@Test(priority=7)
	public void forgotpasswordVal2() throws InterruptedException{
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement Text = driver.findElement(By.xpath("//span[text()='This field is required']"));
		WebElement Text1 = driver.findElement(By.xpath("//span[text()='This field must be a valid email address']"));
		//WebElement Text2 = driver.findElement(By.xpath("//p[text()='The verification Email has been sent to your registered Email account.']"));
		
		if(Text.isDisplayed() == true){
			System.out.println("You did not enter Email id Please re-enter ");
		}else if(Text1.isDisplayed() == true){
			System.out.println("Please enter valid email id");
		}else{
			driver.findElement(By.xpath("//a[text()='Back to Login']")).click();
		}
		
		
	}
	
	

	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
