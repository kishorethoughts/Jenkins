package com.examarly;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testNG;
	
	public static void main(String[] args) {
    
     testNG = new TestNG();
     
     testNG.setTestClasses(new Class[] {HomePageWeb.class});
     testNG.run();
	}

}
