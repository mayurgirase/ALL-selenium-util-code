package com.selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class HandlingWebtable {
		public static void main(String[] args) {
			WebDriver driver;
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///F:/Selenium%20prgm/Offline%20Website/index.html");
			
			
			
			
			WebElement un=driver.findElement(By.xpath(".//*[@id='email']"));
			WebDriverWait wait=new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
						un.sendKeys("kiran@gmail.com");
			WebElement pw=driver.findElement(By.id("password"));
						pw.sendKeys("123456");	
						
			WebElement si=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
						si.click();
						
			WebElement us=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
						us.click();
			WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody"));			
						
			java.util.List<WebElement> tr=table.findElements(By.tagName("tr"));
			
			System.out.println("no.of rows "+tr.size());
			
			for(WebElement row:tr) {
				java.util.List<WebElement>td=table.findElements(By.tagName("td"));
				System.out.print(row.getText());
				for(WebElement col:td) {
					System.out.print(" ");
				}
			System.out.println(" ");	
						
			}
			}

	


}
