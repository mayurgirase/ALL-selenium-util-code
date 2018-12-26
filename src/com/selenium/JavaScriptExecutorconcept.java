package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JavaScriptExecutorconcept {
	static WebDriver dr;
	public static void main(String[] args) throws IOException {
		
		dr=new FirefoxDriver();
		dr.get("F:\\Selenium prgm\\Offline Website\\index.html");
		JavascriptExecutor js =((JavascriptExecutor) dr);
			
		dr.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		dr.findElement(By.id("password")).sendKeys("123456");
		
		WebElement lgnbtn=dr.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		
		js.executeScript("arguments[0].click();", lgnbtn);
		String text=js.executeScript("return document.title;").toString();
		System.out.println(text);
		js.executeScript("history.go(0)");
		js.executeScript("window.scrollBy(0,150)");
		//flash(lgnbtn, dr);
		
		
	}
	/*public static void flash(WebElement we, WebDriver dr) {
		JavascriptExecutor js =((JavascriptExecutor) dr);
		
		String bgcolor=we.getCssValue("backgroungdColor");
		for(int i=0;i<=100;i++) {
			changecolor("rgb(0,200,0)",we,dr);
			changecolor(bgcolor,we,dr);
		}
		
	}
	
	public static void changecolor(String color, WebElement we, WebDriver dr) {
		
		JavascriptExecutor js =((JavascriptExecutor) dr);
			
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'"+we);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			
		}
	}*/
	


}
