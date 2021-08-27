package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
	public static void main(String[] args) {
		//System.setProperty("key","value");
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:/Users/Shweta/Downloads/geckodriver.exe");
		System.setProperty("webdriver.edge.driver","C:/Users/Shweta/Downloads/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		
		
	driver.get("https://www.google.com/");
	driver1.get("https://www.google.com/");
	driver2.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getPageSource());
		System.out.println(driver2.getCurrentUrl());
		driver.close();
		driver.quit();
			
	}
}

