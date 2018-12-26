package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingUnchDropdwns {
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://v4-alpha.getbootstrap.com/components/dropdowns/");
		
		dr.findElement(By.xpath("//button[contains(text(),'Dropdown button')]")).click();
		List<WebElement> list=dr.findElements(By.xpath("//div[contains(@class,'dropdown-menu') and contains(@aria-labelledby,'dropdownMenuButton']//a"));
			System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if( list.get(i).getText().equals("Another action")){
				list.get(i).click();
				break;
		}
	}
 }

}
