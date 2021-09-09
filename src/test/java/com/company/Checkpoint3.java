package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Validating Facebook home page using any unique element of the page
//Using Unique element on the page

public class Checkpoint3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shwetaprasad48@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("LK@12345");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"));
		if(logout.isDisplayed()) {
			System.out.println("Home page is displayed");
			
		}else {
		
		System.out.println("Home page is NOT displayed");
		
	}

}
}