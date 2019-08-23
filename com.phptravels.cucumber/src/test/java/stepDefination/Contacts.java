package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.freecrm.base.ScenarioContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contacts {
	
	ScenarioContext scenarioContext;
	
	
	public Contacts(ScenarioContext scenarioContext){
	
		this.scenarioContext=scenarioContext;
	}
	
	
	@Given("^Webdriver is initialized and FreeCrm site is launched and User is successfully logged in$")
	public void webdriver_is_initialized_and_FreeCrm_site_is_launched_and_User_is_successfully_logged_in() throws Throwable {
		scenarioContext.driver= scenarioContext.testBase.initializeWebDriver();
		Thread.sleep(40000);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.homePage.getlogin());
		//scenarioContext.driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nishant_online@rediffmail.com");;
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getemailId(),scenarioContext.readPropertyFile.getPropertyValue("Emailid"));
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getpassword(),scenarioContext.readPropertyFile.getPropertyValue("Password"));
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.homePage.getbtnLogin());
		
		
	}

	@Given("^User is on Contact function page$")
	public void user_is_on_Contact_function_page() throws Throwable {
	   scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.homePage.getContactLink());
	    
	}

	@When("^User enters all required details$")
	public void user_enters_all_required_details() throws Throwable {
	   scenarioContext.testBase .click(scenarioContext.driver , scenarioContext.homePage.getBtnNew());
	   scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getFirstName(), scenarioContext.readPropertyFile.getPropertyValue("FirstName"));
	   scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getLastName(), scenarioContext.readPropertyFile.getPropertyValue("LastName"));
	   scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getcontactEmail(), scenarioContext.readPropertyFile.getPropertyValue("ContactEmailID"));
	   scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getDayOfBirth(), scenarioContext.readPropertyFile.getPropertyValue("ContactEmailID"));

	    
	}

	@When("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Contact should get create successfully$")
	public void contact_should_get_create_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}