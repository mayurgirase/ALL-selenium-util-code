package com.selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HaddlingCookies {
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.flipkart.com");
		
		dr.manage().window().maximize();
		
		Set<org.openqa.selenium.Cookie> cookies=dr.manage().getCookies();
		for(org.openqa.selenium.Cookie cookie: cookies) {
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getDomain());
			System.out.println(cookie.getExpiry());
			System.out.println(cookie.isSecure());
		}
		
	}

}
