package com.selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
	 
	static WebDriver dr;
	@BeforeSuite
	public void openbrowser() {
		
	
	dr=new FirefoxDriver();
		dr.get("F:\\\\Selenium prgm\\\\Offline Website\\\\index.html");
	}
  @Test
  public void f() {
	 
	  String expected= "Register a new membership";
	  
  }
}
