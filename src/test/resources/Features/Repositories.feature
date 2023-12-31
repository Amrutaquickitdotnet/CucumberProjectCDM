Repositories scenarios


Feature: Repositories
@Test
Scenario: TC03_Verification of viewing the Repositories table details
Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then Settings module & switching to the Repositorie tab



@Test
Scenario: TC04_Verification of the Add "+"button icon 

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Settings module & switching to the Repositorie tab



@Test
Scenario: TC05_Verification of Refreshing button functionality in the e Repositories List screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Settings module & switching to the Repositorie tab

@Test
Scenario: TC06_Verification of default Items per page functionality in the Repositories List screen 

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Settings module & switching to the Repositorie tab


@Test
Scenario: TC07_Verification of Search button functionality in the Repositories List screen 

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Settings module & switching to the Repositorie tab


@Test
Scenario: TC08_Verification of Pagination using backward button functionality in the Repositories List screen 

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Settings module & switching to the Repositorie tab


@Test
Scenario: TC09_Verification of Pagination using Forward button functionality in the Repositories  List screen 

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Settings module & switching to the Repositorie tab



@Test
Scenario: TC010_Verification of viewing the Edit button screen  in the Repositories module
Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then Click on Settings module & switching to the Repositorie tab

@Test
Scenario: TC011_Verification of Delete functionality in the  Repositories List screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And click on login button.
Then Click on Settings module & switching to the Repositorie tab


@Test
Scenario: TC012_Verification of the Edit button functionlity

Given User launch application in chrome browser
When Enters the URL
And user enters credentials and click on login button
Then Click on Settings module & switching to the Repositorie tab

@Test
Scenario: TC013_Verification of tooltip functionality for Edit icon in Actions column

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on the Settings module from side menu bar
And landing on General screen & switch to Repositories tab
Then Hover the mouse on EDIT Button from Actions columns


@Test
Scenario: TC014_Verification of tooltip functionality for Delete icon in Actions column

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on the Settings module from side menu bar
And After landing on General screen & switch to Repositories tab
Then Hover  the mouse on Delete Button from Actions columns



@Test
Scenario: TC015_Verification of tooltip functionality for add new icon on the top right side of repositories List screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on the Settings module from side menu bar
And After landing on General screen & switch to Repositories tab
Then Hover  the mouse on Add New Button on the top right side



@Test
Scenario: TC016_Verification of saving the record without entering any details in any fields in the Repositories Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then Click on Settings module & switch to Repositories tab & Click on "+' Icon i.e. ADD button




@Test
Scenario: TC017_Verification of redirection to Repositories List screen on clicking Cancel Button in Repositories> Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Settings module & switch to Repositories tab & Click on "+' Icon i.e. ADD button






@Test
Scenario: TC018_Verification of redirection to Repositories  List screen on clicking Save Button after entering the Mandatory fields of Repositories>ADD screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then Click on Settings module & switch to Repositories tab & Click on "+' Icon i.e. ADD button



@Test
Scenario: TC019_Verification of the acceptance of alphabet values in repository NameText field in the Repository>Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
And Type alphabeitc characters in Repository Name Text field in the Repository > Add screen
Then Message appears that only alphabetic characters are allowed



@Test
Scenario: TC020_Verification of the acceptance of name of the valid url values in URL Text field in the Repository>Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
And Type valid name of the application url in URL Text field in the Repository > Add screen
Then Message appears that only valid URL are allowed



@Test
Scenario: TC021_Verification of breaching the Max word limit in Repository Name Text field in Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
And Type alphabeitc characters in Repository Name Text field in the Repository > Add screen
Then Message appears that only alphabetic characters are allowed i.e. minimum 2 & max 32


@Test
Scenario: TC022_Verification of breaching the Max word limit in URL Text field in the Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
And Type alphanumeric with special characters in Repository URL Text field in the Repository > Add screen
Then Message appears that only valid URL are allowed i.e. minimum 8 & max No limit






@Test
Scenario: TC023_Verification of the acceptance of Data storage index text field using drop down in Repository > Add screen

Given User launch application in chrome browser
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then using drop drown of data storage index in Data storage index Text field in the Repository > Add screen


@Test
Scenario: TC024_Verification of the acceptance length in optional  repositry path text field in repositry > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Repository path optional Text field in the Repository > Add screen




@Test
Scenario: TC025_Verification of the acceptance of alphanumeric with special characters values in User NameText field in the Repository>Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then User Name optional Text field in the Repository > Add screen


@Test
Scenario: TC026_Verification of breaching the Max word limit in User Name Text field in Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then User Name optional Text field in the Repository > Add screen


@Test
Scenario: TC027_Verification of breaching the Min word limit in User Name Text field in Repository > Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then User Name optional Text field in the Repository > Add screen

@Test
Scenario: TC028_Verification of breaching the Min word limit in Password optional Text field in the Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Password optional Text field in the Repository > Add screen


@Test
Scenario: TC029_Verification of breaching the Max  word limit in Password optional Text field in the Repository >  Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Password optional Text field in the Repository > Add screen




@Test
Scenario: TC030_Verification of the acceptance of alphanumeric with special characters values in Password Text field in the Repository>Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And click on login button.
And Click on Settings module & switch to Repositories tab
Then Password optional Text field in the Repository > Add screen



@Test
Scenario: TC031_Verification of display default authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on EDGE Device module from side menu bar
Then Landed on Edge Device List screen



@Test
Scenario: TC032_Verification of View default Internal toggle button in Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then InternalToggle status button in the Repository > Add screen



@Test
Scenario: TC033_Verification of view of default Status toggle button in Repository > Add screen 

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Status Toggle button in the Repository > Add screen





@Test
Scenario: TC034_Verification of color of the default Status toggle button in Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Status Toggle button in the Repository > Add screen




@Test
Scenario: TC035_Verification of color of the default Internal toggle button in Repository > Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Internal Toggle button in the Repository > Add screen

@Test
Scenario: TC036_Verification of color of the default Authenticate toggle button in Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Authenticate Toggle button in the Repository > Add screen



@Test
Scenario: TC037_Verification of slide to change the Authenticate toggle button in Repository > Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Authenticate Toggle button in the Repository > Add screen slide to inactive to Active mode




@Test
Scenario: TC038_Verification of slide to change the Internal toggle button in Repository > Add screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Internal Toggle button in the Repository > Add screen slide to change





@Test
Scenario: TC039_Verification of slide to change the Status toggle button in Repository > Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories tab
Then Status Toggle button in the Repository > Add screen slide to change



@Test
Scenario: TC040_Verification of Search button functionality

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories>ADD screen ta
Then .On the top of the left sideClick on Three lines





@Test
Scenario: TC041_Verification of Expand button functionality

Given User launch application in chrome browser
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories>ADD screen tab
Then On the top of the left sideClick on Three lines


@Test
Scenario: TC042_Verification of Collapse button functionality in the EDGE Device List screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories>ADD screen tab
Then On the top of the left sideClick on Three lines



@Test
Scenario: TC043_Verification of Expand button functionality by click on Above Arrow mark on the top right in the Repositary > ADD  screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories>ADD screen tab
Then On the top of the left sideClick on Three lines




@Test
Scenario: TC044_Verification of Collapse button functionality by click on Down Arrow mark on the top right in the Repositary > ADD  screen

Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on Settings module & switch to Repositories>ADD screen tab
Then On the top of the left sideClick on Three lines





@Test
Scenario: TC045_Verification of the swapping of the Status toggle option in the Identity section of User Add screen

Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then Click on Settings module & switch to Users


