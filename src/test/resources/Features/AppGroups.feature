@SheetAppGroups
Feature: APPGROUPS

@Test
Scenario: TC01_Verification of Browser Compatibility of APP Group Listing Screen of the application
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen
And click on EDGE Group

@Test
Scenario: TC02_Verification of resizing the User screen as per different zoom levels
Given User launch application in chrome browser
When user enters credentials and click on login button
Then verify page with resize option the login page
