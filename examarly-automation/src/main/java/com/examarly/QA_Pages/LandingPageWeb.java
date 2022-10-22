package com.examarly.QA_Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassWeb;

public class LandingPageWeb extends BaseclassWeb {

public LandingPageWeb() 
{
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//div[@class='homepage-landing-section-hero-button join-community btn-stp-cpy'][contains(text(),'Get Started')]")
	WebElement Started;
	@FindBy(xpath = "//button[@class='ng-binding'][1]")
	 WebElement dontAllow;
	@FindBy(xpath = "//div[@class='homepage-landing-section-hero-button start-todays-prep btn-stp-cpy'][contains(text(),'I Already Have an Account')]")
	WebElement login;
	@FindBy(xpath = "//div[@class='homepage-examsteps-card-item prep_01']//div[@class='homepage-examsteps-card-item-animation-layer']")
	WebElement hovermouse1;
	@FindBy(xpath = "//div[@class='homepage-examsteps-card-item prep_02']//div[@class='homepage-examsteps-card-item-animation-layer']")
	WebElement hovermouse2;
	@FindBy(xpath = "//div[@class='homepage-examsteps-card-item prep_03']//div[@class='homepage-examsteps-card-item-animation-layer']")
	WebElement hovermouse3;
	@FindBy(xpath = "//div[@class='homepage-examsteps-card-item prep_04']//div[@class='homepage-examsteps-card-item-animation-layer']")
	WebElement hovermouse4;
	@FindBy(xpath = "//div[@class='homepage-examsteps-card-item prep_05']//div[@class='homepage-examsteps-card-item-animation-layer']")
	WebElement hovermouse5;
	@FindBy(xpath = "//div[@class='homepage-examsteps-card-item prep_06']//div[@class='homepage-examsteps-card-item-animation-layer']")
	WebElement hovermouse6;
	@FindBy(xpath = "//div[@class='homepage-meet-the-face-meet-others-button btn-stp-cpy']")
	WebElement meet;
	@FindBy(xpath = "//img[@alt='arrow right']")
	WebElement forward;
	@FindBy(xpath = "//div[@class='homepage-review-panel-review-button next']")
	WebElement review;
	@FindBy(xpath = "//div[@class='homepage-review-panel-review-button next']//img[@alt='arrow right']")
	WebElement goForword;
	@FindBy(xpath = "//div[@class='homepage-review-panel-review-button prev']//img[@alt='arrow left']")
	WebElement goBackward;
	@FindBy(xpath = "//div[@class='homepage-exam-prep-text-button-container btn-stp-cpy'] ")
	WebElement started1;
	@FindBy(xpath = "//div[@class='homepage-article-container']")
	WebElement article;
	@FindBy(xpath = "(//img[@alt='examarly logo'])[11]")
	WebElement yourStory1h;
	@FindBy(xpath = "(//img[@alt='examarly logo'])[12]")
	WebElement yourStory1;
	@FindBy(xpath = "(//img[@alt='examarly logo'])[13]")
	WebElement inc;
	@FindBy(xpath = "(//img[@alt='examarly logo'])[14]")
	WebElement edex;
	@FindBy(xpath = "(//img[@alt='examarly logo'])[15]")
	WebElement dainik;
	@FindBy(xpath = "//div[@class='homepage-footer-bottom-text-inner btn-stp-cpy'][normalize-space()='Privacy Policy']")
	WebElement down;
	@FindBy(xpath = "//a[@href='/aboutus']")
	WebElement aboutUs;
	@FindBy(xpath = "//div[@class='homepage-footer-upper-columns-2 contact-Us btn-stp-cpy']//a[normalize-space()='Contact Us']")
	WebElement contactUs;
	@FindBy(xpath = "//a[@href='/FAQ']")
	WebElement faq;
	@FindBy(xpath = "//div[@class='homepage-footer-upper-columns-2 Blog btn-stp-cpy'][normalize-space()='Blog']")
	WebElement blog;
	@FindBy(xpath = "//div[@class='homepage-footer-upper-columns-2 community btn-stp-cpy ']")
	WebElement community;
	@FindBy(xpath = "//div[@class='homepage-footer-upper-columns-2 Blog btn-stp-cpy'][normalize-space()='Answers']")
	WebElement answers;
	@FindBy(xpath = "//div[@class='homepage-footer-upper-columns-4-download-now btn-stp-cpy']")
	WebElement downloadNow;
	@FindBy(xpath = "//img[@alt='fb logo']")
	WebElement fb;
	@FindBy(xpath = "//img[@alt='insta logo']")
	WebElement insta;
	@FindBy(xpath = "//img[@alt='twitter logo']")
	WebElement twitter;
	@FindBy(xpath = "//img[@alt='linkedIn logo']")
	WebElement linkedin;
	@FindBy(xpath = "//img[@alt='Yt logo']")
	WebElement youtube;
	@FindBy(xpath = "//div[@class='homepage-footer-bottom-text-inner btn-stp-cpy'][1]")
	WebElement terms;
	@FindBy(xpath = "//div[@class='homepage-footer-bottom-text-inner btn-stp-cpy'][2]")
	WebElement privacypolicy;
	@FindBy(xpath = "//div[@class='homepage-navbar-left-container']//img[@alt='examarly logo']")
	WebElement xamarly;
	
	

	public void GetStarted() throws InterruptedException {
		Started.click();
		Thread.sleep(4000);
	}

	public void DontAllow() throws InterruptedException {
		dontAllow.click();
		Thread.sleep(4000);
	}
	public void GoBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(4000);
	}

