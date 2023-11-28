
Feature: APP GROUPS


    @Test
    Scenario: TC01_Verification of Browser_compatibility 
    Given User launch application in chrome browser
    When Enter URL
    And user enters credentials and click on login button 
    Then Landed on Dashboard
    Then Click on APP Group module from side menu bar
    
    
    @Test
    Scenario: TC02_Resizing__page_screen
    Given User launch application in chrome browser
    When Enter URL
    And user enters credentials and click on login button 
    Then Landed on Dashboard
    And verify page with resize the login page
    
    @Test
    Scenario: TC03_Verification of ADD button Functionality 
    Given User launch application in chrome browser
    When user Enter URL
    And user enters credentials and click on login button
    And Landed on Dashboard
    Then Click on APP Group module from side menu bar.
    
    @Test
    Scenario: TC04_Verification of save button with out details
    Given User launch application in chrome browser   
    When Enter URL
    And user enters credentials and click on login button
    And Landed on the dashboard
    Then Click on APP Group module from side menu bar
    
    
    @Test
    Scenario: TC05_Verify user fill all the mandatory valid datails and click on save button in ADD screen
    Given User launch application in chrome browser
    When Enter URL   
    And user enters credentials and click on login button
    And Landed on the dashboard
    Then Click on APP Group module from side menu bar
   
    
     @Test
    Scenario: TC06_Verify user fill all the mandatory valid datails and click on save button in ADD screen
    Given User launch application in chrome browser
    When Enter URL
    And user enters credentials and click on login button
    And Landed on the dashboard
    Then Click on APP Group module from side menu bar
    
    @Test
    Scenario: TC07_Verify user fill all the mandatory valid datails and click on save button in ADD screen
    Given User launch application in chrome browser 
    When Enter URL  
    And user enters credentials and click on login button
    And Landed on the dashboard 
    Then Click on APP Group module from side menu bar
    
    @Test  
    Scenario: TC08_Verify if user Searching result should be display when u have enter the search 
    Given User launch application in chrome browser   
    When Enter URL
    And user enters credentials and click on login button
    And Landed on the dashboard
    Then Click on APP Group module from side menu bar 
    
   
    @Test
    Scenario: TC09_Verification of Expand button functionality in the APP Group >ADD screen 
    Given User launch application in chrome browser   
    When Enter URL
    And user enters credentials and click on login button
    And Landed on the dashboard
    Then Click on APP Group module from side menu bar
    
    @Test
    Scenario: TC10_Verification of Collapse button functionality in the User screen by Super admin/Admin user
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And click on change password and update new password
    Then login with new credentials
    And Succesfull login should be happen
    
    @Test
    Scenario: TC11_Verification of the acceptance of alphabet values in First Name Text field in the Identity section 
    Given User launch application in edge browser and perform login  

    @Test
    Scenario: TC12_Login_with_validCredewntials_Click_EnterButton
    Verification of the acceptance of alphabet values in Last Name Text field in the Identity section 
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And Enter on login button    
    And Succesfull login should be happen
    
    @Test
    Scenario: TC13_Verification_get_time_login_page
    Verification of breaching the Max word limit in First Name Text field in the Identity section 
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And Enter on login button    
    And Succesfull login should be happen
    And calculate login time
    
    @Test
    Scenario: TC14_Verification of breaching the Max word limit in Last Name Text field in the Identity section of User Add screen by Super admin/Admin user
    Given User launch application in chrome browser  
    When user enters valid userid
    And user enters valid password
    And click on cancel button    
    And verify all fields should be clear
    
    @Test
    Scenario: TC15_Verification of the acceptance of valid number in Contact Number field in the Identity section 
    Given User launch application in chrome browser  
    When user enters valid userid
    And user enters valid password     
    And verify all fields color and fonts
    
    @Test
    Scenario: TC16_Verification of the rejection of invalid number in Contact Number field in the Identity section 
    Given User launch application in chrome browser
    When user enters valid userid
    And user enters valid password     
    And click on back button and verify page
    
    @Test
    Scenario: TC17_Verification of the rejection of blanks and spaced number in Contact Number field in the Identity section 
    Given User launch application in edge browser   
    When user enters valid userid
    And user enters valid password     
    And Enter on login button    
    And click on logout
    And verify login page
    
    @Test
    Scenario: TC18_Verification of copy pasting numeric digits in Contact Number field in the Identity section 
    Given User launch application in edge browser   
    When user enters valid userid
    And user enters valid password     
    And Enter on login button    
    And open new tab
    When user enters valid userid
    And user enters valid password     
    And Enter on login button
    And Succesfull login should be happen
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
  