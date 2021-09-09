package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Validating Facebook home page using URL of the page
//Using URL of the page

public class Checkpoint2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shwetaprasad48@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("LK@12345");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		String expectedUrl = "submit";
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Home page is displayed");
		}else {
			System.out.println("Home page is NOT displayed");
		}
	
	}
}
