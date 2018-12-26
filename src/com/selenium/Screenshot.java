package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot {
	static WebDriver dr;
	public static void main(String[] args) throws IOException {
		dr=new FirefoxDriver();
		dr.get("F:\\\\Selenium prgm\\\\Offline Website\\\\index.html");
		takescrernshot("AdminLTE");
	}

	
	public static void takescrernshot(String fnmae) throws IOException {
		//take screenshot and store in desired file format
		
		File file=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		//copy the screenshot to desired location using copyfile format
		
		FileUtils.copyFile(file, new File(System.getProperty("C:\\Users\\new201809\\Selenium\\src\\")+"\\Screenshot\\"+fnmae+".png"));
		
		
	}
	
}
