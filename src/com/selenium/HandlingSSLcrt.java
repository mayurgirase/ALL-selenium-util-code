package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HandlingSSLcrt {
	
	public static void main(String[] args) throws InterruptedException {
		//FirefoxProfile profile=new FirefoxProfile();
		//profile.setAcceptUntrustedCertificates(true);
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//WebDriver dr=new FirefoxDriver();
		//dr.get("https:www.cacert.org/");
		
		/*System.setProperty("webdriver.ie.driver", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome.lnk");
		
		WebDriver dr=new InternetExplorerDriver();
		Thread.sleep(2000);
		dr.get("https:www.cacert.org/");*/
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium prgm\\SelEx\\chromedriver.exe");
			WebDriver dr=new ChromeDriver(cap);
			dr.get("https:www.cacert.org/");
		
		
	}

}
