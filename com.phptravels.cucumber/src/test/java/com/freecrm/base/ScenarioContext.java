package com.freecrm.base;

import org.openqa.selenium.WebDriver;

import com.freecrm.pages.HomePage;
import com.freecrm.utilities.ReadPropertyFile;

public class ScenarioContext {

	public ReadPropertyFile readPropertyFile;
	public TestBase testBase;
	public WebDriver driver;
	public HomePage homePage;
	
	public ScenarioContext(){
			
		readPropertyFile = new ReadPropertyFile();
		testBase = new TestBase(readPropertyFile.getPropertyValue("Browser"),readPropertyFile.getPropertyValue("Url"));
		homePage= new HomePage(driver);
	}
	
}
