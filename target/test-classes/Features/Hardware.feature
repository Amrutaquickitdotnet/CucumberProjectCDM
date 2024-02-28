@SheetHARDWARE

Feature: HARDWARE



@Test    
Scenario: TC19_Add hardware functionality test
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Hardware tab from right panel of the screen
Then verify add button on hardware list page
Then fill all mandatory and optional field for Add hardware
Then click on save button to save hardware


#@Test    
#Scenario: TC20_Edit hardware functionality test
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Hardware tab from right panel of the screen
#Then search for hardware name
#Then scroll right to the page to see action column
#Then click on edit icon from actions column to Edit hardware
#Then click on save button to save update the changes
#
#@Test    
#Scenario: TC21_Delete hardware functionality test
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on Settings module from side menu bar
#Then Click on Hardware tab from right panel of the screen
#Then search for hardware name
#Then scroll right to the page to see action column
#Then click on Delete icon from actions column to delete hardware