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
	/*
	 * private By hotelCityClick= By.
	 * xpath("//span[@class='select2-chosen'][text()='Search by Hotel or City Name']"
	 * ); //private By hotelCity=
	 * By.xpath("//*[@id='select2-drop']//following::input[1]"); private By checkIn
	 * = By.xpath("//*[@id='dpd1']"); private By checkOut =
	 * By.xpath("//*[@id='dpd2']"); private By travellerrs =
	 * By.xpath("//*[@id='htravellersInput']"); private By searchButton =
	 * By.xpath("//*[@id='htravellersInput']//following::button[5]");
	 */
	
	/*public By getHotelCity(){
		
		return hotelCity;
	}*/
	
	private By login= By.xpath("//a[text()='Login']");
	private By emailId= By.xpath("//input[@name=\"email\"]");
	private By password= By.xpath("//input[@name=\"password\"]");
	private By btnLogin=By.xpath("//*[text()='Login']");
	private By contactLink= By.xpath("//span[@class='item-text'][text()='Contacts']");
	
	private By btnNew=By.xpath("//button[text()='New']");
	private By firstName=By.xpath("//input[@name='first_name']");
	private By lastName=By.xpath("//input[@name='last_name']");
	private By contactEmail=By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input");
	private By dayOfBirth=By.xpath("//div/input[@name='day']");
	private By monthOfBirth=By.xpath("//div[@name='month']");
	private By yearOfBirth=By.xpath("//div/input[@name='year']");
	private By doNotCall=By.xpath("//div/input[@name='do_not_call']");
	
	private By btnContactSave=By.xpath("//button[text()='Save']");
	

	public By getContactLink() {
		return contactLink;
	}
	
	public By getBtnNew() {
		return btnNew;
	}
	
	public By getDayOfBirth() {
		return dayOfBirth;
	}
	
	public By getMonthOfBirth() {
		return monthOfBirth;
	}
	
	public By getYearOfBirth() {
		return yearOfBirth;
	}
	
	public By getbtnContactSave() {
		return btnContactSave;
	}
	
	public By getDoNotCall() {
		return doNotCall;
	}
	
	
	public By getFirstName() {
		return firstName;
	}
	
	public By getLastName() {
		return lastName;
	}
	
	public By getcontactEmail() {
		return contactEmail;
	}
	
	public By getlogin(){
		
		return login;
	}
	
	public By getemailId(){
		
		return emailId;
	}


	public By getpassword(){
	
		return password;
	}
	
	
	public By getbtnLogin(){
		
		return btnLogin;
	}

}
