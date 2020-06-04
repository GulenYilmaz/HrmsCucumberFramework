Feature: mployee Search

Scenario: Search employee by id
Given user is navigated to HRMS
And user is logged in with valid admin credentials
And user navigate to employee list page
When user enters valid employee id
And click search button 
Then user see employee information is displayed

Scenario: Search employee by name
Given user is navigated to HRMS
And user is logged in with valid admin credentials
And user navigate to employee list page
When user enters valid employee name and last name
And click search button 
Then user see employee information is displayed


