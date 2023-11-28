
Feature: EDGE Groups

@Test1
Scenario: TC01_Verification of Browser Compatibility of EDGE Group module
Given User launch application in chrome browser.
When Enters the URL
And user enters credentials and click on login button
Then land on the dashboard after successful login 
And click on EDGE Group


Scenario: TC02_Resizing_login_page_screen
Given User launch application in chrome browser
And verify page with resize the login pageScenario


Scenario: TC03_Verification of displaying the EDGE Group table
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then land on the dashbord
And Click on EDGE Group module from side menu bar


Scenario: TC04_Verification of Add, Refresh, Application deployment,Bulk upload & Download button icons
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on EDGE Group module from side menu bar

Scenario: TC05_Verification of Refreshing button functionality in the EDGE Group
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Refreshing button

Scenario: TC06_Verification of Add button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on add button


Scenario: TC07_Verification of Search button functionality in the EDGE Group  
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then land on the dashbord

Scenario: TC08_Verification of Application Deployment button functionality 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Profile icon on the top of the Right side

Scenario: TC09_Verification of Bulk download button functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord
Then Click on Profile icon on the top of the Right side.& click on password from drop down

Scenario: TC10_Verification of displaying the Edit screen in the EDGE Group
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And click on login button.
And landed on the dashbord
Then Click on Profile icon on the top of the Right side.& click on Update Password from drop down

Scenario: TC11_Verification of Delete functionality 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord 
Then Click on delete icon button in action column


Scenario: TC12_Verification of Application Deploy functionality
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And land on the dashbord 
Then Click on Deploy icon Button in actions column

Scenario: TC13_Verification of tooltip functionality for Edit (pen) icon button under action column
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord
Then Hover the mouse on Edit (Pen)icon Button from Actions columns

Scenario: TC14_Verification of tooltip functionality for Delete icon under Actions column
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landed on the dashbord
Then Hover the mouse on Delete Button from Actions columns

Scenario: TC15_Verification of tooltip functionality for View Alert(Notifications) icon in Actions column
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And landen on the dashbord
Then Hover the mouse on Bell icon Button from Actions columns

Scenario: TC16_Verification of reduction in the number of records in pagination section
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashbord
Then Pagination is in footer(Below) right side

Scenario: TC17_Verification of changing the items per page functionality 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Click on EDIT button on the top right side
Then Pagination is in footer(Below) Left side

Scenario: TC18_Verification of displaying the items per page by default i.e.25 per page 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on Edit icon on the top of right side
Then Pagination is in footer(Below) Left side 


Scenario: TC19_Verification of displaying the total number of records with pagination icons 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And click on login button.
Then Click on ADD button & Navigate to the screen
Then After pagination all default records will display

Scenario: TC20_Verification of displaying the First page (Full Backward arrow) button 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on the Edit icon in Dahboard
Then After pagination all default records will display in First page

Scenario: TC21_Verification of displaying the Last page (Full Forward arrow button)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then After pagination all default records will display in Next page 
 

Scenario: TC22_Verification of displaying the Next page (Forward arrow button)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And After landing on EDGE Group List screen.
Then pagination all default records will display in Next page 

Scenario: TC23_Verification of displaying the Previous page (Backward arrow button)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then After pagination,previous page. all default records will display 


Scenario: TC24_Verification of the search functionality for Group Name column (Valid Group Name) 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field.
 
Scenario: TC25_Verification of the search functionality for Group Name column (InValid Group Name) 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on ADD button in the Dashboard
Then Click on EDGE Group Name search icon i.e. three dots & enter Invalid inputs into search text field.


Scenario: TC26_Verification of the search functionality for Status column (Valid Status entry)
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on EDGE Group Status search icon i.e. three dots & enter Valid inputs into search text field.


Scenario: TC27_Verification of the change in colour of three dots for all columns in the EDGE Group List screen 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
And Landed on the dashboard list screen 
Then Click on search icon i.e. three dots & white color changed to RED COLOR


Scenario: TC28_Verification of the display of search bar and text for all columns 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard and Click on EDGE Group
Then Click on search icon i.e. three dots & search text field visible with cursor 

Scenario: TC29_Verification of the removal of search results and text for all columns
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then Click on the EDGE Group module from side menu bar
Then After landing on EDGE Group List screen
Then Click on search icon i.e. three dots & Enter valid inputs as per required from table details into search text field and enter backspace & click on enter

Scenario: TC30_Verification of blank value rejections in available fields of Identity section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
And Click on EDGE Group 
Then Click on ADD New button("+" icon)on the top right side & landed on EDGE Group>ADD Screen 


Scenario: TC31_Verification of blank value rejections in available fields of Health section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on edgegroup module
And Click on ADD New button("+" icon)on the top right side & landed on EDGE Group>ADD Screen 

