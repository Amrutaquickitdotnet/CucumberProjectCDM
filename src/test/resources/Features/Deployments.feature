@SheetDEPLOYMENTS
Feature: DEPLOYMENTS

#
#@Test
#Scenario: TC01_Verification of Browser Compatibility of EDGE Device module
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Succesfull login should be happen

#@Test
#Scenario: TC02_Resizing_login_page_screen(Zoom Levels)
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then verify page with resize option the login page

@Test
Scenario: TC03_Verify search functionality for Edge Name
Given User launch application in chrome browser
When user enters credentials and click on login button
Then click on three dots for Edge Name
And user is landing on dashboard then click on Deployment tab at the left corner of the page
And enter the value for Edge Name





