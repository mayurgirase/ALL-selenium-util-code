package com.selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassdemo {
	public static void main(String[] args) {
		 String baseUrl = "http://demo.guru99.com/test/newtours/";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		
		driver.get(baseUrl);           
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    
         
        Actions builder = new Actions(driver);
        org.openqa.selenium.interactions.Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
         
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);        
        mouseOverHome.perform();        
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
}
		
		
		
		/*WebElement txtUsername = driver.findElement(By.id("email"));
		WebElement button=driver.findElement(By.name("websubmit"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(txtUsername,button ).build().perform();*/
		
				
				
		/*org.openqa.selenium.interactions.Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();
			
		seriesOfActions.perform() ;
*/
	}


