@SheetCLIENT

Feature: CLIENT

#****** Add/update/Delete User>> Settings*******

#@Test    
#Scenario: TC01_Add user functionality test under user sub module setting page
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users tab from right panel of the screen
#Then verify add button on user list page
#Then fill all mandatory and optional field for Add users


@Test
Scenario: TC02_Edit user functionality test under user sub module setting page
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Users tab from right panel of the screen
Then click on three dots for first name and enter the value in the place of first name
Then click on edit icon from actions column
Then verify Edit button on user list page
#
@Test
Scenario: TC03_Delete user functionality test under user sub module setting page
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Users tab from right panel of the screen
Then click on three dots for first name and enter the value in the place of first name
Then click on Delete icon from actions column to delete user

#******* UserRole  Add / update / Delete>>Settings*******

#@Test
#Scenario: TC01_Add Role functionality test under user roles setting page
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Roles Tab from right panel of the screen
#Then click on add button to add role

#@Test
#Scenario: TC02_Edit Role functionality test under user roles setting page
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Roles Tab from right panel of the screen
#Then click on three dots for role name and serach for role
#Then click on Edit button to edit role
#Then update the value for role and click on save button
#
#@Test
#Scenario: TC03_Delete user role functionality
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Roles Tab from right panel of the screen
#Then click on three dots for role name and serach for role
#Then click on Delete icon from actions column

#@Test
#Scenario: TC01_Add usergroup functionality test under user setting page
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on add button to add user group

#@Test
#Scenario: TC02_Edit usergroup functionality test under user setting page
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on three dots for user group and serach for user group
#Then click on Edit button to edit user group
#Then update the value for usergroup and click on save button


#@Test
#Scenario: TC03_Delete usergroup functionality
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Users Groups Tab from right panel of the screen
#Then click on three dots for user group and search for user group
#Then click on Delete icon from actions column to delete user group name
#
