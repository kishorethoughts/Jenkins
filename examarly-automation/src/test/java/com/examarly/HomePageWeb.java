package com.examarly;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.examarly.Login.LoginPageWeb;
import com.examarly.QA_Pages.AboutPageWeb;
import com.examarly.QA_Pages.BlogPageWeb;
import com.examarly.QA_Pages.ContactUsPageWeb;
import com.examarly.QA_Pages.FAQPageWeb;
import com.examarly.QA_Pages.LandingPageWeb;
import com.examarlyBaseClass.BaseclassWeb;

public class HomePageWeb extends BaseclassWeb
{
    LandingPageWeb landingPage;
    AboutPageWeb about;
    ContactUsPageWeb contactus;
    FAQPageWeb faq;
    BlogPageWeb blog;
    LoginPageWeb loginPage;
    
    public HomePageWeb() 
    {
        super();
    }

	@BeforeClass
    public void setUp() 
    {
    	try {
			initilization();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
        landingPage = new LandingPageWeb();
        about = new AboutPageWeb();
        contactus = new ContactUsPageWeb();
        faq = new FAQPageWeb();
        blog = new BlogPageWeb();
        loginPage = new LoginPageWeb();
    }

    @Test
    public void Landingpage() throws InterruptedException
    {
        landingPage.GetStarted();
        landingPage.DontAllow();
        landingPage.GoBack();
        landingPage.LoginButton();
        landingPage.GoBack();
        landingPage.Hover();
        landingPage.MeetTheTeam();
        landingPage.GoBack();
        landingPage.Review();
        landingPage.GoForward();
        landingPage.GoBackward();
        landingPage.GetStarted1();
        landingPage.GoBack();
        landingPage.Article();
        landingPage.YourStoryHindi();
        landingPage.YourStory();
        landingPage.inc42();
        landingPage.edexo();
        landingPage.dainikBhaskar();
        landingPage.Bottom();
        landingPage.AboutUs();
        landingPage.GoBack();
        landingPage.ContactUs();
        landingPage.GoBack();
        landingPage.FAQ();
        landingPage.GoBack();
        landingPage.Blog();
        landingPage.Community();
        landingPage.Answers();
        landingPage.DownLoadNow();
        landingPage.Fb();
        landingPage.Insta();
        landingPage.Twitter();
        landingPage.LinkedIn();
        landingPage.YouTube();
        landingPage.TermsofServices();
        landingPage.GoBack();
        landingPage.PrivacyPolicy();
        landingPage.GoBack();
        landingPage.Xamarly();
    }
    
   @Test(dependsOnMethods = {"Landingpage"})
    public void About() throws InterruptedException
    {
    
        about.Aboutus();
        about.OurStory();
        landingPage.Bottom();
        landingPage.Xamarly();
    }
    
  @Test(dependsOnMethods = {"About"})
    public void Contact() throws InterruptedException
    {
        contactus.Contactus();
        contactus.GeneralEnquiries();
        landingPage.GoBack();
        contactus.JobEnquieries();
        landingPage.Bottom();
        contactus.GoogleMap();
        landingPage.Xamarly();
        
    }
    
  @Test(dependsOnMethods = {"Contact"})
    public void FAQ() throws InterruptedException
    {
        faq.Faq();
        faq.Div1();
        faq.Div2();
        faq.Div3();
        faq.Div4();
        landingPage.Xamarly();
    }
    
  @Test(dependsOnMethods = {"FAQ"})
    public void BLOG() throws InterruptedException
    {
        blog.BloG();
        blog.DownloadApp();
        blog.Toggle();
        blog.BlogArticle();
        landingPage.GoBack();
        blog.BlogBottomPage();
    }
    
    @AfterClass
    public void qiut() 
    {
    	driver.quit();
   }
    
}
