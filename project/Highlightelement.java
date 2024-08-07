package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlightelement {
	public static void main(String[] args) {
      
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        //To launch gmail.com
	driver.get("https://www.gmail.com");
        //Collects the webelement
	WebElement ele = driver.findElement(By.id("identifierId"));
        //Create object of a JavascriptExecutor interface
	JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
	js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 4px solid red;');", ele);
	//
	}

}
