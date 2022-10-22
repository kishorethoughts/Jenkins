package com.examarly.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examarlyBaseClass.BaseclassLoginPageWeb;

public class LoginPageWeb extends BaseclassLoginPageWeb{
	
public LoginPageWeb() 
{
	PageFactory.initElements(driver, this);
}

		
@FindBy(xpath = "//div[@class='homepage-landing-section-hero-button start-todays-prep btn-stp-cpy']")
WebElement login;
@FindBy(xpath = "//span[normalize-space()='Terms']")
WebElement terms;
@FindBy(xpath = "//span[normalize-space()='Privacy Policy']")
WebElement policy;
@FindBy(xpath = "//button[@class='ng-binding'][1]")
WebElement dontAllow;
@FindBy(xpath = "//span[normalize-space()='Signup']")
WebElement signUp;
@FindBy(xpath = "//input[@id='name']")
WebElement name;
@FindBy(xpath = "//input[@placeholder='Phone number']")
WebElement phoneNumber;
@FindBy(xpath = "//input[@id='emailAddress']")
WebElement email;
@FindBy(xpath = "//button[normalize-space()='Sign up']")
WebElement signupinsidelogin;
@FindBy(xpath = "//span[normalize-space()='Login']")
WebElement logininsidesignup;
@FindBy(xpath = "//input[@id='mobileNumber']")
WebElement enterPhoneNumber;
@FindBy(xpath = "//button[normalize-space()='Login']")
WebElement loginMainPage;
@FindBy(xpath = "//input[@name='otp1']")
WebElement otp;
@FindBy(xpath = "//input[@name='otp2']")
WebElement otp1;
@FindBy(xpath = "//input[@name='otp3']")
WebElement otp2;
@FindBy(xpath = "//input[@name='otp4']")
WebElement otp3;
@FindBy(xpath = "//button[normalize-space()='Verify']")
WebElement verify;
		
public void Login() throws InterruptedException {
	login.click();
	Thread.sleep(2000);
 }
public void TermsandConditions() throws InterruptedException {
	terms.click();
	Thread.sleep(2000);
 }
public void PrivacyPolicy() throws InterruptedException {
	policy.click();
	Thread.sleep(2000);
 }
public void DontAllow() throws InterruptedException {
	dontAllow.click();
	Thread.sleep(2000);
 }
public void SignUp() throws InterruptedException {
	signUp.click();
	Thread.sleep(2000);
 }
public void Entername() throws InterruptedException {
	name.sendKeys("Kishore");
	Thread.sleep(2000);
 }
public void EnterPhoneNumber() throws InterruptedException {
	phoneNumber.sendKeys("8553481764");
	Thread.sleep(2000);
 }
public void Enteremail() throws InterruptedException {
	email.sendKeys("jai.kishore@gmail.com");
	Thread.sleep(2000);
 }
public void SignupinsideLogin() throws InterruptedException {
	signupinsidelogin.click();
	Thread.sleep(2000);
 }
public void LogininsideSignup() throws InterruptedException {
	logininsidesignup.click();
	Thread.sleep(2000);
 }

public void EnterPhonenumber() throws InterruptedException {
	enterPhoneNumber.sendKeys("8553481764");
	Thread.sleep(2000);
}

public void LoginMainPage() throws InterruptedException {
	loginMainPage.click();
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
public void Verify() throws InterruptedException {
	verify.click();
	Thread.sleep(5000);
}

}
