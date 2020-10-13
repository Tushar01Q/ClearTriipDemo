package com.automation.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.DriverFactory;

public class SearchFlights {

	WebDriver driver;
	@FindBy(id="RoundTrip")
	WebElement roundTripRadiobutton;
	
	@FindBy(id="FromTag")
	WebElement FromTextfield;
	
	@FindBy(id="ToTag")
	WebElement ToTextfield;
	
	@FindBy(xpath="//ul[@id='ui-id-1']//li[@role='presentation']//a")
	List<WebElement> FromAutoSuggest;
	
	@FindBy(xpath="//ul[@id='ui-id-2']//li[@role='presentation']//a")
	List<WebElement> ToAutoSuggest;
		
	@FindBy(id="DepartDate")
	WebElement DepartureDatePicker;
	
	@FindBy(id="SearchBtn")
	WebElement searchFlightsButton;
	
	@FindBy(xpath="//p[text()='Stops']/..//following-sibling::div//p[text()='Non-stop']")
	WebElement NonStopCheckbox;
	
	@FindBy(xpath="//button[text()='Book']")
	WebElement bookButton;
	
	String dateSelectionXpath = "//td[@data-month='9']//a[@class='ui-state-default ' and text()='%s']";
	static String currentWindowID = null;
	
	public SearchFlights(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void clickOnRoundTrip() {
		roundTripRadiobutton.click();
	}
	
	public void cityEntering(String departure, String destination) throws InterruptedException {
		FromTextfield.sendKeys(departure);
		FromTextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(9000);
		FromAutoSuggest.get(0).click();
		ToTextfield.sendKeys(destination);
		ToTextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(9000);
		ToAutoSuggest.get(0).click();
	}
	
	
	public void dateSelection(String departureDate, String returnDate) throws InterruptedException {
		DepartureDatePicker.click();
		driver.findElement(By.xpath(dateSelectionXpath.replace("%s", departureDate))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(dateSelectionXpath.replace("%s", returnDate))).click();
	}
	
	
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void searchButtonClick() throws InterruptedException {
		scrollToElement(searchFlightsButton);
		searchFlightsButton.click();
		Thread.sleep(9000);
	}
	
	public void selectFlight() throws InterruptedException {
		NonStopCheckbox.click();
		Thread.sleep(3000);
		currentWindowID = driver.getWindowHandle();
		bookButton.click();
		Thread.sleep(13000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String window: allWindowHandles) {
			if(!window.equals(currentWindowID)) {
				driver.switchTo().window(window);
			}
		}
	}
	
}
