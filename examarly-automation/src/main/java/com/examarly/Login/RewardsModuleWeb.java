package com.examarly.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassLoginPageWeb;

 public class RewardsModuleWeb  extends BaseclassLoginPageWeb
 {
	
 public RewardsModuleWeb() {
	PageFactory.initElements(driver, this);
  }

 @FindBy(xpath = "//div[@class='homepage-landing-section-hero-button start-todays-prep btn-stp-cpy']")
 WebElement login;
 @FindBy(xpath = "//button[@class='ng-binding'][1]")
 WebElement dontAllow;
 @FindBy(xpath = "//input[@name='mobileNumber']")
 WebElement enterMobileNumber;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement loginClick;
 @FindBy(xpath = "//input[@name='otp1']")
 WebElement otp;
 @FindBy(xpath = "//input[@name='otp2']")
 WebElement otp1;
 @FindBy(xpath = "//input[@name='otp3']")
 WebElement otp2;
 @FindBy(xpath = "//input[@name='otp4']")
 WebElement otp3;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement verify;
 @FindBy(xpath = "//input[@id='emailAddress']")
 WebElement email;
 @FindBy(xpath = "//button[normalize-space()='Sign up']")
 WebElement signupinsidelogin;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement achievements;
 @FindBy(xpath = "(//div[contains(@class,'xp-details')])[1]//h3")
 WebElement totalXp;
 @FindBy(xpath ="//span[normalize-space()='Syllabus']")
 WebElement syllabus;
 @FindBy(xpath = "//h2[normalize-space()='Historical Background']")
 WebElement historicalBackground;
 @FindBy(xpath = "//h3[normalize-space()='Historical Background']")
 WebElement historicalBackgroundSubtopic;
 @FindBy(xpath = "//button[normalize-space()='Take Test']")
 WebElement takeTest;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement readytobegin;
 @FindBy(xpath = "//p[normalize-space()='A']")
 WebElement q1;
 @FindBy(xpath = "//button[@class='btn-primary']")
 WebElement next;
 @FindBy(xpath = "//p[normalize-space()='A']")
 WebElement q2;
 @FindBy(xpath = "//p[normalize-space()='A']")
 WebElement q3;
 @FindBy(xpath = "//button[normalize-space()='Submit']")
 WebElement submit;
 @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
 WebElement yes;
 @FindBy(xpath = "//p[@class='score']")
 WebElement score;
 @FindBy(xpath = "//div[@class='button-container desktop']//button[@class='btn-primary'][normalize-space()='Next']")
 WebElement nextinTest;
 @FindBy(xpath = "//p[@class='box-value']")
 WebElement XPEarned;
 @FindBy(xpath = "(//span[contains(text(),'Stats')])[1]")
 WebElement statspage;
 @FindBy(xpath = "(//div[@class='xp-details'])[1]//h3")
 WebElement rewardsgained;
 @FindBy(xpath = "//button[@class='primary continue']")
 WebElement continuebutton;
 
 String totalXPString;
 int totalscoreNumber;
 int firstXp;
 int gainedXP;
 int totalXP;
 
 public void Login() throws InterruptedException {
	login.click();
	Thread.sleep(3000);
 }
 
 public void DontAllow() throws InterruptedException {
	dontAllow.click();
	Thread.sleep(2000);
 }
 
 public void EntermobileNumber() throws InterruptedException {
	enterMobileNumber.sendKeys("8553481764");
	Thread.sleep(3000);
 }

 public void LoginClick() throws InterruptedException {
	loginClick.click();
	Thread.sleep(2000);
 }

 public void Otp() throws InterruptedException {
	otp.sendKeys("1");
	Thread.sleep(2000);
 }
	public void Otp1() throws InterruptedException {
	otp1.sendKeys("2");
	Thread.sleep(2000);
 }
	public void Otp2() throws InterruptedException {
	otp2.sendKeys("3");
	Thread.sleep(2000);
 }
	public void Otp3() throws InterruptedException {
	otp3.sendKeys("4");
	Thread.sleep(2000);
 }
	
 public void VerifyClick() throws InterruptedException {
	verify.click();
	Thread.sleep(6000);
 }
	
 public void Achievements() throws InterruptedException {
	achievements.click();
	Thread.sleep(3000);
 }

 public void TotalXp() throws InterruptedException {
	totalXPString = totalXp.getText();
	firstXp = Integer.parseInt(totalXPString);
	System.out.println(totalXPString);
	Thread.sleep(3000);
 }

 public void Syllabus() throws InterruptedException {
    syllabus.click();
	Thread.sleep(3000);
 }
 
 public void HistoricalBackground() throws InterruptedException {
	historicalBackground.click();
	Thread.sleep(3000);
 }

 public void HistoricalBackgroundSubtopic() throws InterruptedException {
	 historicalBackgroundSubtopic.click();
	Thread.sleep(3000);
 }

 public void TakeTest() throws InterruptedException {
	takeTest.click();
	Thread.sleep(8000);
 }

 public void ReadytoBegin() throws InterruptedException {
	readytobegin.click();
	Thread.sleep(3000);
 }

 public void Q1() throws InterruptedException {
	q1.click();
	Thread.sleep(3000);
 }

 public void Next() throws InterruptedException {
	next.click();
	Thread.sleep(3000);
 }
 
 public void Q2() throws InterruptedException {
	q2.click();
	Thread.sleep(3000);
 }
 
 public void Q3() throws InterruptedException {
	q3.click();
	Thread.sleep(3000);
 }
 
 public void Submit() throws InterruptedException {
	submit.click();
	Thread.sleep(3000);
 }
 
 public void Yes() throws InterruptedException {
	yes.click();
	Thread.sleep(10000);
 }
 
 public void score() {
	 String scoreString = score.getText();
	 String[] scoreStringwithoutpercentageString = scoreString.split("%");
	 String totalscore = scoreStringwithoutpercentageString[0];
	 totalscoreNumber = Integer.parseInt(totalscore);
	 System.out.println(scoreString);
	 System.out.println(totalscore);
	
}

 public void NextinTest() throws InterruptedException {
	nextinTest.click();
	Thread.sleep(3000);
 }
 
 public void XPEarned() {
	String xPEarnedString = XPEarned.getText();
	gainedXP = Integer.parseInt(xPEarnedString);
	System.out.println(xPEarnedString);
	int XP = Integer.parseInt(xPEarnedString);
	int divide = 2;
	int requirevalue = totalscoreNumber/divide;
	if (requirevalue == XP) {
		System.out.println("Percentage calculated and the score obtained is validated");
	}
	else {
		System.out.println("Percentage calculated and the score obtained is not validated");
	}
	continuebutton.click();
	statspage.click();
	String rewardsGainedString = rewardsgained.getText();
	totalXP = Integer.parseInt(rewardsGainedString);
	System.out.println(rewardsgained.getText());
	if (totalXP==(firstXp + gainedXP)) {
		System.out.println("XP Points Validated");
	}
	
}

 }
