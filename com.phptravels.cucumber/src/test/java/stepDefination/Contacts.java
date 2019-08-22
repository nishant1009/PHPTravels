package stepDefination;

import org.openqa.selenium.WebElement;

import com.freecrm.base.ScenarioContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contacts {
	
	ScenarioContext scenarioContext;
	String city;
	String checkInDate;
	String checkOutDate;
	
	public Contacts(ScenarioContext scenarioContext){
	
		this.scenarioContext=scenarioContext;
	}
	
	
	@Given("^Webdriver is initialized and FreeCrm site is launched and User is successfully logged in$")
	public void webdriver_is_initialized_and_FreeCrm_site_is_launched_and_User_is_successfully_logged_in() throws Throwable {
		scenarioContext.driver= scenarioContext.testBase.initializeWebDriver();
		
	}

	@Given("^User is on Contact function page$")
	public void user_is_on_Contact_function_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User enters all required details$")
	public void user_enters_all_required_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
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