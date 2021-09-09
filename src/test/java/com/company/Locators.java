package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	WebElement ETb  = driver.findElement(By.id("email"));   //Used id locator to find login text box
	
	//Enter value into Login Text Box
	ETb.sendKeys("shwetaprasad48@gmail.com");
	
	//Used Name locator to find  password text box
	WebElement passTb = driver.findElement(By.name("pass"));
	Thread.sleep(3000);
	
	//Enter value into password text box
	passTb.sendKeys("LK@12345");
	Thread.sleep(2000);
	
	//Login
//	driver.findElement(By.name("login")).click();
//	Thread.sleep(3000);
	
	//Login By css Selector
//	driver.findElement(By.cssSelector("button[name='login']")).click();
//	Thread.sleep(2000);
	
	
	//Forgot password By link text
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(2000);
	
	//Forgot password by Partial Link Text
//		driver.findElement(By.partialLinkText("Forgotten passwor")).click();
//		Thread.sleep(3000);
	
	//Create new account by Link Text
//		driver.findElement(By.linkText("Create New Account")).click();
//		Thread.sleep(4000);
		
		//Create new account By Partial Link Text
//		driver.findElement(By.partialLinkText("Create New Accou")).click();
//		Thread.sleep(3000);
		
		//driver.close();

	
}
}
