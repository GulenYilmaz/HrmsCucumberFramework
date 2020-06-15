#Author:Gulen Yilmaz
#US9 As an admin user should be able to add differentlanguages in qualifications

Feature: Add Language 



  @US9
  Scenario: Add Language
    Given user is logged with valid admin credentials
    When user navigate to language page
    And user click on add button
    And user sends "Turkcee" to language
    Then user click on save button
    And user added language succesfully
   

  