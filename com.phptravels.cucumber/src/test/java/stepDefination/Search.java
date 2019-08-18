package stepDefination;

import org.openqa.selenium.WebElement;

import com.phptravels.base.ScenarioContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	ScenarioContext scenarioContext;
	String city;
	String checkInDate;
	String checkOutDate;
	
	public Search(ScenarioContext scenarioContext){
	
		this.scenarioContext=scenarioContext;
	}
	
	@Given("^Webdriver is initialized and PHPTravel site is launched$")
	public void webdriver_is_initialized_and_PHPTravel_site_is_launched() throws Throwable {
		scenarioContext.driver= scenarioContext.testBase.initializeWebDriver();
	}

	@When("^User enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\" date$")
	public void user_enters_and_and_date(String city, String checkInDate, String checkOutDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		this.city=city;
		this.checkInDate=checkInDate;
		this.checkOutDate=checkOutDate;
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.homePage.getHotelCityClick());
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getHotelCityClick(), city);
		scenarioContext.testBase.initializeWebDriver().findElement(scenarioContext.homePage.getHotelCityClick()).submit();
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getCheckIn(), checkInDate);
		scenarioContext.testBase.sendKeys(scenarioContext.driver, scenarioContext.homePage.getCheckOut(), checkOutDate);
		scenarioContext.testBase.click(scenarioContext.driver, scenarioContext.homePage.getSearchButton());
	}

	@When("^clicks on search button$")
	public void clicks_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^correct search details should be displayed$")
	public void correct_search_details_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
