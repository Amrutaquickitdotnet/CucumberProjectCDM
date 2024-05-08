@SheetHARDWARE

Feature: HARDWARE

@Test
Scenario: TC01_Verification of Browser Compatibility of hardware module of the application
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen

@Test

Scenario: TC02_Verification of resizing the hardware module as per different zoom levels
Given User launch application in chrome browser
When user enters credentials and click on login button
Then verify page with resize option the hardware page

@Test
Scenario: TC03_Verification of Search button functionality in the Hardware List screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then search for all fields for hardware


@Test
Scenario: TC04_Verification of Expand button functionality in the Hardware List screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on expand button from navigation menu


@Test
Scenario: TC05_Verification of viewing the Hardware table details by Super admin/admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen



@Test
Scenario: TC06_Verification of Collapse button functionality in the Hardware List screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on collapse button from navigation menu
Then click on expand button from navigation menu

@Test
Scenario: TC07_Verification of the Add "+"button icon on top right side of Hardware List screen by Super admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon


@Test
Scenario: TC08_Verification of Refreshing button functionality in the Hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then Click on Refresh button


@Test
Scenario: TC09_Verification of Display name Tool tip functionality in the Hardware > ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardware Displayname

@Test
Scenario: TC10_Verification of Hardware Name text field Tool tip functionality in the Hardware > ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardwareName

@Test
Scenario: TC11_Verification of Description text field Tool tip functionality in the Hardware  > ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardware Description

@Test
Scenario: TC12_Verification of Model text field Tool tip functionality in the Hardware> ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardware Model


@Test
Scenario: TC13_Verification of OS text field Tool tip functionality in the  Hardware> ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardware OS


@Test
Scenario: TC14_Verification of Make text field Tool tip functionality in the  Hardware> ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardware Make

@Test
Scenario: TC15_Verification of Processor text field Tool tip functionality in the  Hardware> ADD screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify tooltip for hardware Processor

@Test
Scenario: TC16_Verification of redirection functionality for Bell icon in Hardware >ADD screen (Alerts record)
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then click on bell icon for alerts


@Test
Scenario: TC17_Verification of dropdown functionality for Profile icon in Hardware> ADD by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then click on add button icon
Then verify dropdown functionality for Profile icon in Hardware

@Test
Scenario: TC18_Verification of default Items per page functionality in the hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then Click on pagination it will display default records will display

@Test    
Scenario: TC111_Add hardware functionality test
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then verify add button on hardware list page
Then fill all mandatory and optional field for Add hardware
Then click on save button to save hardware


@Test    
Scenario: TC20_Edit hardware functionality test
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then search for hardware name
Then scroll right to the page to see action column
Then click on edit icon from actions column to Edit hardware
Then click on save button to save update the changes

@Test    
Scenario: TC21_Delete hardware functionality test
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then search for hardware name
Then scroll right to the page to see action column
Then click on Delete icon from actions column to delete hardware


@Test  
Scenario: TC22_Verification of reduction in the number of records in pagination section of Hardware details screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then Click on Pagination is in footer Below left side

@Test
Scenario: TC23_Verification of changing the items per page functionality in the hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then Click on Pagination is in footer Below left side



@Test
Scenario: TC24_Verification of displaying the First page (Full Backward arrow) button in the Hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then check full backward functionality is working

@Test
Scenario: TC25_Verification of displaying the Last page (Full Forward arrow) button in the hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then After pagination all default records will display in Last page.

@Test
Scenario: TC26_Verification of displaying the Next page (Forward arrow button in the hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then After pagination all default records will display in Last page.

@Test
Scenario: TC27_Verification of displaying the Previous page (Backward arrow button in the hardware List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then After pagination all default records will display in Previous page.
