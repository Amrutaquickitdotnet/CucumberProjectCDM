@SheetDEPLOYMENTS
Feature: DEPLOYMENTS

#@Test
#Scenario: TC01_Verification of Browser Compatibility
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Succesfull login should be happen
#
#@Test
#Scenario: TC02_Verification of resizing the Deployment as per different zoom levels
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then verify page with resize option for the deployment page


#@Test
#Scenario: TC03_Verification of displaying the Deployment table details after clicking on Deployment module option from side menu bar by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Deployments module from side menu bar

@Test
Scenario: TC04_Verification of Bulk download button functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Bulk Download button

@Test
Scenario: TC05_Verification of Refreshing button functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Refresh button


@Test
Scenario: TC06_Verification of current view functionality in the Deployment List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Deployments module from side menu bar
Then Click on the Current View button







