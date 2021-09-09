package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesPrac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/css/css_table.asp");
		
		//Xpath Axes
		//self 
	     String text1 =driver.findElement(By.xpath("//*[contains(text(),'Island Tradi')]/self::*")).getText();
	     System.out.println(text1);
     
//	   //parent  
//	     String text2 =driver.findElement(By.xpath("//*[contains(text(),'Island Tradi')]/self::*/parent::tr")).getText();
//	     System.out.println(text2);
	     
//	     //child 
//	     String text3 =driver.findElement(By.xpath("//*[contains(text(),'Island Tradi')]/self::*/child::td")).getText();
//	     System.out.println(text3);
	     
	     
	    //Ancestor
//	     String text4 =driver.findElement(By.xpath("//*[contains(text(),'Island Tradi')]/ancestor::tr")).getText();
//	     System.out.println(text4);
  
	         
	     
	     
	     //Descendant
//	     java.util.List<WebElement> element1 = driver.findElements(By.xpath("//[contains(text(),'Island Tradi')]/ancestor::table/descendant::"));
//	     System.out.println(element1.size());
     
	     //Preceding-sibling
	   

		Thread.sleep(6000);
		driver.close();
	}

}
