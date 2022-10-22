package com.examarly.QA_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassWeb;

public class AboutPageWeb extends BaseclassWeb {

	public AboutPageWeb() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='About']")
	WebElement about;
	@FindBy(xpath = "//div[@class='aboutUs-our-story-text-container']")
	WebElement ourstory;
	

	public void Aboutus() throws InterruptedException {
		about.click();
		Thread.sleep(4000);
	}

	public void OurStory() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(ourstory).build().perform();
		Thread.sleep(5000);
	}
	
}
