Feature: Verify the functionality of Contact function

Background: Launching of FreeCRM Site and Login to application

Given Webdriver is initialized and FreeCrm site is launched and User is successfully logged in

@First
Scenario: Verify User is able to create a new Contact

Given User is on Contact function page
When User enters all required details
And Click on Save button
Then Contact should get create successfully



