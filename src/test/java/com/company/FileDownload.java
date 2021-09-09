package com.company;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	 public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/FileDownload.html");
		 Thread.sleep(3000);
		 
		 Robot robot = new Robot();
		 
		 for(int i =0; i < 13; i++) {
			 robot.delay(2000);
			 robot.keyPress(KeyEvent.VK_TAB);
			 
		 }
		 
		 	robot.delay(2000);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.delay(2000);

	        robot.keyPress(KeyEvent.VK_A);
	        robot.keyPress(KeyEvent.VK_T);
	        robot.delay(2000);
	        
	        robot.keyRelease(KeyEvent.VK_A);
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.delay(1000);
	        
	        driver.findElement(By.xpath("//button[@id='createTxt']")).click();
	        Thread.sleep(3000);
	        robot.keyPress(KeyEvent.VK_TAB);
	        robot.keyPress(KeyEvent.VK_ENTER);

	        robot.delay(1000);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        robot.keyRelease(KeyEvent.VK_ENTER);

	        driver.close();
}
}
