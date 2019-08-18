Feature: Search of Hotel Flights and Tours

Background: Launching of PHPTravel Site

Given Webdriver is initialized and PHPTravel site is launched

@First
Scenario: Hotel Search
When User enters "London, United Kingdon" and "08/19/2019" and "08/21/2019" date
And clicks on search button
Then correct search details should be displayed
