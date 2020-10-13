package com.automation.StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.automation.Base.DriverFactory;
import com.automation.Pages.PassengerDetails;
import com.automation.Pages.SearchFlights;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TicketBookStep {
	
	public WebDriver driver = DriverFactory.getWebDriver();
	SearchFlights search = new SearchFlights(driver);
	PassengerDetails passenger = new PassengerDetails(driver);
	
	@Given("^User login to the application url \"([^\"]*)\"$")
	public void user_login_to_the_application_url(String url) throws Throwable {
	    driver.get(url);
	    Thread.sleep(2000);
	}
	
	@Given("^User select Round Trip radio button in Search Flight screen$")
	public void selectRadioButton() throws Throwable {
	    search.clickOnRoundTrip();
	}

	@When("^User enter Departure city in \"([^\"]*)\" and Destination place in \"([^\"]*)\" textfield$")
	public void cityEntering(String departureCity, String destinationCity) throws Throwable {
	    search.cityEntering(departureCity, destinationCity);
	}

	@When("^User select Departure Date as \"([^\"]*)\" and Return Date as \"([^\"]*)\"$")
	public void travelDate(String DepartureDate, String ReturnDate) throws Throwable {
	    search.dateSelection(DepartureDate, ReturnDate);
	}
	
	@When("^User click on Search Flight button$")
	public void flightBookButton() throws Throwable {
		search.searchButtonClick();
	}
	
	@Then("^User select Non Stop flights and click on Book button$")
	public void user_select_Non_Stop_flights_and_click_on_Book_button() throws Throwable {
		search.selectFlight();
		passenger.reviewItenary();
	}

	@Then("^User enter below Passenger Details$")
	public void user_enter_below_Passenger_Details(DataTable data) throws Throwable {
	    List<Map< String, String>> list = data.asMaps(String.class, String.class);
	    
	    for(Map<String,String> map: list) {
	    	if(map.get("Column").equals("EmailAddress")) 
	    		passenger.emailAddressEnter(map.get("Values"));
	     }
	    
	    for(Map<String,String> map: list) {
	    	if(map.get("Column").equals("Title")) 
	    		passenger.selectTilte(map.get("Values"));
	     }
	    
	    for(Map<String,String> map: list) {
	    	if(map.get("Column").equals("Mobile")) 
	    		passenger.mobileNumber(map.get("Values"));
	    	else if(map.get("Column").equals("FirstName")) 
	    		passenger.enterFirstName(map.get("Values"));
	    	else if(map.get("Column").equals("LastName")) 
	    		passenger.enterLastName(map.get("Values"));
	    }
	    passenger.clickOnTravellersButton();
	}

	
	@Then("^User validate Payment Screen$")
	public void validatePaymentScreen() throws Throwable {
	    passenger.paymentScreenValidation();
	    Thread.sleep(4000);
		
	}
	

	
	
	
}

