@SheetREPOSITORIES
Feature: REPOSITORIES


@Test
Scenario: TC01_Verification of Browser Compatibility of Repositories module of the application
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen
Then Click on Settings module from side menu bar & switching to Repositories tab


@Test
Scenario: TC02_Verification of resizing the Repositories module as per different zoom levels
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Try increasing & decreasing the Zoom% (from 50% to 150%) from browsers.

@Test
Scenario: TC03_Verification of viewing the Repositories table details by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab



@Test
Scenario: TC04_Verification of the Add "+"button icon on top right side of Repositories List screen by Super admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories



@Test
Scenario: TC05_Verification of Refreshing button functionality in the Repositories List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then click on refresh button

@Test
Scenario: TC06_Verification of default Items per page functionality in the Repositories List screen by Super admin/Admin user 
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Pagination is in footer Below left side

@Test
Scenario: TC07_Verification of Search button functionality in the Repositories List screen 
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then observe search functionality

@Test
Scenario: TC08_Verification of Pagination using backward button functionality in the Repositories List screen by user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then After pagination all default records will display in Last page.


@Test
Scenario: TC09_Verification of Pagination using Forward button functionality in the Repositories  List screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then After pagination all default records will display in Next page.



@Test
Scenario: TC010_Verification of viewing the Edit button screen in the Repositories module
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Scroll horizontal 
Then click on Edit button to edit repositories


@Test
Scenario: TC011_Verification of Delete functionality in the  Repositories List screen by Super admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then click on Delete button


@Test
Scenario: TC012_Verification of the Edit button functionlity in the Repositories module by Super admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then click on Edit button to edit repository

@Test
Scenario: TC013_Verification of tooltip functionality for Edit icon in Actions column of the Repositories List screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then verify tooltip for Edit button for repository


@Test
Scenario: TC014_Verification of tooltip functionality for Delete icon in Actions column of the repositories List screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then verify tooltip for Delete button for repository



@Test
Scenario: TC015_Verification of tooltip functionality for add new icon on the top right side of repositories List screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then click on three dots of repositories name and enter the value for the repositories
Then Scroll horizontal
Then Hover the mouse on Add New button on the top right side



@Test
Scenario: TC016_Verification of saving the record without entering any details in any fields in the Repositories Add screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then without entering any details click on save button


@Test
Scenario: TC017_Verification of redirection to Repositories List screen on clicking Cancel button in Repositories> Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on cancel button from repositories details page to list screen



@Test
Scenario: TC018_Verification of redirection to Repositories  List screen on clicking Save Button after entering the Mandatory fields of Repositories>ADD screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then fill all mandatory fields for respositories add section
Then hit on save button to save repositories




@Test
Scenario: TC019_Verification of the acceptance of alphabet values in repository NameText field in the Repository>Add screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type alphabeitc characters in Repository Name Text field in the Repository > Add screen. 
Then verify Message appears that only alphabetic characters are allowed



@Test
Scenario: TC020_Verification of the acceptance of name of the valid url values in URL Text field in the Repository>Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type valid name of the application url in URL Text field in the Repository > Add screen
Then verify Message appears that only valid URL are allowed



@Test
Scenario: TC021_Verification of breaching the Max word limit in Repository Name Text field in Repository > Add screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type alphabeitc characters in Repository Name Text field in the Repository > Add screen.
Then verify Message appears that only alphabetic characters are allowed


@Test
Scenario: TC022_Verification of breaching the Max word limit in URL Text field in the Repository > Add screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
And Type alphanumeric with special characters in Repository URL Text field in the Repository > Add screen
Then Message appears that only valid URL are allowed i.e. minimum 8 & max No limit

@Test
Scenario: TC023_Verification of the acceptance of Data storage index text field using drop down in Repository > Add screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then using drop drown of data storage index in Data storage index Text field in the Repository > Add screen


@Test
Scenario: TC024_Verification of the acceptance length in optional repository path text field in repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then fill the details under Repository path optional Text field in the Repository > Add screen
Then hit on save button to save repositories


@Test
Scenario: TC025_Verification of the acceptance of alphanumeric with special characters values in User NameText field in the Repository>Add screen by Super Admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the User Name optional Text field in the Repository > Add screen. 


@Test
Scenario: TC026_Verification of breaching the Max word limit in User Name Text field in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the value for username
Then verify message for User Name optional Text field in the Repository > Add screen

@Test
Scenario: TC027_Verification of breaching the Min word limit in User Name Text field in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then enter the value for username
Then User Name optional Text field in the Repository > Add screen

@Test
Scenario: TC028_Verification of breaching the Min word limit in Password optional Text field in the Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen


@Test
Scenario: TC029_Verification of breaching the Max  word limit in Password optional Text field in the Repository >  Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen


@Test
Scenario: TC030_Verification of the acceptance of alphanumeric with special characters values in Password Text field in the Repository>Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen



@Test
Scenario: TC031_Verification of display default authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen



@Test
Scenario: TC032_Verification of View default Internal toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen



@Test
Scenario: TC033_Verification of view of default Status toggle button in Repository > Add screen 
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Status Toggle button in the Repository > Add screen





@Test
Scenario: TC034_Verification of color of the default Status toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then verify colour of the toggle





@Test
Scenario: TC035_Verification of color of the default Internal toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories


@Test
Scenario: TC036_Verification of color of the default Authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories




@Test
Scenario: TC037_Verification of slide to change the Authenticate toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories





@Test
Scenario: TC038_Verification of slide to change the Internal toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories






@Test
Scenario: TC039_Verification of slide to change the Status toggle button in Repository > Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then Password optional Text field in the Repository > Add screen
Then Status Toggle button in the Repository > Add screen



@Test
Scenario: TC040_Verification of Search button functionality in the Repository add  screen by Super admin
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories






@Test
Scenario: TC041_Verification of Expand button functionality in the Repositories List screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on expand button from navigation menu


@Test
Scenario: TC042_Verification of Collapse button functionality in the Repositories List screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then click on collapse button from navigation menu



@Test
Scenario: TC043_Verification of Expand button functionality of accordion of Repository > ADD  screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then On the top of the left side Click on accordion




@Test
Scenario: TC044_Verification of Collapse button functionality of accordion in the Repository > ADD  screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
Then check collapsible accordion functionality





@Test
Scenario: TC045_Verification of the swapping of the Status toggle option in the Identity section of User Add screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar & switching to Repositories tab
Then Click on Add button icon on top right side of repositories
