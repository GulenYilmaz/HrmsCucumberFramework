package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class AdminLanguagePageSteps extends CommonMethods{

	
	
	@FindBy(id="menu_admin_viewLanguages")
	public WebElement language;
	
	@FindBy(id="btnAdd")
	public WebElement addLanguageButton;
	
	@FindBy(id="language_name")
	public WebElement sendLanguage;
	
	@FindBy(id="btnSave")
	public WebElement saveLanguage;
	
	
	
	public AdminLanguagePageSteps () {
		PageFactory.initElements(driver, this);
	}
}
