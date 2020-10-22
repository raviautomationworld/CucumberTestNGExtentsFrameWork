@regression
Feature: User login functionality

@userlogin
Scenario: verify header, center and footer text on login page

Given user naviaged to login page
Then verify header and center and footer text on login page

@userlogin
Scenario: verify user loggging with invalide credentials

Given user naviaged to login page
When user enter <username> and <password>
And user click on login button
Then verify text mes


@userlogin
Scenario: verify the clear text for user and password fields

Given user naviaged to login page
When user enter <username> and <password>
Then user click on login button