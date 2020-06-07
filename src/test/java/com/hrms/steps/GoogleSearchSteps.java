package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * Jun 06, 2020 12:41:19 AM cucumber.api.cli.Main run
WARNING: You are using deprecated Main class. Please use io.cucumber.core.cli.Main
Jun 06, 2020 12:41:19 AM io.cucumber.core.cli.Main run
WARNING: By default Cucumber is running in --non-strict mode.
This default will change to --strict and --non-strict will be removed.
You can use --strict to suppress this warning

Scenario: Search google by typing    # src/test/resources/features/GoogleSeacrh.feature:3
  Given I open the browser           # null
  And I navigate to google home page # null
  When I type any searcheable item   # null
  And I hit enter                    # null
  Then I see search results          # null

Undefined scenarios:
file:///C:/Users/gulen/eclipse-workspace/HrmsCucumberFramework/src/test/resources/features/GoogleSeacrh.feature:3# Search google by typing

1 Scenarios (1 undefined)
5 Steps (5 undefined)
0m0.272s


You can implement missing steps with the snippets below:

@Given("I open the browser")
public void i_open_the_browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I navigate to google home page")
public void i_navigate_to_google_home_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I type any searcheable item")
public void i_type_any_searcheable_item() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I hit enter")
public void i_hit_enter() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("I see search results")
public void i_see_search_results() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


 */
public class GoogleSearchSteps extends CommonMethods{
	@Given("I open the browser")
	public void i_open_the_browser() {
	  setUp() ;
	}

	@Given("I navigate to google home page")
	public void i_navigate_to_google_home_page() {
	    
	}

	@When("I type any searcheable item")
	public void i_type_any_searcheable_item() {
	    
	}

	@When("I hit enter")
	public void i_hit_enter() {
	    
	}

	@Then("I see search results")
	public void i_see_search_results() {
	    
	}



}
