package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			//Enter The Url
			driver.get("https://www.flipkart.com/");
			driver.navigate().to("https://www.google.com/");   //to() navigate to any website
			Thread.sleep(6000);
			
			driver.navigate().back();          //back() will navigate to the immediate previous page
			Thread.sleep(3000);
			
			driver.navigate().forward();      //forward() will navigate to the immediate next page
			Thread.sleep(4000);
			
			driver.navigate().refresh();   //Refresh the current page
			driver.close();
			
	}
}
