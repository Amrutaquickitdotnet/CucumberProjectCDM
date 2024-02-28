#@SheetEDGEDEVICES
#Feature: EDGE Devices
#
#
#@Test
#Scenario: TC01_Verification of Browser Compatibility of EDGE Device module of the application
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#And Succesfull login should be happen
#
#@Test
#Scenario: TC02_Verification of resizing the EDGE Device module as per different zoom levels
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then verify page with resize option the login page
#
#@Test    
#Scenario: TC03_Verification of displaying the EDGE Device table details after clicking on EDGE Device module option from side menu bar by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#
#
#@Test
#Scenario: TC04_Verification of displaying the Add button, Refresh, Application configuration,Bulk Upload & Download button icons on top right side of EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Verify all buttons are working
#
#@Test
#Scenario: TC05_Verification of Refreshing button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen, and Click on Refresh button
#
#@Test
#Scenario: TC06_Verification of Add button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen, Click on ADD New button
#
#@Test
#Scenario: TC07_Verification of Search button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen, Click on Search bar after entering data
#
#@Test
#Scenario: TC08_Verification of Application Configuration button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen Click on Configuration icon button
#
#
#
#@Test
#Scenario: TC09_Verification of Bulk download button functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen Click on Download icon button
#
#@Test
#Scenario: TC010_Verification of displaying the Edit screen in the EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#
#
#@Test
#Scenario: TC012_Verification of Delete functionality in the EDGE Device List screen by Super admin/Admin user (If few devices are not linked with other module)
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button
#Then confirmation message appear on the Screen for deletion with option Yes or No
#
#@Test
#Scenario: TC013_Verification of tooltip functionality for Edit icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then After landing on EDGE Device List screen And Mousehover on EDIT icon button
#
#@Test
#Scenario:  TC014_Verification of tooltip functionality for Delete icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Click on Status Three Dot
#And Choose inactive mode from status column
#Then After landing on EDGE Device List screen And Mousehover on DELETE icon button
#
#@Test
#Scenario: TC015_Verification of tooltip functionality for View Alert(s) icon in Actions column of the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then After landing on EDGE Device List screen and Mousehover on View ALERTS icon button
#
#@Test  
#Scenario: TC016_Verification of reduction in the number of records in pagination section of EDGE details screen
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination it will display default records will display 
#
#@Test
#Scenario: TC017_Verification of changing the items per page functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination it will display default records will display 
#
#@Test
#Scenario: TC018_Verification of displaying the items per page by default i.e. 25 per page in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination it will display default records will display 
#
#@Test
#Scenario: TC019_Verification of displaying the total number of records with pagination icons in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And check pagination per page
#
#@Test
#Scenario: TC020_Verification of displaying the First page (Full Backward arrow) button in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination to check functionality of Full Backward arrow Edgedevice
#
#@Test
#Scenario: TC021_Verification of displaying the Last page (Full Forward arrow) button in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination to check functionality of Full forward arrow 
#
#@Test
#Scenario: TC022_Verification of displaying the Next page (Forward arrow button in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination to check Next button(Forward arrow) functionality
#
#@Test
#Scenario: TC023_Verification of displaying the Previous page (Backward arrow button in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on pagination to check Previous Page button(Backward arrow) functionality EdgeDevice
#
#@Test
#Scenario: TC024_Verification of the search functionality for EDGE ID column in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field
#
#@Test
#Scenario: TC025_Verification of the search functionality for EDGE Group Name column (Valid Group Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field
#
#@Test
#Scenario: TC026_Verification of the search functionality for EDGE Group Name column (Invalid Group Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group name search icon i.e. three dots & enter Valid inputs into search text field
#
#@Test
#Scenario: TC027_Verification of the search functionality for EDGE Name column (Valid Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Name search icon i.e. three dots & enter Valid inputs into search text field.
#
#@Test
#Scenario: TC028_Verification of the search functionality for App Group column (Valid App Group) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar 
#And Click on APP Group name search icon
#Then enter value for App Group name
#
#@Test
#Scenario: TC029_Verification of the search functionality for Hardware Name (Valid HardWare Name) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And Click on HardWare Name Dots
#Then enter value for HardWare Name
#
#@Test
#Scenario: TC030_Verification of the search functionality for Health status column (Valid Health status entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar 
#
#
#@Test
#Scenario: TC031_Verification of the search functionality for Communication status column (Valid Communication status entry) in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar 
#
#@Test
#Scenario: TC032_Verification of the change in colour of three dots for all columns in the EDGE Device List screen by Super admin/Admin user when search filter is applied
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#
#@Test
#Scenario: TC033_Verification of the display of search bar and text for all columns in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Enter valid inputs as per required from table details into search text field and enter backspace & click on enter
#
#@Test
#Scenario: TC034_Verification of the removal of search results and text for all columns in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Enter valid inputs as per required from table details into search text field and enter backspace & click on enter
#
#
#@Test
#Scenario: TC035_Verification of the search functionality for overall table in the EDGE Device screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Enter valid inputs as per required from table details into search text field and enter backspace & click on enter
#
#@Test
#Scenario: TC036_Verification of blank value rejections in available fields of Identity section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC037_Verification of blank value rejections in available fields of Health section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#And scroll horizontal to see status column
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC038_Verification of blank value rejections in available fields of Registration & Licence sections in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC039_Verification of blank value rejections in available fields of Deployment section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then without enter any values
#Then scroll down
#Then click on save
#
#@Test
#Scenario: TC040_Verification of redirection functionality for Cancel icon in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button icon on the top right side & landed on EDGE>ADD Screen
#Then click on cancel button in EDGE>ADD screen
#
#@Test
#Scenario: TC041_Verification of the search functionality in the EDGE Device Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then search for Edge ID enter the value for Edge ID and Clear Search
#Then search for Edge Name enter the value for Edge Name and Clear Search
#Then search for Edge Group Name enter the value for Edge Group Name and Clear Search
#Then search for App Groups enter the value for App Groups and Clear Search
#Then search for Hardware Name enter the value for HardWare Name and Clear Search
#
#@Test
#Scenario: TC043_Verification of the acceptance of Numeric values in EDGE ID Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Enter numeric values to check character strength into EDGE ID text fields
#
#@Test
#Scenario: TC044_Verification of the acceptance of Alphanumeric and special characters values in EDGE Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Enter numeric values to check character strength into EDGE NAME text fields
#
#
#@Test
#Scenario: TC045_Verification of breaching the Max character limit in EDGE ID Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And Enter numeric values to check character strength into EDGE ID text fields
#
#@Test
#Scenario: TC046_Verification of breaching the Max character limit in EDGE  Name Text field in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then Enter numeric values to check character strength into EDGE NAME text fields
#
#@Test
#Scenario: TC047_Verification of selection of the from organization drop down in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#Then select options from Organization drop down
#
#@Test
#Scenario: TC048_Verification of selection of the from EDGE Group Name drop down in the Identity section of User Add screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And select options from EDGE Group Name drop down
#
#@Test
#Scenario: TC049_Verification of upload of onboarding cerificates in Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Scroll down page go to the registration section of add screen and enter value for onboarding certificate
#
#@Test	
#Scenario: TC050_Verification of download of onboarding cerificates in Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Scroll down page go to the registration section of add screen and enter value for onboarding certificate
#
#
#@Test
#Scenario: TC051_Verification of upload of onboarding configuration file in Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Scroll down page go to the registration section of add screen and enter value for onboarding certificate
#
#@Test
#Scenario: TC052_Verification of download of onboarding configuration file in Registration section in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Scroll down page go to the registration section of add screen and enter value for onboarding certificate
#
#@Test
#Scenario: TC053_Verification of modify the value in available mandatory fields of Identity section in EDIT screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then modify the value of mandatory field of Identity Section
#
#@Test
#Scenario: TC054_Verification of modify value in available optional text fields of Identity section in EDIT screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then modify the value of optional field of Identity section
#
#@Test
#Scenario: TC055_Verification of breaching the Max character limit in EDGE ID Text field in the Identity section of User EDIT Screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Enter numeric values to check character strength into EDGE Name text fields of Edit Section
#
#@Test
#Scenario: TC056_Verification of breaching the Max character limit in EDGE NameText field in the Identity section of User EDIT Screen by Super admin/Admin user
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Enter numeric values to check character strength into EDGE Name text fields of Edit Section
#
#@Test
#Scenario: TC057_Verification of Viewing of all the steppers & select the application to deploy application in Individual EDGE Device module by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#
#
#
#@Test
#Scenario: TC058_Verification of multiple select of the Active Application for deploy of EDGE module by Super admin/Admin user and Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select
#
#
#@Test
#Scenario: TC059_Verification of Single select of the Active Application for deploy of EDGE module by Super admin/Admin user  & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select choice
#Then Verify deployment functionality
#
#
#@Test
#Scenario: TC060_Verification of Viewing of all the steppers & select the application configuration on EDGE Device Module by Super admin/Admin user & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#When Click on configuration icon button from Action column
#
#
#@Test
#Scenario: TC061_Verification of select the Active Application group for  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on configuration icon button from Action columnn
#Then verify application functionality for configuration
#
#
#@Test
#Scenario: TC062_Verification of select the Active Single EDGE in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then verify Active Single Edge
#
#
#
#@Test
#Scenario: TC063_Verification of select the Active multiple EDGE  for  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then verify Active Single Edge
#Then Check SelectAll checkbox from select column
#
#
#@Test
#Scenario: TC064_Verification of select the Active Single Application in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then verify Active Single Edge
#
#
#
#@Test
#Scenario: TC65_Verification of user not select the undeployed Application in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#
#@Test
#Scenario: TC66_Verification of select the application configuration in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on deployment icon button from Action columnn
#Then verify Active Single Edge
#
#
#@Test
#Scenario: TC067_Verification of creation of new configuration in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on configuration icon button from Action columnn
#Then verify application functionality for configuration
#Then click on add icon to add configuration
#
#@Test
#Scenario: TC068_Verification of user cannot deploy the configuration without confirmation  in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select
#Then verify deploy button should be in inactive mode and become active when user click on Confirm button 
#
#@Test
#Scenario: TC069_Verification of all deployed configuration are available in configuration list in  EDGE Device App configuration by Super admin/Admin & Operator users
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then Click on Deploy apps button on the Actions column & landed on EDGE>Application Deployment screen
#Then verify application functionality for single select
#Then Verify deployment functionality
#Then Click on Configurations module from left navigation bar
#
#
#
#@Test
#Scenario: TC070_To verify that user is able to map well which is searched using Well Name
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of well and search for Well Name
#Then Enter the value for Well name 
#
#
#@Test
#Scenario: TC071_To verify that user is able to map well which is searched using IP Address
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of IPAddress and search for IPAddress
#Then Enter the value for IPAddress 
#
#@Test
#Scenario: TC072_To verify that user is able to map well which is searched using RTU Address
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress 
#
#@Test
#Scenario: TC073_To verify that user is able to map well which is searched using Device type
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of DeviceType
#Then Enter the value for DeviceType 
#
#
#@Test
#Scenario: TC074_To verify that user is able to map well by applying filter on the RTU Address
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#Then Check the checkbox to well map
#Then Click on Save button For Well
#
#
#@Test
#Scenario: TC075_To verify that user is able to map well in 'Active' status by applying filter on the Status column
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on Status Three Dot and Select the Active status Checkbox
#
#
#@Test
#Scenario: TC076_To verify that user is able to map well having 'Active' and 'Inactive' Status
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on Status Three Dot and Select the Active status Checkbox
#Then Click on Status Three Dot and Select the inActive status Checkbox
#
#@Test
#Scenario: TC077_To verify that user is able to map well having 'Inactive' Status
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on Status Three Dot and Select InActive Status Checkbox
#
#@Test
#Scenario: TC078_To verify that user is able to map multiple wells at a time
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#Then Check the checkbox to well map
#Then Click on Save button For Well
#
#
#
#@Test
#Scenario: TC079_To verify that user is able to map multiple wells from each page at a time and observe that they appear at the top of the list once mapping is done
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of RTUAddress
#Then Enter the value for RTUAddress
#Then Check the checkbox to well map
#Then Click on Save button For Well
#
#
#
#@Test  
#Scenario: TC080_To verify that a newly created well appears in the Well Mapping list and the user is able to map it to the Edge Device
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on Setting tab from left side bar and click on well tab from Navigation menu 
#Then Click on Add button to add new well
#Then Enter the details for Well Name , Port Number , IP Address and choose the Device Type
#Then Click on Save button To Save Well
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field to check well
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Well mapping tab module
#Then Click on the three dots of well and search for Well Name
#Then Enter the value for Well name to map setting from well module
#
#@Test
#Scenario: TC081_Verification of Environmental variable Add inactive Functionality
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Deployments tab
#And Click on Environment Variable
#And Click on Add new button
#And Enter details for Config Name and Config Value
#And inactivate environmental variable
#Then Click on save button for environmental variable
#
#
#@Test
#Scenario: TC082_Verification of Environmental variable Add Functionality
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Deployments tab
#And Click on Environment Variable
#And Click on Add new button
#And Enter details for Config Name and Config Value
#Then Click on save button for environmental variable
#
#@Test
#Scenario: TC083_Verification of Environmental variable delete Functionality
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#Then Click on Deployments tab
#And Click on Environment Variable
#And Click on search icon of configName Config value
#And Click on Delete button
#
#@Test
#Scenario: TC084_Verification of Environmental variable search Functionality
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Deployments tab
#And Click on Environment Variable
#And Click on search icon of configName Config value 
#
#@Test
#Scenario: TC085_Viewing of Well Map Tab from Edge Device Search
#Given User launch application in chrome browser
#And user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on EDGE Id field search icon i.e. three dots & enter Valid inputs into search text field.
#Then After landing on EDGE Device List screen scroll horizontal and Click on EDIT icon button
#And Click on Deployments tab
#And Click on Environment Variable
#And Click on Add new button of Environmental variable
#And Enter details for Config Name and Config Value
#Then Click on save button for environmental variable
#And Click on Device Log Tab
#And Click on Configuration submodule
#And Click on Well Mapping Tab
#
#
#
#@Test
#Scenario: TC086_Verification of displaying the Bulk Upload button icon on top right side of EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on bulk upload button for Edge Device
#
#
#
#@Test
#Scenario: TC087_Verification of displaying the Bulk download button icon on top right side of EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click and Verify Bulk Download button is working
#
#
#@Test
#Scenario: TC088_Verification of displaying the Bulk Application Configuration button on top right side of EDGE Device List screen
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click and Verify Bulk Application Configuration button is working
#
#@Test
#Scenario: T0C89_Verification of Application Configuration button functionality from Actions Column
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#Then Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal
#Then After landing on EDGE Device List screen Click on Configuration icon from the column of edge List page
#
#
#
#@Test
#Scenario: TC042_Verification of entry of valid data for all the text fields (Mandatory & Optional) in Add screen of EDGE Device module by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And After landing on EDGE Device List screen
#Then Click on ADD New button on the top right side & landed on EDGE>ADD Screen
#And enter valid values for all text fields
#Then click on save button to add Edge
#
#
#@Test
#Scenario: TC081_Verification of Update functionality in the EDGE Device List screen by Super admin/Admin user
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List please scroll horizontal and Click on Edit icon button
#Then update Edge Name, location, Description , Assigned To from Identity section 
#Then scroll down
#Then update the value of Serial Number, OnboardingKey, ImageVersion from the Registration accordion
#Then update the value of Server Port from the deployment
#Then select the value for App Group from the deployment
#Then Click on Save button to update edge
#
#@Test
#Scenario: TC011_Verification of Delete functionality in the EDGE Device List screen by Super admin/Admin user (If few devices are interlinked with other module)
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then Click on EDGE Device module from side menu bar
#And scroll horizontal to see status column
#Then Click on Status Three Dot
#And Choose inactive mode from status column
#Then Click on EDGE Group ID search icon i.e. three dots & enter Valid inputs into search text field
#Then After landing on EDGE Device List screen scroll horizontal and Click on DELETE icon button
#Then confirmation message appear on the Screen for deletion with option Yes or No