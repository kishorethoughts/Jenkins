package com.examarlyLogin;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import com.examarly.Login.LoginPageWeb;

public class HomePageLoginWeb extends com.examarlyBaseClass.BaseclassLoginPageWeb{

LoginPageWeb loginPage;

public HomePageLoginWeb() 
{
    super();
}

@BeforeMethod
@BeforeClass
public void setUp() 
{
	try {
		initilization();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
    loginPage = new LoginPageWeb();
}

@Test
public void LoginPage() throws InterruptedException
{
	loginPage.Login();
	loginPage.TermsandConditions();
	driver.navigate().back();
	Thread.sleep(2000);
	loginPage.PrivacyPolicy();
	driver.navigate().back();
	loginPage.DontAllow();
	loginPage.SignUp();
	loginPage.Entername();
	loginPage.EnterPhoneNumber();
	loginPage.Enteremail();
	loginPage.SignupinsideLogin();
	loginPage.LogininsideSignup();
	loginPage.EnterPhonenumber();
	loginPage.LoginMainPage();
	loginPage.Otp();
	loginPage.Otp1();
	loginPage.Otp2();
	loginPage.Otp3();
	loginPage.Verify();
	
	driver.quit();
}
}