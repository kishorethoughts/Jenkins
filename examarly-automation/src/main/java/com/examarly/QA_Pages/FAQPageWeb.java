package com.examarly.QA_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassWeb;

public class FAQPageWeb extends BaseclassWeb{

	public FAQPageWeb (){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//a[@href='/faq'])[1]")
	WebElement FaQ;
	@FindBy(xpath = "(//div[@class='faq-faqs-item-question-container'])[1]")
	WebElement div;
	@FindBy(xpath = "(//div[@class='faq-faqs-item-question-container'])[2]")
	WebElement div1;
	@FindBy(xpath = "(//div[@class='faq-faqs-item-question-container'])[3]")
	WebElement div2;
	@FindBy(xpath = "(//div[@class='faq-faqs-item-question-container'])[4]")
	WebElement div3;
	
	
	public void Faq() throws InterruptedException {
		FaQ.click();
		Thread.sleep(4000);
	}

	public void Div1() throws InterruptedException {
		div.click();
		Thread.sleep(2000);
		div.click();
		Thread.sleep(4000);
	}

	public void Div2() throws InterruptedException {
		div1.click();
		Thread.sleep(2000);
		div1.click();
		Thread.sleep(4000);
	}

	public void Div3() throws InterruptedException {
		div2.click();
		Thread.sleep(2000);
		div2.click();
		Thread.sleep(4000);
	}

	public void Div4() throws InterruptedException {
		div3.click();
		Thread.sleep(2000);
		div3.click();
		Thread.sleep(5000);
	}	
	
}
