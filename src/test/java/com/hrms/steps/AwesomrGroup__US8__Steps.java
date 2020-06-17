//package com.hrms.steps;
//
//public class AwesomrGroup__US8__Steps {
//	package com.hrms.steps;
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
//	public class EditEmployeeQualificationsSteps extends CommonMethods {
//
//	        @Given("user navigates to Employee List page")
//	        public void user_navigates_to_Employee_List_page() {
//	                jsClick(dashboard.PIM_MainMenu);
//	                jsClick(dashboard.PIM_Employee_List);
//	        }
//
//	        @Given("user searches and locates the employee ID {string}")
//	        public void user_searches_and_locates_the_employee_ID(String empID) {
//	                sendText(PIMViewEmployee.empId, empID);
//	                wait(1);
//	                click(PIMViewEmployee.searchBtn);
//	                wait(1);
//	                System.out.println(PIMViewEmployee.resultId);
//	                Assert.assertEquals("ID could not be located", empID, PIMViewEmployee.resultId.getText());
//
//	        }
//
//	        @Given("user clicks on the employee")
//	        public void user_clicks_on_the_employee() {
//	                click(PIMViewEmployee.resultId);
//	                wait(1);
//	        }
//
//	        @Given("user clicks on qualifications")
//	        public void user_clicks_on_qualifications() {
//	                jsClick(qualifications.qualLink);
//	        }
//
//	        @When("user clicks on Add licence button")
//	        public void user_clicks_on_Add_licence_button() {
//	                jsClick(qualifications.addLicenseBtn);
//	        }
//
//	        @When("user selects the Licence Tyoe from the DD menu {string}")
//	        public void user_selects_the_Licence_Tyoe_from_the_DD_menu(String licenseName) {
//	                selectDdValue(qualifications.licenceDD, licenseName);
//	        }
//
//	        @When("user enters a Licence Number {string}")
//	        public void user_enters_a_Licence_Number(String licenseNo) {
//	                sendText(qualifications.licenceNumber, licenseNo);
//	        }
//
//	        @When("user enters a Issued Date {string}")
//	        public void user_enters_a_Issued_Date(String issueDate) {
//	                sendText(qualifications.licenceIssueDate, issueDate);
//	        }
//
//	        @When("user enters a Expiry Date {string}")
//	        public void user_enters_a_Expiry_Date(String expiryDate) {
//	                sendText(qualifications.licenceExpiryDate, expiryDate);
//	        }
//
//	        @When("clicks on save button on Employee Qualification Page")
//	        public void clicks_on_save_button_on_Employee_Qualification_Page() {
//	                click(qualifications.saveBtn);
//	                wait(3);
//	        }
//
//	        @Then("the license {string} should be added for the employee")
//	        public void the_license_should_be_added_for_the_employee(String licenseName) {
//	                boolean flag = false;
//	                for (WebElement el : qualifications.licenceList) {
//	                        if (el.getText().equals(licenseName)) {
//	                                System.out.println("CONFIRMED");
//	                                flag = true;
//	                                break;
//	                        }
//	                }
//
//	                Assert.assertTrue(flag);
//	        }
//
//	}
//
//}
