#Author: Gulen Yilmaz gyilmaz@gmail.com
#US10 As an admin user should be able to add any available languages to any employee by specifying
#Language
#Fluency
#Competency
Feature: Add Language to Employee

  Background: 

  @US10
  Scenario: Add Language to Employee
    Given user is logged with valid admin credentials
    When user navigate to viewEmployeeList
    And user searches for "Awesome Jr QA Testers" and clicks on Search button 
    And user clicks on Avesome Jr QA Testers and click on Qualifications
    Then user clicks on add language button
    And user select "Turkcee" , select "Speaking" and "Basic"
    Then user clicks on save button
    And user language is added succesfully
