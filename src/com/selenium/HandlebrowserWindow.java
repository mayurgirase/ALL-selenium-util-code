package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlebrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[@href='http://www.popuptest.com/popup2.html']")).click();
			Thread.sleep(2000);
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> itr=handler.iterator();
		
		String parentwindow=itr.next();
		System.out.println("parent window"+parentwindow);
		
		String childwindow=itr.next();
		Thread.sleep(2000);
		System.out.println("child window"+childwindow);
		driver.switchTo().window(childwindow);
		System.out.println("child window title"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		System.out.println("parent window title"+driver.getTitle());
		
	}

}
