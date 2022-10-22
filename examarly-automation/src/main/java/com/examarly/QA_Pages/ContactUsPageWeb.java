package com.examarly.QA_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassWeb;

public class ContactUsPageWeb extends BaseclassWeb{

	public ContactUsPageWeb() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Contact Us'])[1]")
	WebElement ContactUS;
	@FindBy(xpath = "(//img[@alt='text_vector'])[2]")
	WebElement generalEnquiries;
	@FindBy(xpath = "(//img[@alt='text_vector'])[3]")
	WebElement jobEnquiries;
	@FindBy(xpath = "(//div[@class='contactUs-landing-bottom-panel-find-Us-here-container'])[1]")
	WebElement Map;
	

	public void Contactus() throws InterruptedException {
		ContactUS.click();
		Thread.sleep(4000);
	}

	public void GeneralEnquiries() throws InterruptedException {
		generalEnquiries.click();
		Thread.sleep(4000);
	}

	public void JobEnquieries() throws InterruptedException {
		jobEnquiries.click();
		Set<String> windows14 = driver.getWindowHandles();
		Iterator<String> iterator = windows14.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void GoogleMap() throws InterruptedException {
		Map.click();
		Set<String> windows15 = driver.getWindowHandles();
		Iterator<String> iterator = windows15.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(5000);
	}

	
}
