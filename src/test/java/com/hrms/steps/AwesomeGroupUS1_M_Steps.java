package com.hrms.steps;

//
//	import org.junit.Assert;
//	import org.openqa.selenium.support.ui.Select;
//	import com.hrms.utils.CommonMethods;
//	import io.cucumber.java.en.Given;
//	import io.cucumber.java.en.Then;
//	import io.cucumber.java.en.When;
//	public class AwesomeGroupUS1_M_Steps  extends CommonMethods{
//		
//		@Given("user navigates to EmployeeListPage")
//		public void user_navigates_to_EmployeeListPage() {
//			
//			jsClick(dashboard.PIM);
//			jsClick(dashboard.empListPage);
//		  
//		}
//		
//		@When("user enters employee name as {string} and empId as {string}")
//		public void user_search_employee_name_as_and_see_personal_details_page(String empName, String empId) {
//		   sendText(viewEmp.empName, empName);
//		   sendText(viewEmp.empID,empId);
//		}
//		
//		@Then("user click employee id link")
//		public void user_click_employee_name_link() {
//			jsClick(viewEmp.checkBox);
//			jsClick(viewEmp.idLink);
//			wait(2);
//		}
//		@Given("user click contact details and edit button")
//		public void user_can_see_personals_details_page_and_click_edit_button() {
//			jsClick(pdetails.contactDetails);
//		    jsClick(pdetails.editBtn);
//		}
//		@Given("user enters address as {string} {string} {string} {string} {string} {string}")
//		public void user_enters_address_as(String address1, String address2, String city, String state, String zip, String country) {
//		   sendText(cdetails.address1, address1);
//		   sendText(cdetails.address2, address2);
//		   sendText(cdetails.city, city);
//		  
//		   Select selectState=new Select(cdetails.stateDD);
//		   selectState.selectByValue("TX");
//		   sendText(cdetails.zipCode, zip);
//		   Select selectCountry=new Select(cdetails.countryDD);
//		   selectCountry.selectByValue("US");
//		}
//		@Given("user enters phone numbers as {string} {string} {string}")
//		public void user_enters_phone_numbers_as(String homePhone, String mobile, String workPhone) {
//		    sendText(cdetails.homePhone,homePhone);
//		    sendText(cdetails.mobilePhone,mobile);
//		    sendText(cdetails.workPhone,workPhone);
//		}
//		@Given("user enters emails as {string} {string}")
//		public void user_enters_emails_as(String workEmail, String otherEmail) {
//			 sendText(cdetails.workEmail,workEmail);
//			 sendText(cdetails.otherEmail,otherEmail);
//		}
//		@When("user click save button")
//		public void user_click_save_button() {
//			click(cdetails.saveBt);
//			wait(2);
//		   
//		}
//		@Then("user can see employee name as {string}")
//		public void user_can_see_modified_contact_details(String expectedname) {
//			String expected=expectedname;
//			String actual=cdetails.modifiedName.getText();
//			System.out.println(expected+" -- "+actual);
//			Assert.assertEquals("Employee names are not match",expected,actual);
//		}
//		
//
//}
