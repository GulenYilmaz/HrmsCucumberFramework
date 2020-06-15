//package com.hrms.steps;
//
//public class AwesomeGroup__US5__H__Steps {
//public class AddEmployeeSkillsSteps extends CommonMethods{
//		
//		@Given("user logged in to hrms")
//		public void user_logged_in_to_hrms() {
//		 sendText(login.username, ConfigsReader.getProperty("username"));
//		 sendText(login.password, ConfigsReader.getProperty("password"));
//		 click(login.loginBtn);
//		}
//		
//		@When("user click on Admin")
//		public void user_click_on_Admin() {
//			click(dashboard.Admin);
//		  }
//		@When("user click on Qualification option")
//		public void user_click_on_Qualification_option() {
//			click(dashboard.Qalifications);
//		}
//		@When("user choose option {string} from DDMenu")
//		public void user_choose_option_skills_from_DDMenu(String Skills) {
//		  click(dashboard.Skills);
//		}
//		@When("user click Add button")
//		public void user_click_Add_button() {
//		  click(dashboard.Add);
//		}
//		@When("user add {string} in textbox")
//		public void user_add_in_textbox(String string) {
//		  sendText(dashboard.textBox, "Teamworking skills");
//		}
//		@Then("click save button")
//		public void click_save_button() {
//		  click(dashboard.saveBtn);
//		}
//}
