#Author: Mehmet UNLU munlu2008@gmail.com
#@ATsprint01 @AddContactDetails
#Feature: Add Contact Details
 # Background: Navigate to employee contact details
 #   Given user is logged with valid admin credentials
 #   And user navigates to EmployeeListPage
 #   When user enters employee name as "Awesome Jr QA Testers" and empId as "14211"
 #   And click on search button
 #   Then user click employee id link
 #
 # Scenario Outline: Change employee contact details
 #   Given user click contact details and edit button
 #   And user enters address as "<Adress1>" "<Adress2>" "<City>" "<State>" "<Zip>" "<Country>"
 #   And user enters phone numbers as "<HomePhone>" "<Mobile>" "<WorkPhone>"
 #   And user enters emails as "<WorkEmail>" "<OtherEmail>"
 #
 #  Then user can see employee name as "Awesome Jr QA Testers"
 #  Examples:
 #   | Adress1        | Adress2 | City   | State | Zip   | Country | HomePhone  | Mobile     | WorkPhone  | WorkEmail           | OtherEmail          |
 #   | 7700 Cody Lane |    3534 | Sachse | TX    | 75048 | USA     | 4699547112 | 4699547112 | 4699547112 | munlu@gmail.com | munlu2@gmail.com |
