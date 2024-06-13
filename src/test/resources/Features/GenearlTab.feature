@SheetGENERAL
Feature: GENERAL

@Test
Scenario: TC01_Verification of Browser Compatibility of Settings>General module of the application
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
And Succesfull login should be happen

@Test
Scenario: TC02_Verification of resizing the Settings>General sub module as per different zoom levels
Given User launch application in chrome browser
Then click on login button on home page
And verify page with resize the login page


@Test
Scenario: TC03_Verification of Visiblity of Environment drop down  by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen

@Test
Scenario: TC04_Verification of Expand button functionality in the General Tab screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Configurations module from side menu bar
Then After landing Switch to General tab, Click on Four lines on the top of Left side


@Test
Scenario: TC05_Verification of Select the Constraint mode functionality from the Environment drop down in the General Tab screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen
Then After landing Switch to General tab, Click on Four lines on the top of Left side


@Test
Scenario: TC06_Verification of Collapse button functionality in the General Tab screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen
Then After landing Switch to General tab, Click on Four lines on the top of Left side

@Test
Scenario: TC07_Verification of Select the Non-Constraint Constraint mode functionality from the Environment drop down in the General Tab screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen
Then After landing Switch to General tab, Click on Environment Dropdown & Select Non-Constraint Mode

@Test
Scenario: TC08_Verification of Refreshing button functionality in the Select Version checks for updates section screen by Super admin/Admin user
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen
Then After landing Switch to General tab, Click on Environment Dropdown & Select Non-Constraint Mode

@Test
Scenario: TC09_Verification of Host Textfield Tool tip functionality in the SMTP screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen
Then After landing Switch to General tab, Click on Environment Dropdown & Select Non-Constraint Mode 

@Test
Scenario: TC10_Verification of Port Textfield Tool tip functionality in the SMTP Section General screen by Super admin
Given User launch application in chrome browser
Then click on login button on home page
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Genearl tab from right panel of the screen
Then After landing Switch to General tab, Click on Environment Dropdown & Select Non-Constraint Mode

