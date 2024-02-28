@SheetCERTIFICATES

Feature: CERTIFICATES

#@Test
#Scenario: TC01_Verification of Browser Compatibility of certificates module of the application
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#
#@Test
#Scenario: TC02_Verification of resizing the Certificates as per different zoom levels
#Given User launch application in chrome browser
#When user enters credentials and click on login button
#Then verify page with resize option for the certificate page

@Test
Scenario: TC03_Verification of selection of certificate type "Server TLS"
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server LTs from certicate dropdown


@Test
Scenario: TC04_Verification of selection of certificate type "Onboarding"
Given User launch application in chrome browser
When user enters credentials and click on login button
Then Click on Settings module from side menu bar
Then Click on Certificate tab from right panel of the screen
Then choose option Server onboarding from certicate dropdown




