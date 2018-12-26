package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecttestDemo {
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///F:/Selenium%20prgm/Offline%20Website/index.html");
		
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("kiran@gmail.com");
		dr.findElement(By.xpath(".//*[@id='password']")).sendKeys("123456");
		dr.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
		dr.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a")).click();
		dr.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		WebElement element=dr.findElement(By.xpath("//select[contains(@class,'form-control')]"));
		//Select se=new Select(element);
			//se.selectByIndex(1);
			
		/*Select se1=new Select(element);
			se1.selectByValue("HP");	*/
		Select se1=new Select(element);
		se1.selectByVisibleText("Punjab");	
	}

}