	public void LoginButton() throws InterruptedException {
		login.click();
		Thread.sleep(4000);
	}

	public void Hover() throws InterruptedException {
		Actions action = new Actions(driver);

		action.moveToElement(hovermouse1).build().perform();
		Thread.sleep(2000L);
		action.moveToElement(hovermouse2).build().perform();
		Thread.sleep(2000L);
		action.moveToElement(hovermouse3).build().perform();
		Thread.sleep(2000L);
		action.moveToElement(hovermouse4).build().perform();
		Thread.sleep(2000L);
		action.moveToElement(hovermouse5).build().perform();
		Thread.sleep(2000L);
		action.moveToElement(hovermouse6).build().perform();
		Thread.sleep(4000);

	}

	public void MeetTheTeam() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(meet).build().perform();
		Thread.sleep(4000L);
		meet.click();

		Thread.sleep(4000);

		for (int i = 1; i <= 4; i++) {
			forward.click();
			Thread.sleep(3000);
		}
	}

	public void Review() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(review).build().perform();
		Thread.sleep(4000L);
		review.click();

	}
		
	public void GoForward() throws InterruptedException {
		goForword.click();
		Thread.sleep(4000);
	}
	
	public void GoBackward() throws InterruptedException {
		goBackward.click();
		Thread.sleep(4000);
	}
	

	public void GetStarted1() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(started1).build().perform();
		Thread.sleep(3000L);
		started1.click();
		Thread.sleep(4000);
	}

	public void Article() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(article).build().perform();
		Thread.sleep(4000L);

	}

	public void YourStoryHindi() throws InterruptedException {
		yourStory1h.click();
		Set<String> windows1 = driver.getWindowHandles();
		Iterator<String> iterator = windows1.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void YourStory() throws InterruptedException {
		yourStory1.click();
		Set<String> windows2 = driver.getWindowHandles();
		Iterator<String> iterator = windows2.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void inc42() throws InterruptedException {
		inc.click();
		Set<String> windows3 = driver.getWindowHandles();
		Iterator<String> iterator = windows3.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void edexo() throws InterruptedException {
		edex.click();
		Set<String> windows4 = driver.getWindowHandles();
		Iterator<String> iterator = windows4.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void dainikBhaskar() throws InterruptedException {
		dainik.click();
		Set<String> windows5 = driver.getWindowHandles();
		Iterator<String> iterator = windows5.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void Bottom() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(down).build().perform();
		Thread.sleep(4000);
	}

	public void AboutUs() throws InterruptedException 
	{
		aboutUs.click();
		Thread.sleep(4000);
	}

	public void ContactUs() throws InterruptedException {
		contactUs.click();
		Thread.sleep(4000);
	}

	public void FAQ() throws InterruptedException {
		faq.click();
		Thread.sleep(4000);
	}

	public void Blog() throws InterruptedException {
		blog.click();
		Set<String> windows6 = driver.getWindowHandles();
		Iterator<String> iterator = windows6.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);

	}

	public void Community() throws InterruptedException {
		community.click();
		Set<String> windows7 = driver.getWindowHandles();
		Iterator<String> iterator = windows7.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void Answers() throws InterruptedException {
		answers.click();
		Set<String> windows8 = driver.getWindowHandles();
		Iterator<String> iterator = windows8.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}
			
	public void DownLoadNow() throws InterruptedException {
	    downloadNow.click();
	    Set<String> windows9 = driver.getWindowHandles();
	    Iterator<String> iterator = windows9.iterator();
	    String parent = iterator.next();
	    String child = iterator.next();
	    driver.switchTo().window(child);
	    Thread.sleep(5000);
	    driver.close();
	    driver.switchTo().window(parent);
	    Thread.sleep(4000);
	}

	public void Fb() throws InterruptedException {
		fb.click();
		Set<String> windows9 = driver.getWindowHandles();
		Iterator<String> iterator = windows9.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void Insta() throws InterruptedException {
		insta.click();
		Set<String> windows10 = driver.getWindowHandles();
		Iterator<String> iterator = windows10.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void Twitter() throws InterruptedException {
		twitter.click();
		Set<String> windows11 = driver.getWindowHandles();
		Iterator<String> iterator = windows11.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void LinkedIn() throws InterruptedException {
		linkedin.click();
		Set<String> windows12 = driver.getWindowHandles();
		Iterator<String> iterator = windows12.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}

	public void YouTube() throws InterruptedException {
		youtube.click();
		Set<String> windows13 = driver.getWindowHandles();
		Iterator<String> iterator = windows13.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(4000);
	}
	
	public void TermsofServices() throws InterruptedException {
		terms.click();
		Thread.sleep(4000);
	}
	
	public void PrivacyPolicy() throws InterruptedException {
		privacypolicy.click();
		Thread.sleep(4000);
	}
	
	public void Xamarly() throws InterruptedException{
		xamarly.click();
		Thread.sleep(5000);
	    }
	
	
}