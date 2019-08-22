package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	/*@FindBy(how=How.XPATH,using="//*[@id='select2-drop']")
	public WebElement hotelCity;
	@FindBy(how=How.XPATH,using="//*[@id='dpd1']")
	public WebElement checkIn;
	@FindBy(how=How.XPATH,using="//*[@id='dpd2']")
	public WebElement checkOut;
	@FindBy(how=How.XPATH,using="//*[@id='htravellersInput']")
	public WebElement travellerrs;
	@FindBy(how=How.XPATH,using="//*[@id='htravellersInput']//following::button[5]")
	public WebElement searchButton;*/
	
	private By hotelCityClick= By.xpath("//span[@class='select2-chosen'][text()='Search by Hotel or City Name']");
	//private By hotelCity= By.xpath("//*[@id='select2-drop']//following::input[1]");
	private By checkIn = By.xpath("//*[@id='dpd1']");
	private By checkOut = By.xpath("//*[@id='dpd2']");
	private By travellerrs = By.xpath("//*[@id='htravellersInput']");
	private By searchButton = By.xpath("//*[@id='htravellersInput']//following::button[5]");
	
	/*public By getHotelCity(){
		
		return hotelCity;
	}*/
	
public By getHotelCityClick(){
		
		return hotelCityClick;
	}
	
	public By getCheckIn(){
		
		return checkIn;
	}


	public By getSearchButton(){
	
		return searchButton;
	}
	
	
	public By getCheckOut(){
		
		return checkOut;
	}

}
