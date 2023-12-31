
@SheetLOGIN
Feature: Login 


    @Test
    Scenario: TC01_Browser_compatibility_login_page
    Given User launch application in chrome browser
    
    @Test
    Scenario: TC02_Resizing_login_page_screen
    Given User launch application in chrome browser
    And verify page with resize the login page
    
    @Test
    Scenario: TC03_User_registration_super_admin
    Given User launch application in chrome browser
    When user register with valid data
    
    
     
    @Test
    Scenario: TC04_Verification_valid_super_admin
    Given User launch application in chrome browser   
    When user enters credentials and click on login button
    And Succesfull login should be happen
    
    @Test
    Scenario: TC05_Verification_super_admin_without_details
    Given User launch application in chrome browser   
    When user enters credentials and click on login button
    Then Verify Error message for userid and password
    
    @Test
    Scenario: TC06_Verification_super_admin_forgot_password
    Given User launch application in chrome browser
    When user enters credentials and click on login button
    And Verify forget password functionlity
    
     @Test
    Scenario: TC07_Verification_invalid_super_admin
    Given User launch application in chrome browser   
    When user enters credentials and click on login button
    Then Verify Error message
    
    
    @Test  
    Scenario: TC08_Verification_remember_me_super_admin
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And click on show password
    And Click on login button
    #
        @Test
    Scenario: TC09_Verification_viewed_password_super_admin
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And click on show password
    And Click on login button
    And Succesfull login should be happen
    
    @Test
    Scenario: TC10_Verification_change_password_super_admin/admin
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And click on change password and update new password
    Then login with new credentials
    And Succesfull login should be happen
    
    @Test
    Scenario: TC11_Verification_multiple_Browser_compatibility
    Given User launch application in edge browser and perform login  

    @Test
    Scenario: TC12_Login_with_validCredewntials_Click_EnterButton
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And Enter on login button    
    And Succesfull login should be happen
    
     @Test
    Scenario: TC13_Verification_get_time_login_page
    Given User launch application in chrome browser   
    When user enters valid userid
    And user enters valid password
    And Enter on login button    
    And Succesfull login should be happen
    And calculate login time
    
     @Test
    Scenario: TC14_Verification_cancel _button_availability
    Given User launch application in chrome browser  
    When user enters valid userid
    And user enters valid password
    And click on cancel button    
    And verify all fields should be clear
    
     @Test
    Scenario: TC15_Verification_font_text_color_font
    Given User launch application in chrome browser  
    When user enters valid userid
    And user enters valid password     
    And verify all fields color and fonts
    
     @Test
    Scenario: TC16_Verification_back_button_functionality
    Given User launch application in chrome browser
    When user enters valid userid
    And user enters valid password     
    And click on back button and verify page
    
     #@Test
    #Scenario: TC17_Verification_logging_and_logout
    #Given User launch application in chrome browser   
    #When user enters valid userid
    #And user enters valid password     
    #And Enter on login button    
    #And click on logout
    #And verify login page
    #
    #@Test
    #Scenario: TC18_Verification_logging_valid_credentials_multipleTab1
    #Given User launch application in chrome browser   
    #When user enters valid userid
    #And user enters valid password     
    #And Enter on login button    
    #And open new tab
    #When user enters valid userid
    #And user enters valid password     
    #And Enter on login button
    #And Succesfull login should be happen
    #
     #@Test
    #Scenario: TC18_Verification_logging_valid_credentials_multipleTab2
    #Given User launch application in chrome browser    
    #When user enters valid userid
    #And user enters valid password     
    #And Enter on login button    
    #And open new tab
    #When user enters valid userid
    #And user enters valid password     
    #And Enter on login button
    #And Succesfull login should be happen
    
   
     #@Test
    #Scenario: TC21_Verification_accepeteance _alphanumeric_values s_admin/admin
    #Given User launch application in chrome browser   
    #When user enters valid userid
    #And user enters valid password     
    #And Enter on login button    
    #And open new tab
    #When user enters alphanumeric value in userid
    #And Enter on login button
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
  