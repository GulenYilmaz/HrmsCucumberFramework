package com.hrms.steps;
import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeSearchSteps extends CommonMethods{
	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
	  setUp();
	}

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	  click(login.loginBtn);
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
	    jsClick(dashboard.PIM);
	    jsClick(dashboard.empListPage);
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	    sendText(viewEmp.empID, "10079");
	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(viewEmp.searchBtn);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		String actualEmpID="10079";
		String expectedEmpId=viewEmp.empIDValidation.getText();
		Assert.assertEquals("Employee IDs do not Match", actualEmpID, expectedEmpId);
		wait(3);
		tearDown();
	}
	@When("user enters valid employee name")
	public void user_enters_valid_employee_name1() {
		sendText(viewEmp.empName, "Bishnu1");
	}
	@Then("user see employee name is displayed")
	public void user_see_employee_information_is_displayed1() {
		String actualEmpName="Bishnu1";
		String expectedEmpName=viewEmp.empNameValidation.getText();
		Assert.assertEquals("Employee names do not Match", actualEmpName, expectedEmpName);
		wait(3);
		tearDown();
	
	}
	
	
	
	
	
	
	
	
	
	
	
/*
 * Console print
 * 
 * Jun 04, 2020 12:46:12 PM cucumber.api.cli.Main run
WARNING: You are using deprecated Main class. Please use io.cucumber.core.cli.Main
Jun 04, 2020 12:46:12 PM io.cucumber.core.cli.Main run
WARNING: By default Cucumber is running in --non-strict mode.
This default will change to --strict and --non-strict will be removed.
You can use --strict to suppress this warning

Scenario: Search employee by Id                                    # src/test/resources/features/SearchEmployee.feature:2
  Given user is navigated to HRMS                                  # null
  And user logins with valid admin credentials to HRMS application # null
  And user navigates to EmployeeList page                          # null
  When user enters valid employee ID                               # null
  And user clicks on the search button                             # null
  Then user see employee information is displayed                  # null

Scenario: Search employee by name                                  # src/test/resources/features/SearchEmployee.feature:10
  Given user is navigated to HRMS                                  # null
  And user logins with valid admin credentials to HRMS application # null
  And user navigates to EmployeeList page                          # null
  When user enters valid employee name                             # null
  And user clicks on the search button                             # null
  Then user see employee information is displayed                  # null

Undefined scenarios:
file:///C:/Users/gulen/eclipse-workspace/HrmsCucumberFramework/src/test/resources/features/SearchEmployee.feature:2# Search employee by Id
file:///C:/Users/gulen/eclipse-workspace/HrmsCucumberFramework/src/test/resources/features/SearchEmployee.feature:10# Search employee by name

2 Scenarios (2 undefined)
12 Steps (12 undefined)
0m0.231s


You can implement missing steps with the snippets below:

@Given("user is navigated to HRMS")
public void user_is_navigated_to_HRMS() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("user logins with valid admin credentials to HRMS application")
public void user_logins_with_valid_admin_credentials_to_HRMS_application() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("user navigates to EmployeeList page")
public void user_navigates_to_EmployeeList_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enters valid employee ID")
public void user_enters_valid_employee_ID() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user clicks on the search button")
public void user_clicks_on_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user see employee information is displayed")
public void user_see_employee_information_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enters valid employee name")
public void user_enters_valid_employee_name() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



 * 
 */
	
}