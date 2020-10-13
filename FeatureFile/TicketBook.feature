Feature: Flight Booking validation in ClearTrip

Background:
Given User login to the application url "https://www.cleartrip.com/"

@ClearTrip_TC01
Scenario Outline: Validation of flight booking in ClearTrip portal
Given User select Round Trip radio button in Search Flight screen
When User enter Departure city in "<Departure City>" and Destination place in "<Destination City>" textfield
And User select Departure Date as "<DepartureDate>" and Return Date as "<ReturnDate>"
And User click on Search Flight button
Then User select Non Stop flights and click on Book button
And User enter below Passenger Details
|Column|Values|
|Mobile|9415333777|
|EmailAddress|dummymail@yopmail.com|
|FirstName|john|
|LastName|Carter|
|Title|Mr|
And User validate Payment Screen
Examples:
|Departure City|Destination City|DepartureDate|ReturnDate|
|Bangalore|New Delhi|18|24|
