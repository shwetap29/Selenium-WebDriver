package com.company;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfConverter {
	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.xpath("//span[contains(text(),'Select PDF files')]")).click();

	     //put path to your image in a clipboard
	     StringSelection ss = new StringSelection("Registeration.pdf");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	     //initate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);

	}
}


