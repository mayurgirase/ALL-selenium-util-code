package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunitdrver {
	 
	public static void main(String[] args) {
		
		WebDriver dr= new HtmlUnitDriver();
	dr.get("http://www.google.com");
	
	
	WebElement element = dr.findElement(By.name("q"));
				element.sendKeys("javabykiran");
				 element.submit();
	System.out.println("page title:"+dr.getTitle());
	
	dr.quit();
	
}
}