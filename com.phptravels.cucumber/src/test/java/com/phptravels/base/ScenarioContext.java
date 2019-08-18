package com.phptravels.base;

import org.openqa.selenium.WebDriver;

import com.phptravels.pages.HomePage;
import com.phptravels.utilities.ReadPropertyFile;

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
