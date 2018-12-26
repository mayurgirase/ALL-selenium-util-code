package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public   class B {
	 public static void main(String[] args) throws InterruptedException  {	
		/* System.getProperty("webdriver.ie.driver", "F:\\Selenium prgm\\IEDriverServer.exe");*/
		 
		 String month_name = null;
		
				 
				
			
		 WebDriver driver=new FirefoxDriver();
         
         driver.manage().window();
         driver.get("https://www.facebook.com/");
         WebElement day=driver.findElement(By.id("day"));
         WebElement month=driver.findElement(By.id("month"));
         WebElement year=driver.findElement(By.id("year"));
         org.openqa.selenium.support.ui.Select dd=new org.openqa.selenium.support.ui.Select(day);
         dd.selectByIndex(16);
         Thread.sleep(2000);
         org.openqa.selenium.support.ui.Select dd1=new org.openqa.selenium.support.ui.Select(month);
         dd1.selectByIndex(10);
         Thread.sleep(3000);
         org.openqa.selenium.support.ui.Select dd2=new org.openqa.selenium.support.ui.Select(year);
         dd2.selectByVisibleText("1992");
        
         List<WebElement> month_list= dd1.getOptions();
         int total_month=month_list.size();
         System.out.println(total_month);
         
         for(WebElement ele:month_list) {
        	  month_name=ele.getText();
        	 System.out.println(month_name);
         }
         
			
   }	 
}	