Scenario: TC32_Verification of redirection functionality for Cancel icon in Add screen 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group list screen
Then Click on ADD New button ("+" Icon) on the top right side & landed on EDGE Group > ADD Screen,
And click on cancel button in EDGE Group
Then ADD screen on the below of the screen

Scenario: TC33_Verification of blank value rejections in mandatory fields of Identity section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button ("+"icon)on the top right side & landed on EDGE Group Group>ADD Screen
And enter valid  values for all mandatory text fields & click on save.

Scenario: TC34_Verification of blank value rejections in available fields of Registration sections in Add screen  
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And without enter any values & click on save.

Scenario: TC35_ Verification of blank value rejections in available fields of Deployment section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And without enter any values click on save then scroll down

Scenario: TC36_Verification of blank value rejections in available fields of Configuration section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And without enter any values click on save

Scenario: TC37_Verification of acceptance of Numeric,Special, alphabets  char values in GROUP ID Text field in the Identity section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And enter valid values and click on save

Scenario: TC38_Verification of acceptance of Alphanumeric,special char values in GROUP Name Text field in the Identity section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And enter valid values and click on save

Scenario: TC39_Verification of breaching the Max character limit in Group ID Text field in the Identity section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And Enter alphanumeric with special chars values into Group ID text fields

Scenario: TC40_Verification of breaching the Max character limit in Group Name Text field in the Identity section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And Enter alphanumeric with special chars values into Group Name text fields

Scenario: TC41_Verification of selection of the from Application Group drop down in the Deployment section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And select application group name using dropdown from deployment section

Scenario: TC42_Verification of selection of the from Maximum EDGE Nodes drop down in the Configuration section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And select maximum EDGE Nodes using dropdown from Configuration section

Scenario: TC43_Verification of selection of the from Maximum Server Nodes drop down in the Configuration section of User Add screen 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And select maximum Server Nodes using dropdown from Configuration section

Scenario: TC44_Verification of selection of the from Delink EDGE Device drop down in the Configuration section of User Add screen 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And select Delink EDGE Device using dropdown from Configuration section

Scenario: TC45_Verification of cloud button is on premise i.e.(Enable mode) in Configuration section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And Click on cloud button is anable mode in Configuration section

Scenario: TC46_Verification of selection of the from Maximum Application drop down in the Configuration section of User Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And select Maximum Application using dropdown from Configuration section

Scenario: TC47_Verification of upload of onboarding EDGE Configuration in Registration section in Add screen
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And click on Upload button of onboarding EDGE Configuration certificates in Registration section

Scenario: TC48_Verification of Download of EDGE Configuration in Registration section in Add screen of EDGE Group add module
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on ADD New button on the top right side & landed on EDGE Group Group then ADD Screen
And Click on Download button of EDGE Configuration certificates in Registration section

Scenario: TC49_Verification of Viewing of all the steppers & select the EDGE GROUP to deploy the application of EDGE Group module
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side 
And landed on EDGE Group Group then Application deployment Screen


Scenario: TC50_Verification of select the Active APP GROUP for deploy the application
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the check box valid APP GROUP NAME and click on NEXT button

Scenario: TC51_Verification of Single select of the Active EDGE Device for deploy the application
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the check box valid EDGE and click on NEXT button

Scenario: TC52_Verification of mulitiple select of the  Active  EDGE Device for deploy the application
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select multiple check box in EDGE and click on NEXT button

Scenario: TC53_Verification of Single select of the Active Application for deploy of EDGE Group module
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name and click on NEXT button

Scenario: TC54_Verification of multi select of the Active Application for deploy module of EDGE Group 
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the multiple check box valid Application name and click on NEXT button

Scenario: TC55_ Verification of view of version tag when select of the Application for deploy module of EDGE Group
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name with latest version tag column and click on NEXT button


Scenario: TC56_Verification of user unable to deploy without confirming the Config file for deploy module of EDGE Group
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name with latest version tag column and click on NEXT button


Scenario: TC57_Verification of deployment failure on wrong On boarding key in EDGE Device
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And Deploy stepper & and click on NEXT button

Scenario: TC58_Verification of deployment failure on empty On boarding key in EDGE Device
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name with latest version tag column and click on NEXT button

Scenario: TC60_Verification of deployment failure on wrong /empty Server Host Adress on EDGE Group
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name with latest version tag column and click on NEXT button


Scenario: TC61_Verification of deployment creation only for single newly selected application during deployment
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name with latest version tag column and click on NEXT button


Scenario: TC62_Verification of deployment creation only for multiple newly selected application during deployment
Given User launch application in chrome browser
When user enters URL
And user enters credentials and click on login button
Then landed on the dashboard
Then Click on EDGE Group Module from side menu bar
Then After landing on EDGE Group List screen,
Then Click on APP DEPLOY icon button on the top right side
And landed on EDGE Group then Application deployment screen 
And select the single check box valid Application name with latest version tag column and click on NEXT button

