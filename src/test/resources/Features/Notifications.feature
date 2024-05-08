@SheetNOTIFICATIONS

Feature: NOTIFICATIONS

@Test
Scenario: TC01_Verification of  Browser Compatibility for notification tab
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen

@Test
Scenario: TC02_Verification of resizing the notification tab as per different zoom levels
Given User launch application in chrome browser
When user enters credentials and click on login button
Then verify page with resize option page for notifications


@Test
Scenario: TC03_Browser fragmentation verification
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen


@Test
Scenario: TC04_Verify that the user is able to see the License Expiry in the Notifications tab
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen
Then apply filter on Notification name



@Test
Scenario: TC05_Verify that the License Expiry Notification functionality and observe that emails are triggered to all the roles in the selected user group of License Expiry
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen


@Test
Scenario: TC06_Verify that the emails are not triggered to the User group which is not added to the License Expiry notification
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen


@Test
Scenario: TC07_Verify that the emails are not triggered to the User group when the CDM App is in Constraint environment
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen


@Test
Scenario: TC08_Verify that the user is able to see the App Deployment in the Notifications tab
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen


@Test
Scenario: TC09_Verify that the App Deployment Notification functionality and observe that emails are triggered to all the roles in the selected user group of License Expiry
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen
Then apply filter on Notification name

@Test
Scenario: TC10_Verify that the emails are not triggered to the User group which is not added to the App Deployment Notification Group
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen

@Test
Scenario: TC11_Verify that the emails are not triggered to the User group when the CDM App is in Constraint environment
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen


@Test
Scenario: TC12_Verify user is able to select UserGroup Name
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen
Then click on icon add user group mapping
Then click on three dots for username and enter the search value 
Then select the checkbox to map user group name 
Then click on Save button


@Test
Scenario: TC13_Verify user is able to select UserGroup Name from app deployment
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on notifications tab from right panel of the screen
Then apply filter on Notification name
Then click on icon add user group mapping
Then click on three dots for username and enter the search value 
Then select the checkbox to map user group name for app deployment
Then click on Save button
