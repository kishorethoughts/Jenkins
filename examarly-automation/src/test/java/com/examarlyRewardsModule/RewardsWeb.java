package com.examarlyRewardsModule;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.examarly.Login.RewardsModuleWeb;

public class RewardsWeb extends com.examarlyBaseClass.BaseclassLoginPageWeb {

	RewardsModuleWeb rewards;

	public RewardsWeb() {
		super();
	}

	@BeforeClass
	public void setUp() {
		try {
			initilization();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		rewards = new RewardsModuleWeb();
	}

	@Test
	public void LoginPage() throws InterruptedException {
		rewards.Login();
		rewards.DontAllow();
		rewards.EntermobileNumber();
		rewards.LoginClick();
		rewards.Otp();
		rewards.Otp1();
		rewards.Otp2();
		rewards.Otp3();
		rewards.VerifyClick();
		rewards.Achievements();
		rewards.TotalXp();
		rewards.Syllabus();
		rewards.HistoricalBackground();
		rewards.HistoricalBackgroundSubtopic();
		rewards.TakeTest();
		rewards.ReadytoBegin();
		rewards.Q1();
		rewards.Next();
		rewards.Q2();
		rewards.Next();
		rewards.Q3();
		rewards.Next();
		rewards.Submit();
		rewards.Yes();
		rewards.score();
		rewards.NextinTest();
		rewards.XPEarned();

		driver.quit();

	}

}