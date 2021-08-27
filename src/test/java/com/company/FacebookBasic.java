package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
				
				driver.findElement(By.name("reg_passwd__")).sendKeys("LK@12345");
				driver.findElement(By.name("birthday_day")).sendKeys("29");
				driver.findElement(By.name("birthday_month")).sendKeys("March");
				driver.findElement(By.name("birthday_year")).sendKeys("1998");
				WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
				radio.click();
				try {
					Thread.sleep(200000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.name("wesubmit")).submit();
				try {
					Thread.sleep(15000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(driver.getTitle());
				driver.close();
				driver.quit();
	}		

	}
