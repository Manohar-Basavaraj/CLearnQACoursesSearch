package com.clearnqacoursessearch.sample;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	
	private static XSSFWorkbook workbook;
	
	static List<String> CourseTitle;
	static List<String> CourseDescription;
	static List<String> CourseSource;
	static List<String> CourseId;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manohar.b\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://cognizantlearning.sumtotal.host/Broker/Account/Login.aspx?wtrealm=https%3a%2f%2fCOGNIZANTLEARNING.sumtotal.host%2fCore%2f&ByPassFederation=1&ReturnUrl=http%3a%2f%2fcognizantlearning.sumtotal.host%2fBroker%2fToken%2fSaml11.ashx%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252fCOGNIZANTLEARNING.sumtotal.host%252fCore%252f%26wreply%3dhttps%253a%252f%252fCOGNIZANTLEARNING.sumtotal.host%252fCore%26ByPassFederation%3d1&IsHybridOrNativeClient=False&domainid=52160A28FC58BBBE7D714E075077AC76");
		driver.manage().window().maximize();
		driver.findElement(By.name("ctl00$ctl00$ctl00$BodyContent$MainContent$MainContentPlaceHolder$UserName"))
				.sendKeys("SVD00592", Keys.ENTER);
		driver.findElement(By.name("ctl00$ctl00$ctl00$BodyContent$MainContent$MainContentPlaceHolder$Password"))
				.sendKeys("ArrowPluto@6", Keys.ENTER);

		Thread.sleep(8000);

		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/ul/li[4]/ul/li[1]/a/i"));

		search.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"txtSearch-main\"]")).sendKeys("Security Testing");

		Thread.sleep(3000);

		driver.findElement(
				By.xpath("/html/body/div[1]/section/div[2]/section/div[3]/div[2]/div[2]/div/div[1]/div/div[2]/button/i"))
				.click();
		
		Thread.sleep(3000);

		// WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("searchContentContainer
		// ActivitycontentAlignment")));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class='searchContentContainer
		// ActivitycontentAlignment')]")));

		// Thread.sleep(5000);

		// List<WebElement> count =
		// driver.findElements(By.xpath("//*[contains(@class='searchContentContainer
		// ActivitycontentAlignment')]"));

		// System.out.print(count.size());

		// List<WebElement> searchmain =
		// driver.findElements(By.xpath("//div[@class='skillSoft_Results']//descendant::a"));

		// List<WebElement> searchmain =
		// driver.findElements(By.xpath("//div[@class='skillSoft_Results']//descendant::div[@class='searchContentContainer
		// ActivitycontentAlignment']//descendant::a"));

		// System.out.println(searchmain.size());

		// List<WebElement> searchmain =
		// driver.findElements(By.xpath("//div[@class='skillSoft_Results']"));

		// System.out.println(searchmain.size());

		// List<WebElement> searchmain =
		// driver.findElements(By.className("fullSearchBucket"));
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		//driver.switchTo().frame("productPillarFrame");
		
		CourseTitle = new ArrayList<String>();
		CourseDescription = new ArrayList<String>();
		CourseSource = new ArrayList<String>();
		CourseId = new ArrayList<String>();
		
		
		List<WebElement> pageIndex = driver.findElements(By.xpath("//nav[@class='ng-table-pager ng-scope']//li//button"));


		System.out.println(pageIndex.size());


		for(int j=1;j<pageIndex.size()-2;j++) {
			
			
				
			
		
		
		System.out.println("----------------------------------------------------TITLE----------------------------------------------------------"); 

		List<WebElement> searchmain = driver.findElements(By.xpath("//div[@class='skillSoft_Results']//li//a"));

	   
	   //System.out.println(searchmain.size());
	   
	   
	   
	   for(int i=0;i<searchmain.size();i++) {
		   
		   String title = searchmain.get(i).getText();
		   
		   CourseTitle.add(title);
		   
		   System.out.println(searchmain.get(i).getText());  
		   
	   }
	   
	   
	   System.out.println("-----------------------------------------------DESCRIPTION---------------------------------------------------------------"); 
	   
	   
	   List<WebElement> seacrhCreator = driver.findElements(By.xpath("//div[@class='skillSoft_Results']//li//p"));
	   
	   
  for(int i=0;i<seacrhCreator.size();i++) {
	  
	  		String description = seacrhCreator.get(i).getText();
	  		
	  		CourseDescription.add(description);
		   
		   System.out.println(seacrhCreator.get(i).getText());  
		   
	   }
  
  
  
 /* System.out.println("--------------------------------------------------------------------------------------------------------------"); 
  
  
  List<WebElement> seacrhDescription = driver.findElements(By.xpath("//div[@class='skillSoft_Results']//li//div[2]//span[2]"));
  
  
for(int i=0;i<seacrhDescription.size();i++) {
	   
	   System.out.println(seacrhDescription.get(i).getText());  
	   
  }*/


/*System.out.println("--------------------------------------------------------------------------------------------------------------"); 


List<WebElement> actualSize = driver.findElements(By.xpath("//div[@class='search_activityResults']"));


for(int i=0;i<actualSize.size();i++) {
	
	
	if(actualSize.get(i).findElements(By.xpath("//span[text()='Duration']")) != null){
		
		
		List<WebElement> sample = actualSize.get(i).findElements(By.xpath("//span[text()='Duration']//following-sibling::span"));
		
		 System.out.println(sample.get(i).getText());
		
		}else{
			
		System.out.println("Not Available");
		
		}

	   
	    
	   
}*/






System.out.println("------------------------------------------------SOURCE--------------------------------------------------------------"); 


List<WebElement> courseCreator = driver.findElements(By.xpath("//div[@class='skillSoft_Results']//li//span[text()='Activity Type']//following-sibling::span"));


for(int i=0;i<courseCreator.size();i++) {
	
	
		String source = courseCreator.get(i).getText();
		
		CourseSource.add(source);
	
		
		System.out.println(courseCreator.get(i).getText());
		
	
}



System.out.println("-------------------------------------------COURSE CODE-------------------------------------------------------------------"); 


List<WebElement> courseCode = driver.findElements(By.xpath("//div[@class='skillSoft_Results']//li//span[text()='Activity Code']//following-sibling::span"));


for(int i=0;i<courseCode.size();i++) {
	
	
	String id = courseCode.get(i).getText();
	
	CourseId.add(id);
		
		System.out.println(courseCode.get(i).getText());
		
	
}


/*List<WebElement> pageIndex = driver.findElements(By.xpath("//nav[@class='ng-table-pager ng-scope']//li//button"));


System.out.println(pageIndex.size());


for(int i=2;i<pageIndex.size()-2;i++) {
	
	System.out.println(pageIndex.get(i).getText());
	
}*/



	
pageIndex.get(j+2).click();

Thread.sleep(3000);

//driver.navigate().refresh();


		}

