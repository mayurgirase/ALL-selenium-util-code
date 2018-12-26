package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDropdowns {
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		dr.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> list=dr.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		for(int i=0;i<list.size();i++) {
			list.get(i).click();
			if( list.get(i).isSelected()){
				list.get(i).click();
		}
	}
 }
}
