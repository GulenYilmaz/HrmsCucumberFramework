package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLanguageSteps extends CommonMethods {
	@When("user navigate to language page")
	public void user_navigate_to_language_page() {
		dashboard.adminBtn.click();
		wait(2);
		dashboard.qualification.click();
		wait(2);
		language.language.click();
		wait(2);
	}

	@When("user click on add button")
	public void user_click_on_add_button() {
		language.addLanguageButton.click();
		wait(2);
		
	}

	@When("user sends {string} to language")
	public void user_sends_to_language(String lang) {
		sendText(language.sendLanguage, lang);
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		language.saveLanguage.click();
	}
}
