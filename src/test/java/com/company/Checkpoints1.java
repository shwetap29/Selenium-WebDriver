package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Validating Facebook home page using Title of the page
//Using Title of the page


public class Checkpoints1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/pages/create/?ref_type=registration_form");
//		driver.findElement(By.id("email")).sendKeys("shwetaprasad48@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("LK@12345");
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(3000);
		
		
		String expectedTitle="facebook";
		String actualTitle= driver.getTitle();
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}
	}

}
