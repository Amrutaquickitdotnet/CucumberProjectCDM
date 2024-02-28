Feature: DASHBOARD

@Test1
Scenario: TC01_Verification_dashboard functionality
Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And successful login should be happen. 

Scenario: TC02_Verification of Expand button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then land on the dashbord
And click on the expand button 

Scenario: TC03_Verification of collapse button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then land on the dashbord
And click on the expand button


Scenario: TC04_Verification of Language Button (English (US)) Tooltip
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on US Icon on the top of the Right side

Scenario: TC05_Verification of tooltip functionality for Bell icon in Title bar
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Bell icon on the top of the Right side

Scenario: TC06_Verification of tooltip functionality for Profile icon in Title bar
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Human icon on the top of the Right side


Scenario: TC07_Verification of tooltip functionality for Profile icon in Title bar
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Bell icon on the top of the Right side

Scenario: TC08_Verification of redirection functionality for Bell icon (in Title bar (Alerts record))
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Profile icon on the top of the Right side

Scenario: TC09_Verification of Password change functionality in Profile icon [dropdown in Title bar]
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Profile icon on the top of the Right side.& click on password from drop down

Scenario: TC10_Verification of Update profile functionality in Profile icon dropdown in Title bar
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord
Then Click on Profile icon on the top of the Right side.& click on Update Password from drop down

Scenario: TC11_Verification of Logout functionality in Profile icon(dropdown in Title bar)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord
Then Click on Profile icon on the top of the Right side.& click on Log out from drop down

Scenario: TC12_Verification of Browser Compatibility of Dashboard module
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Check in different browsers

Scenario: TC13_Verification of resizing the Dashboard module(different zoom levels)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord
Then Click on Zoom from browser

Scenario: TC14_Verification of displaying the  details of Dashboard after login
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord
Then Click oncard board boxes in dashboard

Scenario: TC15_Verification of tool tip functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landen on the dashbord
Then  Click on Help icon on the top of the right side

Scenario: TC16_Verification of Refreshing button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashbord
Then  After landing on Dshboard screen, Click on Refresh button (top right side)

Scenario: TC17_Verification of EDIT button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on EDIT button on the top right side
Then Navigate to the Custom EDIT & ADD Screen

Scenario: TC18_Verification of ADD Icon button functionality in the EDIT
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Edit icon on the top of right side
Then After landing on Edit/add screen & Click on ADD icon(top of right side)


Scenario: TC19_Verification of redirection functionality for Cancel button for New create(dashboard screen)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD button & Navigate to the screen
Then Click on Cancel button after landing on  the screen

Scenario: TC20_Verification of Alphanumeric with special characters(the Create Dashboard text field)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on the Edit icon in Dahboard
Then After landing on the add screen(Click on ADD button)

Scenario: TC21_Verification of Save  button functionality(New Create Dashboard screen)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD button
 

Scenario: TC22_Verification of Mandatory text field(Create Dashboard screen)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD button
 
Scenario: TC23_Verification if user without enter any inputs into the textfield & clcik on save button
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then click on ADD button in the Dashboard
Then After landing on the new dashboard screen

Scenario: TC24_After landing on the new dashboard screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD button
 
Scenario: TC25_Verification of Add Card icon button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD button in the Dashboard
Then After landing on the new dashboard screen & Click on Add card icon

Scenario: TC26_Verification of all the textfield details after creating new card
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD card icon and navigate to the the newly crated card
Then Click on Newly created add card


Scenario: TC27_Verification of Delete Icon button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Delete button

Scenario: TC28_Verification of Add icon button functionality(Nav filter newly created card)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD new card button in the Dashboard
Then Click on Newly created card
 
Scenario: TC29_Verification of Remove button functionality(newly card  screen)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on newly created card & access to the all the fields


Scenario: TC30_Verification of navigating to the particular active devices by clicking on total active devices card
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Total Active Devices card
Then Redirect to the edge module with active status

Scenario: TC31_Verification of navigating to the particular inactive devices by clicking on total inactive devices card
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Total InActive Edge Devices card
Then Redirect to the edge module with inactive status