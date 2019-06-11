package com.clearnqacoursessearch.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	
	 public static void main(String[] args) throws InterruptedException   
	   {
	      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\manohar.b\\\\Downloads\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://cognizantlearning.sumtotal.host/Broker/Account/Login.aspx?wtrealm=https%3a%2f%2fCOGNIZANTLEARNING.sumtotal.host%2fCore%2f&ByPassFederation=1&ReturnUrl=http%3a%2f%2fcognizantlearning.sumtotal.host%2fBroker%2fToken%2fSaml11.ashx%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252fCOGNIZANTLEARNING.sumtotal.host%252fCore%252f%26wreply%3dhttps%253a%252f%252fCOGNIZANTLEARNING.sumtotal.host%252fCore%26ByPassFederation%3d1&IsHybridOrNativeClient=False&domainid=52160A28FC58BBBE7D714E075077AC76");
	      driver.findElement(By.name("ctl00$ctl00$ctl00$BodyContent$MainContent$MainContentPlaceHolder$UserName")).sendKeys("SVD00592",Keys.ENTER);
	      Thread.sleep(3000);
	      driver.findElement(By.name("ctl00$ctl00$ctl00$BodyContent$MainContent$MainContentPlaceHolder$Password")).sendKeys("ArrowPluto@6",Keys.ENTER);
	      Thread.sleep(4000);
	      WebElement login = driver.findElement(By.name("ctl00$ctl00$ctl00$BodyContent$MainContent$MainContentPlaceHolder$LoginButton"));
	      
	      login.click();
	      //driver.close();
	   }

}
