package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class AwesomeGroup__US9__AdminLanguagePageElements extends CommonMethods{

	
	
	@FindBy(id="menu_admin_viewLanguages")
	public WebElement language;
	
	@FindBy(id="btnAdd")
	public WebElement addLanguageButton;
	
	@FindBy(id="language_name")
	public WebElement sendLanguage;
	
	@FindBy(id="btnSave")
	public WebElement saveLanguage;
	
	
	
	public AwesomeGroup__US9__AdminLanguagePageElements () {
		PageFactory.initElements(driver, this);
	}
}
