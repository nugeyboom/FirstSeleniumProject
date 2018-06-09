package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/nugebui/Documents/selenium dependencies/drivers/chromedriver");
		
	WebDriver driver = new ChromeDriver();
		driver.get("http://www.cybertekschool.com");
//		WebDriver nb= new SafariDriver();
//		nb.get("http://www.espn.com");
//		
		
	}
}
