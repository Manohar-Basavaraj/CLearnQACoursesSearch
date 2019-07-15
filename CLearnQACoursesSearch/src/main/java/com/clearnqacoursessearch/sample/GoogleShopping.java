package com.clearnqacoursessearch.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleShopping {
	
	public static void main(String[] args) throws InterruptedException   
	   {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\manohar.b\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.findElement(By.id("fakebox-input")).sendKeys("Java",Keys.ENTER);
		 //driver.findElement(By.name("ctl00$ctl00$ctl00$BodyContent$MainContent$MainContentPlaceHolder$Password")).sendKeys("ArrowPluto@6",Keys.ENTER);
		 
		 Thread.sleep(8000);
		
	   }
	

}