//nav[@class='ng-table-pager ng-scope']

	
	/*if(driver.findElement(By.xpath("//div[@class='skillSoft_Results']//li//descendant::span[text()='Duration']")).isDisplayed()) {
		
		
		//System.out.println("Available");
		
		List<WebElement> sample = test.get(i).findElements(By.xpath("//span[text()='Duration']//following-sibling::span"));
		
		 System.out.println(sample.get(i).getText());
		
		
	}else {
		
		
		System.out.println("Not available");
	}*/


	   
	   //System.out.println(test.get(i).getText());  
	writingToExcel(CourseTitle,CourseDescription,CourseSource,CourseId);  


	}
	
	
	
	
//Excel Function
	
	
	public static void writingToExcel(List<String> CourseTitle, List<String> CourseDescription, List<String> CourseSource,List<String> CourseCode) {
		workbook = new XSSFWorkbook();
		int rownum = 0;
		int cellnum = 0;
		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("QA Courses");
		for (int i = 0; i < CourseTitle.size(); i++) {
			Row row = sheet.createRow(rownum++);
			
			// this line creates a cell in the next column of that row
			org.apache.poi.ss.usermodel.Cell cell = row.createCell(cellnum++);

			cell.setCellValue(CourseTitle.get(i));
			cell = row.createCell(cellnum++);
			cell.setCellValue(CourseDescription.get(i));
			cell = row.createCell(cellnum++);
			cell.setCellValue(CourseSource.get(i));
			cell = row.createCell(cellnum++);
			cell.setCellValue(CourseCode.get(i));
			
			cellnum = 0;

		}
		try {
			// this Writes the workbook gfgcontribute
			FileOutputStream out = new FileOutputStream(new File("CourseDetails.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("Course Details" + ".xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

}
