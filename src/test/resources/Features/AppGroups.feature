@SheetAppGroups
Feature: APPGROUPS
#
#@Test
#Scenario: TC01_Verification of Browser Compatibility of APP Group Listing Screen of the application
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Succesfull login should be happen
#And click on EDGE Group
#
#@Test
#Scenario: TC02_Verification of resizing the User screen as per different zoom levels
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then verify page with resize option the login page
#
#
#@Test
#Scenario: TC03_Verification of displaying the items per page by default i.e.25 per page 
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And click on App Groups tab
#Then Pagination is in footer(Below) Left side 
#
#@Test
#Scenario: TC04_Verify search is working for App Group Name
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Click on App Groups tab
#When Click on the three dots of App Group Name
#Then enter text in the field of App Group Name
#
#
#@Test
#Scenario: TC05_Verify search is working for App Group Display Name
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Click on App Groups tab
#When Click on the three dots of App Group Display Name
#Then enter text in the field of App Group Display Name
#
#
#@Test
#Scenario: TC10_ Verify add functionality of App Groups by saving data
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Click on App Groups tab
#When Click on the Add icon at the right side of the page
#Then Under Identity Section enter details for App Group Name and AppGroupDisplayName
#And click on Save button.
#
#
#@Test
#Scenario: TC16_Verify delete functionality of App Groups
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Click on App Groups tab
#When Click on the Delete Icon at the right side of the page
#Then Under Identity Section enter details for App Group Name and AppGroupDisplayName
#And click on Save button.
#
#
#
#
@Test
Scenario: TC09_Verify checkboxes for status Active / Inactive
Given User launch application in chrome browser
When user enters credentials and click on login button
And Click on App Groups tab
When Click on the Status Icon at the right side of the page
Then Under Status column select Active checkbox from the List 