package com.company;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookBasic {
	public static void main (String[] args)
	{
		chrome();
	}
	static WebDriver  driver;
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		run();
	}
	
	public static void run() {
		//driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.name("firstname")).sendKeys("Shweta");
				driver.findElement(By.name("lastname")).sendKeys("Prasad");
				driver.findElement(By.name("reg_email__")).sendKeys("shwetaprasad48@gmail.com");
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shwetaprasad48@gmail.com");
				driver.findElement(By.name("reg_passwd__")).sendKeys("LK@12345");
				driver.findElement(By.name("birthday_day")).sendKeys("29");
				driver.findElement(By.name("birthday_month")).sendKeys("March");
				driver.findElement(By.name("birthday_year")).sendKeys("1998");
				//WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
				driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
//				radio.click();
//				try {
//					Thread.sleep(200000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
				driver.findElement(By.name("websubmit")).click();
				try {
					Thread.sleep(50000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				// Take screenshot and store it as a file format
				TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
				File SourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
				File destinationFile = new File("./Screenshot/"+"facebook"+ System.currentTimeMillis()+".png");
				try {
					FileHandler.copy(SourceFile,destinationFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				driver.findElement(By.xpath("//label[text(),'code')]")).click();
				driver.findElement(By.name("confirm")).click();
				try {
					Thread.sleep(500000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			
				
				
				

				
				//				File screenshotfullPage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				FileHandler.copyFile(screenshotfullPage, new File("Faceook-image" + ".png"));
//								
//				TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				File SourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//				File destinationFile = new File("C:/Users/Shweta/eclipse-workspace/SeleniumBasics/Screenshot" + "facebook-register-" + System.currentTimeMillis()+".png");
//				try {
//					FileHandler.copy(SourceFile, destinationFile);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				driver.quit();
	}		

	}
