@SheetAPPS
Feature: APPS

@Test
Scenario: TC01_Verification of Browser Compatibility of Apps module of the application
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen

@Test
Scenario: TC02_Verification of resizing the Apps module as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then verify page with resize option for App page
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen


@Test
Scenario: TC03_Verification of Search button functionality in the Apps List screen by Super admin 
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then serach for application name , architecture, Version

@Test
Scenario: TC04_Verification of Expand button functionality in the Apps List screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then click on expand button from navigation menu


@Test
Scenario: TC05_Verification of viewing the Apps table details by Super admin/admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen


@Test
Scenario: TC06_Verification of the View Volume details icon in Actions column Apps List screen by Super admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then click on View VolumeDetails icon from actions column

@Test
Scenario: TC07_Verification of Refreshing button functionality in the Apps List screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then click on refresh button for apps




@Test
Scenario: TC08_Verification of status Tool tip functionality in the Apps list screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then verify tooltip for Status


@Test
Scenario: TC09_Verification of App Name text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for App Name from update Screen

@Test
Scenario: TC10_Verification of App Display Name text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for App Display Name from update Screen

@Test
Scenario: TC11_Verification of Repository Link text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for Repository Link from update Screen

@Test
Scenario: TC12_Verification of License Type text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for License Type from update Screen

@Test
Scenario: TC13_Verification of Config Master text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for Config Master from update Screen



@Test
Scenario: TC14_Verification of version text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for version from update Screen


@Test
Scenario: TC15_Verification of Architecture text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for Architecture from update Screen

@Test
Scenario: TC16_Verification of root volume text field Tool tip functionality in the Apps >Update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then cilck on Pencil icon i.e. EDIT button
Then verify tooltip for root volume from update Screen

@Test
Scenario: TC17_Verification of edit functionality of App screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then click on three dots on application list and enter the value for search and click on Edit button
Then edit all the field listed on the update page 
Then click on save button to save app


@Test
Scenario: TC18_Verification of cancellation of saving data on Apps update screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then click on three dots on application list and enter the value for search and click on Edit button
Then click on cancel button to Cancel updation



@Test
Scenario: TC19_Verification of inactive close icon from action column
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Apps tab from right panel of the screen
Then click on inactive button to deactivate application

