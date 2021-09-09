package com.company;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Mouse_Operations {
	public static void main(String[] args) throws InterruptedException,AWTException{
		System.setProperty("webdriver.chrome.driver","C:/Users/Shweta/Downloads/chromedriver.exe");
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Enter The Url
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(5000);
		
		//Creating an object for Robot class
		Robot r = new Robot();
		r.mouseMove(400, 500);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
