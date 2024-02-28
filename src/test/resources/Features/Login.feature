@SheetLogin
Feature: LOGIN
#
#@Test
#Scenario: TC01_Verification of Browser Compatibility of Login page of the application
#Given User launch application in chrome browser   
#When user enters valid userid
#And user enters valid password
#And Enter on login button    
#And Succesfull login should be happen
#
#
#@Test
#Scenario: TC02_Verification of resizing the Login screen as per different zoom levels
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then verify page with resize option the login page

@Test
Scenario: TC03_Verification of User registration screen as a Super admin
Given User launch application in chrome browser
When the Super admin enters valid credentials and clicks login
Then the Super admin should be redirected to the Super admin dashboard

#@Test
#Scenario: TC04_Verification of Super admin User Login with a valid super admin Username, i.e. email id & valid password
#Given User launch application in chrome browser   
#When user enters credentials and click on login button
#And Succesfull login should be happen
#
#@Test
#Scenario: TC05_Verification of the login page for both Super admin/Admin without entering details
#Given User launch application in chrome browser   
#When user enters credentials and click on login button
#Then Verify Error message for userid and password
#
#
#@Test
#Scenario: TC06_Verification of the ‘Forgot Password’ functionality for both Super admin/Admin
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Verify forgot password functionlity
#
#
#@Test
#Scenario: TC07_Verification of the messages for invalid login for both Super admin/Admin
#Given User launch application in chrome browser   
#When user enters credentials and click on login button
#Then Verify Error message
#
#
#@Test
#Scenario: TC08_Verification of the ‘Remember Me’ functionality for both Super admin/Admin
#Given User launch application in chrome browser   
#When user enters valid userid
#And user enters valid password
#And click on show password
#And Click on login button

#
#@Test
#Scenario: TC09_Verification of the availability of data in password field when viewed by both Super admin/Admin
#Given User launch application in chrome browser   
#When user enters valid userid
#And user enters valid password
#And click on show password
#And Click on login button
#And Succesfull login should be happen
#
#@Test
#Scenario: TC10_Verification of both Super admin/Admin user logging with a new password after he/she has changed the password
#Given User launch application in chrome browser   
#When user enters valid userid
#And user enters valid password
#And click on change password and update new password
#Then login with new credentials
#And Succesfull login should be happen

@Test
Scenario Outline:: TC11_Verification of logging in with valid credentials in multiple browsers simultaneously
Given User launch application in chrome browser 
When the user enters valid credentials "<username>" and "<password>" and clicks login
Then the user should be redirected to the dashboard

 Examples:
    | username | password |
    | devendar.malothu@birlasoft.com | AutoTest@123|
    | devendarm@birlasoft.com    | Admin@123|

    
    
#@Test
#Scenario: TC12_Verification of working of the 'Enter' Key in the login page
#Given User launch application in chrome browser   
#When the user enters valid credentials and presses the 'Enter' key
#Then Verify Error message for userid and password
#
#
#@Test
#Scenario: TC13_Verification of the time taken to log in with a valid username and password
#Given User launch application in chrome browser   
#When user enters valid credentials and click on login button
#Then the user should be redirected to the dashboard and login time should be measured
#
#@Test
#Scenario: TC14_Verification of the availability of a ‘Cancel’ button to erase the entered text
#Given User launch application in chrome browser  
#When user enters valid userid
#And user enters valid password
#And click on cancel button
#And verify all fields should be clear
#
#@Test
#Scenario: TC15_Verification of compliance to the Login page standards in terms of font, text color and color coding
#Given User launch application in chrome browser  
#When user enters valid userid
#And user enters valid password 
#And the user should verify compliance with login page standards
#
#@Test
#Scenario: TC16_Verification of the failed re-entry by pressing ‘Back button’ on the browser
#Given User launch application in chrome browser
#When user enters valid userid
#And user enters valid password 
#And click on back button and verify page
#
#@Test
#Scenario: TC17_Verification of the timeout functionality of the login session
#Given User launch application in chrome browser   
#When user enters valid credentials and click on login button
#Then the user should be redirected to the dashboard and login time should be measured
#And the user waits for an extended period to simulate session timeout
#And the user attempts to interact with the application
#Then the user should be redirected to the login page due to session timeout
#And verify login page

@Test
Scenario: TC18_Verification of logging in functionality with different valid credentials in the same browser simultaneously
Given User launch application in chrome browser   
When the user logs in with valid credentials "user1" and "password1"
When another user logs in with valid credentials "user2" and "password2"
Then both users should be redirected to their respective dashboards

#
#@Test
#Scenario: TC19_Verification of the limit on the number of characters entered in each field (Username and Password) of the login page
#Given User launch application in chrome browser
#When user enters valid userid
#And user enters valid password 
#And Enter on login button
#And Succesfull login should be happen
#
   #
#@Test
#Scenario: TC20_Verification of the wrong attempts of username & passwords by the Super admin/Admin User several times
#Given User launch application in chrome browser   
#When user enters valid userid
#And user enters valid password 
#And Enter on login button
#And open new tab
#When user enters alphanumeric value in userid
#And Enter on login button
#
#@Test
#Scenario: TC21_Verification of acceptance of special characters, alphabets, numeric digits, case sensitivity, maximum length, minimum length in password field for Superadmin/Admin Users
#Given User launch application in chrome browser   
#When user enters valid userid
#And user enters valid password 
#And Enter on login button
#And open new tab
#When user enters alphanumeric value in userid
#And Enter on login button
#
  