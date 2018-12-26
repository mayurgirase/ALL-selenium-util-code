package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements_loacator {
	public static void main(String[] args) {

	    //
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/ajax.html");
	   /* WebElement we =driver.findElement(By.id("yes"));
	    we.click();*/
	    List<WebElement> elements = driver.findElements(By.name("name"));
	    
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	    	elements.get(i).click();
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	      
	    }
	  }

}
