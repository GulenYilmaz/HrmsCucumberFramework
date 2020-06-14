package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLanguageEmployeeSteps extends CommonMethods{
	
	
	
	@When("user navigate to viewEmployeeList")
	public void user_navigates_to_viewEmployeeList() {
		jsClick(dashboard.PIM);
		wait(2);
	}
	@When("user searches for {string} and clicks on Search button")
	public void user_searches_for_and_clicks_on_Search_button(String EmpName) {
	  	sendText(viewEmp.empName, EmpName);
		viewEmp.searchBtn.click();
	}
	@When("user clicks on Avesome Jr QA Testers and click on Qualifications")
	public void user_clicks_on_Awesome_Jr_QA_Testers_and_clicks_on_Memberships() {
	  viewEmp.awesome.click();
	  viewEmp.qualification.click();
	}

	@Then("user clicks on add language button")
	public void user_clicks_on_add_language_button() {
	   jsClick(viewEmp.languageADD);
	}

	@Then("user select {string} , select {string} and {string}")
	public void user_select_select_and(String languages, String fluency, String compet) {
	   
    selectDdValue(viewEmp.selectLanguage, languages);
	selectDdValue(viewEmp.selectFluency, fluency);	
	selectDdValue(viewEmp.selectCompetency, compet);	
		
		
	}

	@Then("user clicks on save button")
	public void user_clicks_on_save_button() {
	   viewEmp.saveSelect.click();
	}
}
