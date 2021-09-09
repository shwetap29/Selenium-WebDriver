package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/");
		
		Thread.sleep(5000);
		//Xpath using Attributes (single attributes )
		//Enter jio number
//		driver.findElement(By.xpath("//input[@id='last_name1']")).sendKeys("8770199820");
//		Thread.sleep(5000);
		
		
		//Image function
//		driver.findElement(By.xpath("//img[@alt='jio logo']")).click();
//		Thread.sleep(7000);
//		
		//Xpath using Attributes (Multiple attributes ) 
		//Recharge
//		driver.findElement(By.xpath("//a[@class='pkv-nav-link'][@title='Get Jio SIM']")).click();
//		Thread.sleep(5000);
		
		//Using text() Function
		//For Try SIM Home Delivery
		driver.findElement(By.xpath("//div[text()='Try SIM Home Delivery']")).click();
		
		// Using And (get jio sim)
//		driver.findElement(By.xpath("//a[@class='pkv-nav-link'and @title='Get Jio SIM']")).click();
		
		//Using Or
		//driver.findElement(By.xpath("//input[@id='last_name1' or @pattern='[0-9]']")).sendKeys("8007705205");		
		
		//Using Contains() function
//		driver.findElement(By.xpath("//div[contains(text(),'Try SIM Home De')]")).click();
//		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
