package com.selenium.project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		WebDriverManager.firefoxdriver().setup();
		  FirefoxDriver driver1 =   new FirefoxDriver();
		  driver1.get("https://www.flipkart.com");
	

}
}