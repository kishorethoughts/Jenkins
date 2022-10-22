package com.examarly.QA_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassWeb;

public class BlogPageWeb extends BaseclassWeb{
	
	public BlogPageWeb (){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'homepage-navbar-right-navgations-item blog btn-stp-cpy')]//div[contains(text(),'Blog')]")
	WebElement bloG;
	@FindBy(xpath = "//a[normalize-space()='Download App']")
	WebElement Downloadapp;
	@FindBy(xpath = "//span[@class='cs-header__scheme-toggle-element']")
	WebElement toggle;
	@FindBy(xpath = "(//a[@class='cs-overlay-link'])[5]")
	WebElement article1;
	@FindBy(xpath = "//div[@class='cs-footer__copyright']")
	WebElement bottomPage;
	@FindBy(xpath = "(//img[@title='examarly blog 35'])[2]")
	WebElement Startpreppingnow;
	
	public void BloG() throws InterruptedException {
		bloG.click();
		Thread.sleep(4000);
	}

	public void DownloadApp() throws InterruptedException {
		Downloadapp.click();
		Set<String> windows16 = driver.getWindowHandles();
		Iterator<String> iterator = windows16.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void Toggle() throws InterruptedException {
		toggle.click();
		Thread.sleep(2000);
		toggle.click();
		Thread.sleep(4000);
	}

	public void BlogArticle() throws InterruptedException {
		article1.click();
		Thread.sleep(4000);
	}

	public void BlogBottomPage() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(bottomPage).build().perform();
		Thread.sleep(5000);
	}
}
