//package com.hrms.steps;
//
//public class AwesomeGroup__US7__AB__Steps {
//	package com.hrms.steps;
//
//	import java.util.List;
//
//	import org.junit.Assert;
//	import org.openqa.selenium.WebElement;
//
//	import com.hrms.utils.CommonMethods;
//
//	import io.cucumber.java.en.Given;
//	import io.cucumber.java.en.Then;
//	import io.cucumber.java.en.When;
//
//
//	public class EditEmployeeDetailsSteps extends CommonMethods{
//	        
//	        
//	        @Given("user navigates to ViewLicences page")
//	        public void user_navigates_to_ViewLicences_page() {
//	           jsClick(dashboard.Admin_MainMenu);
//	           jsClick(dashboard.Admin_Qualifications);
//	           jsClick(dashboard.Admin_Licences);
//	        }
//
//	        @When("user adds a new licence type {string}")
//	        public void user_adds_a_new_licence_type(String licenseName) {
//	                  click(AdminLicences.btnAdd);   
//	                sendText(AdminLicences.licenseName, licenseName);
//	        }
//
//	        @When("clicks on save button")
//	        public void clicks_on_save_button() {
//	            click(AdminLicences.btnSave);
//	        }
//
//	        
//	        
//	        @Then("the new licence type {string} is added to the licence list successfully")
//	        public void the_new_licence_type_is_added_to_the_licence_list_successfully(String licenseName) {
//	                boolean flag= false;
//	                for(WebElement el: AdminLicences.licensesList ) {
//	                        if (el.getText().equals(licenseName)) {
//	                                flag=true;
//	                        }
//	                }
//	                System.out.println("Licence found in the list :"+flag);
//	                Assert.assertTrue(flag);
//	        }
//
//	        
//}
