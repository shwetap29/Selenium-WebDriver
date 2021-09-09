package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		System.out.print(" Title : "+driver.getTitle());
		System.out.println(" Current Url : "+driver.getCurrentUrl());
		driver.findElement(By.name("email")).sendKeys("shwetaprasad48@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("LK@12345");
		driver.findElement(By.name("login")).click();
	//driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(40000);
		driver.close();
	}

}
