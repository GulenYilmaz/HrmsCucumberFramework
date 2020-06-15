//package com.hrms.pages;
//
//public class AwesomeGroup__US8__PageElements {
//	package com.hrms.pages;
//
//	import java.util.List;
//
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.support.FindBy;
//	import org.openqa.selenium.support.PageFactory;
//
//	import com.hrms.utils.CommonMethods;
//
//	public class QualificationsPageElements extends CommonMethods {
//
//	        @FindBy(xpath = "(//a[text()='Qualifications'])[2]")
//	        public WebElement qualLink;
//
//	        @FindBy(id = "addLicense")
//	        public WebElement addLicenseBtn;
//
//	        @FindBy(id = "license_code")
//	        public WebElement licenceDD;
//
//	        @FindBy(id = "license_license_no")
//	        public WebElement licenceNumber;
//
//	        @FindBy(id = "license_date")
//	        public WebElement licenceIssueDate;
//
//	        @FindBy(id = "license_renewal_date")
//	        public WebElement licenceExpiryDate;
//
//	        @FindBy(id = "btnLicenseSave")
//	        public WebElement saveBtn;
//	        
//	        @FindBy(xpath = "//form[@id='frmDelLicense']//table//tr//td")
//	        public List<WebElement> licenceList;
//	        
//	        
//	        
//
//	        public QualificationsPageElements() {
//	                PageFactory.initElements(driver, this);
//	        }
//
//	}
//
//}
