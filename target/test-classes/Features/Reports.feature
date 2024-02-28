
@SheetREPORTS
Feature: REPORTS

@Test
Scenario: TC01_Verification of  Browser Compatibility of Reports module of the application
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen

@Test
Scenario: TC02_Verification of  resizing the Reports list tab as per different zoom levels
Given User launch application in chrome browser
When user enters credentials and click on login button
Then verify page with resize option for the Reports page


@Test
Scenario: TC03_Browser fragmentation verification
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Minimise the screen and observe the UI carefully.
Then Maximize the screen
Then Open Networks tab and observe the UI carefully.
Then Maximize the screen

@Test
Scenario: TC04_To verify that the user is able to successfully download any date's  Report.
Given User launch application in chrome browser
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date
And Click on download button


@Test
Scenario: TC05_To verify that the user is able to successfully download report from a date range
Given User launch application in chrome browser
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date
And Click on download button


@Test
Scenario: TC06_To verify error message when user does not select any value
Given User launch application in chrome browser
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Without selecting Audit Report, Start Date & End Date simply hit Download CTA and observe the error message

@Test
Scenario: TC07_To verify that an Admin user is not able to download the Audit report
Given User launch application in chrome browser
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date

@Test
Scenario: TC08_To verify that an Admin user is not able to download the Audit report
Given User launch application in chrome browser
When user enters credentials and click on login button
And Click on Report module from side menu bar
Then Select Audit Report from the Report Type dropdown.
And Select same date in the Start Date & End Date