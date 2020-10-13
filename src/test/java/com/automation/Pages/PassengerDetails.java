package com.automation.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PassengerDetails {

	WebDriver driver;
	
	@FindBy(id="itineraryBtn")
	WebElement ReviewItenary_ContinueButton;
	
	@FindBy(xpath="//input[@etitle='Your email address']")
	WebElement EmailAddress;
		
	@FindBy(id="LoginContinueBtn_1")
	WebElement emailAddresscontinuebutton;	
	
	@FindBy(xpath="//select[@name='AdultTitle1']")
	WebElement titleDropdown;
	
	@FindBy(xpath="//select[@name='AdultTitle1']//option")
	List<WebElement> alltitleValues;
	
	@FindBy(xpath="//select[@name='AdultTitle1']/..//input[@id='AdultFname1']")
	WebElement FirstName;
	
	@FindBy(xpath="//select[@name='AdultTitle1']/..//input[@id='AdultLname1']")
	WebElement LastName;
	
	@FindBy(xpath="//dl[@class='horizontal travellers row last']//input[@id='mobileNumber']")
	WebElement MobileNumber;
	
	@FindBy(id="travellerBtn")
	WebElement TravellersContinueButton;
	
	@FindBy(xpath="//h6[text()='Enter your credit card details'0]")
	WebElement paymentPage;
		
	public PassengerDetails(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void reviewItenary() throws InterruptedException {
		SearchFlights.scrollToElement(ReviewItenary_ContinueButton);
		ReviewItenary_ContinueButton.click();
		Thread.sleep(4000);
	}
	
	public void emailAddressEnter(String emailId) throws InterruptedException {
		SearchFlights.scrollToElement(EmailAddress);
		EmailAddress.sendKeys(emailId);
		emailAddresscontinuebutton.click();
		Thread.sleep(6000);
	}
	
	public void selectTilte(String title) throws InterruptedException   {
		titleDropdown.click();
		Thread.sleep(1000);
		for(int i=0;i<alltitleValues.size();i++) {
			if(alltitleValues.get(i).getText().equals(title)) {
				alltitleValues.get(i).click();
				break;}
		}
	}
	
	public void enterFirstName(String name) throws InterruptedException  {
		SearchFlights.scrollToElement(FirstName);
		FirstName.sendKeys(name);
		Thread.sleep(2000);
	}
	
	public void enterLastName(String name) throws InterruptedException {
		SearchFlights.scrollToElement(LastName);
		LastName.sendKeys(name);
		Thread.sleep(2000);
	}
	
	public void mobileNumber(String mobile) throws InterruptedException {
		SearchFlights.scrollToElement(MobileNumber);
		MobileNumber.sendKeys(mobile);
		Thread.sleep(2000);
	}
	
	public void clickOnTravellersButton() throws InterruptedException {
		SearchFlights.scrollToElement(TravellersContinueButton);
		TravellersContinueButton.click();
		Thread.sleep(8000);
	}
	
	public void paymentScreenValidation() throws InterruptedException {
		Assert.assertTrue(paymentPage.isDisplayed());
		Thread.sleep(10000);
	}
	
		
}
