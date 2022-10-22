package com.examarly.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS {
    
    public static WebElement waitforelementtobevisibleWebElement(WebDriver driver, WebElement webElement, int seconds) {
		
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
    	
    	return element;
     }
    
    public static WebElement waitforelementtobeclickable(WebDriver driver, WebElement webElement, int seconds) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;
	}
}
