@SheetALERTS
Feature: ALERTS

@Test
Scenario: TC01_Verification of Browser Compatibility of Alert module of the application
Given User launch application in chrome browser
When user enters credentials and click on login button
And Succesfull login should be happen
Then Click on Alerts module from side menu bar

@Test
Scenario: TC02_Verification of resizing the Alert as per different zoom levels
Given User launch application in chrome browser
When user enters credentials and click on login button
Then verify page with resize option for the Alert page


@Test
Scenario: TC03_Verification of displaying the Alert table details after clicking on Alert module option from side menu bar by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar

@Test
Scenario: TC04_Verification of Bulk download button functionality in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then click on bulk download button of alerts


@Test
Scenario: TC05_Verification of Refreshing button functionality in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on the Refresh button for alerts


@Test
Scenario: TC06_Verification of the search functionality for Assigned To in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal
Then click on three dots of AssignedTo field and enter the value for AssignedTo Field



@Test
Scenario: TC07_Verification of the search functionality for Priority Level To in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal
Then click on three dots of Priority Level field and enter the value for Priority Level Field


@Test
Scenario: TC08_Verification of the search functionality for Expected Closure Date in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on ExpectedClosureDateThreeDot icon and enter the value in datepickercolumn




@Test
Scenario: TC09_Verification of reduction in the number of records in pagination section of Alert details screen
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination part it will display default records will display 



@Test
Scenario: TC10_Verification of changing the items per page functionality in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination part it will display default records will display 

@Test
Scenario: TC11_Verification of displaying the items per page by default i.e. 25 per page in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination part it will display default records will display 



@Test
Scenario: TC12_Verification of displaying the total number of records with pagination icons in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination part it will display default records will display 


@Test
Scenario: TC13_Verification of displaying the First page (Full Backward arrow) button in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination to check functionality of Full Backward arrow 



@Test
Scenario: TC14_Verification of displaying the Last page (Full Forward arrow button in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination to check functionality of Full forward arrow



@Test
Scenario: TC15_Verification of displaying the Next page (Forward arrow button in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination to check Next button(Forward arrow) functionality



@Test
Scenario: TC16_Verification of displaying the Previous page (Backward arrow button in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on pagination to check Previous Page button(Backward arrow) functionality


@Test
Scenario: TC17_Verification of the search functionality for Alert ID in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert ID search icon of alert page i.e. three dots & enter Valid inputs into search text field

@Test
Scenario: TC18_Verification of the search functionality for Alert ID (Invalid Alert ID) in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert ID search icon of alert page i.e. three dots & enter inValid inputs into search text field




@Test
Scenario: TC19_Verification of the search functionality for Summary  in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Summary search icon i.e. three dots & enter valid inputs into search text field




@Test
Scenario: TC20_Verification of the search functionality for Edge Name in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on edge name search icon i.e. three dots & enter valid inputs into search text field


@Test
Scenario: TC21_Verification of the search functionality for Raised On in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on raisedOnThreeDots icon and enter the value in datepickercolumn



@Test
Scenario: TC22_Verification of the removal of search results and text for all Edge Name Column in the Alert screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on edge name search icon i.e. three dots & enter valid inputs into search text field
Then remove search result 


@Test
Scenario: TC23_Verification of the removal of search results and text for Alert ID columns in the Alert screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert ID search icon of alert page i.e. three dots & enter Valid inputs into search text field
Then remove text from alert ID

@Test
Scenario: TC24_Verification of the removal of search results of Summary in the Alert screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Summary search icon i.e. three dots & enter valid inputs into search text field
Then remove text from alert summary

@Test
Scenario: TC25_Verification of the search functionality for Expected Closure Date On in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on ExpectedClosureDateThreeDot icon and enter the value in datepickercolumn

@Test
Scenario: TC26_Verification of the search functionality for ActualClosureDate On in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal 
Then Click on ActualClosureDate icon and enter the value in datepickercolumn

@Test
Scenario: TC27_Verification of the search functionality for Alert Category column (Valid Alert Category) in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as server connectivity issue


@Test
Scenario: TC28_Verification of the search functionality for Alert Category device connectivity issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as device connectivity issue

@Test
Scenario: TC29_Verification of the search functionality for Alert Category server connectivity issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as server connectivity issue

@Test
Scenario: TC30_Verification of the search functionality for Alert Category network connectivity issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as network connectivity issue

@Test
Scenario: TC31_Verification of the search functionality for Alert Category device storage space exceeded issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as storage space exceeded issue

@Test
Scenario: TC32_Verification of the search functionality for Alert Category License Certified expired issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as License Certified expired issue

@Test
Scenario: TC33_Verification of the search functionality for Alert Category Edge Device Hardware Down issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as Edge Device Hardware Down issue

@Test
Scenario: TC34_Verification of the search functionality for Alert Category Configuration file unavailable issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as Configuration file unavailable

@Test
Scenario: TC35_Verification of the search functionality for Alert Category DataBase Connectivity issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as DataBase Connectivity issue

@Test
Scenario: TC36_Verification of the search functionality for Alert Category device container issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as container issue

@Test
Scenario: TC37_Verification of the search functionality for Alert Category  application issue in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert Category search icon of alert page i.e. three dots & choose Alert type as application issue


@Test
Scenario: TC38_Verification of the search functionality for priority level in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal
Then Click on Alert Category search icon of alert page i.e. three dots & choose priority Type as Low

@Test
Scenario: TC39_Verification of the search functionality for priority level in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal
Then Click on Alert Category search icon of alert page i.e. three dots & choose priority Type as Medium


@Test
Scenario: TC40_Verification of the search functionality for priority level in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal
Then Click on Alert Category search icon of alert page i.e. three dots & choose priority Type as High

@Test
Scenario: TC41_Verification of the search functionality for Status Open in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal at the end of the screen
Then Click on status search icon of alert page i.e. three dots & choose Status Type

@Test
Scenario: TC42_Verification of the search functionality for Status closed in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal at the end of the screen
Then Click on status search icon of alert page i.e. three dots & choose Status Type Closed

@Test
Scenario: TC43_Verification of the search functionality for Status In Progress in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then scroll horizontal at the end of the screen
Then Click on status search icon of alert page i.e. three dots & choose Status Type In Progress


@Test
Scenario: TC44_Verification of completion of acknowledgement functionality in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert ID search icon of alert page i.e. three dots & enter Valid inputs into search text field
Then scroll horizontal at the end of the screen
Then Click on edit icon to complete action
Then Click on acknowledge button to complete alert acknoledgement



@Test
Scenario: TC45_Verification of remark functionality in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert ID search icon of alert page i.e. three dots & enter Valid inputs into search text field
Then scroll horizontal at the end of the screen
Then Click on edit icon to complete action
And Click on Add button to add remarks
Then enter the value for the remarks and click on submit button



@Test
Scenario: TC46_Verification of complete functionality in the Alert List screen by Super admin/Admin user
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Alerts module from side menu bar
Then Click on Alert ID search icon of alert page i.e. three dots & enter Valid inputs into search text field
Then scroll horizontal at the end of the screen
Then Click on edit icon to complete action
Then Click on complete button to complete alert