package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robotclass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("file:///F:/Selenium%20prgm/JBK%20Offline/index.html");
		Robot rb= new Robot();
		rb.mouseMove(630, 430);
		rb.delay(1500);
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		rb.delay(1500);
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		/*rb.keyPress(InputEvent.COMPONENT_LAST);
		Thread.sleep(2000);
		rb.keyRelease(InputEvent.COMPONENT_LAST);*/
		Thread.sleep(2000);
	}

}
