package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PysUserManagementPage {

	WebDriver driver;
	public PysUserManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create User xpath's.	
/////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement NameField;
	public WebElement getNameField() {
	return NameField;
	}
	@FindBy(xpath = "//div[@id='Gender']")
	private WebElement GenderFieldDropDown;
	public WebElement getGenderFieldDropDown() {
	return GenderFieldDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Female']")
	private WebElement FemaleButton;
	public WebElement getFemaleButton() {
	return FemaleButton;
	}
	@FindBy(xpath = "//p[@aria-label='Male']")
	private WebElement MaleButton;
	public WebElement getMaleButton() {
	return MaleButton;
	}	
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	private WebElement DateOfBirthIcon;
	public WebElement getDateOfBirthIcon() {
	return DateOfBirthIcon;
	}
	@FindBy(xpath = "//button[contains(text(),'2000')]")
	private WebElement ChoosingYearAs2000;
	public WebElement getChoosingYearAs2000() {
	return ChoosingYearAs2000;
	}	
	@FindBy(xpath = "(//button[contains(text(),'1')])[1]")
	private WebElement ChoosingDayAs1;
	public WebElement getChoosingDayAs1() {
	return ChoosingDayAs1;
	}	
	@FindBy(xpath = "//div[@id='Authority']")
	private WebElement AuthorityDropDown;
	public WebElement getAuthorityDropDown() {
	return AuthorityDropDown;
	}
	@FindBy(xpath = "//li[normalize-space()='ROLE_ADMIN']")
	private WebElement ChoosingRoleAdmin;
	public WebElement getChoosingRoleAdmin() {
	return ChoosingRoleAdmin;
	}		
	@FindBy(xpath = "//li[normalize-space()='ROLE_EXECUTIVE']")
	private WebElement ChoosingRoleExecutive;
	public WebElement getChoosingRoleExecutive() {
	return ChoosingRoleExecutive;
	}	
	@FindBy(xpath = "//li[normalize-space()='ROLE_FINANCE']")
	private WebElement ChoosingRoleFinance;
	public WebElement getChoosingRoleFinance() {
	return ChoosingRoleFinance;
	}		
	@FindBy(xpath = "//li[normalize-space()='ROLE_STAFF']")
	private WebElement ChoosingRoleStaff;
	public WebElement getChoosingRoleStaff() {
	return ChoosingRoleStaff;
	}	
	@FindBy(xpath = "//li[normalize-space()='ROLE_SUPPORT']")
	private WebElement ChoosingRoleSupport;
	public WebElement getChoosingRoleSupport() {
	return ChoosingRoleSupport;
	}	
	
	@FindBy(xpath = "//li[normalize-space()='ROLE_MANAGER']")
	private WebElement ChoosingRoleManager;
	public WebElement getChoosingRoleManager() {
	return ChoosingRoleManager;
	}	
	@FindBy(xpath = "//li[normalize-space()='ROLE_MARKETING']")
	private WebElement ChoosingRoleMarketing;
	public WebElement getChoosingRoleMarketing() {
	return ChoosingRoleMarketing;
	}	
	@FindBy(xpath = "//input[@id='search address']")
	private WebElement AddressField;
	public WebElement getAddressField() {
	return AddressField;
	}
	@FindBy(xpath = "//input[@id='Mobile Number']")
	private WebElement MobileNumberField;
	public WebElement getMobileNumberField() {
	return MobileNumberField;
	}
	@FindBy(xpath = "//input[@id='Email Id']")
	private WebElement EmailIdField;
	public WebElement getEmailIdField() {
	return EmailIdField;
	}
	@FindBy(xpath = "//p[contains(text(),'Save')]")
	private WebElement SaveButton;
	public WebElement getSaveButton() {
	return SaveButton;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////	
	
//View User xpath's.
	@FindBy(xpath = "(//h6[contains(text(),'Test')])[2]")
	private WebElement TestAdminButton;
	public WebElement getTestAdminButton() {
	return TestAdminButton;
	}
	@FindBy(xpath = "(//input[@id = 'fullWidth'])[1]")
	private WebElement UserNameField;
	public WebElement getUserNameField() {
	return UserNameField;
	}
	@FindBy(xpath = "(//input[@id = 'fullWidth'])[2]")
	private WebElement EmailField;
	public WebElement getEmailField() {
	return EmailField;
	}
	@FindBy(xpath = "(//input[@id = 'fullWidth'])[3]")
	private WebElement MobileNoField;
	public WebElement getMobileNoField() {
	return MobileNoField;
	}
	@FindBy(xpath = "//input[@id='User Name']")
	private WebElement UserNameFieldForEdit;
	public WebElement getUserNameFieldForEdit() {
	return UserNameFieldForEdit;
	}
	@FindBy(xpath = "//input[@id='Email ID']")
	private WebElement EmailIdFieldForEdit;
	public WebElement getEmailIdFieldForEdit() {
	return EmailIdFieldForEdit;
	}	
	@FindBy(xpath = "//input[@id='Mobile Number']")
	private WebElement MobileNumberFieldForEdit;
	public WebElement getMobileNumberFieldForEdit() {
	return MobileNumberFieldForEdit;
	}
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement UpdateButtonForEdit;
	public WebElement getUpdateButtonForEdit() {
	return UpdateButtonForEdit;
	}
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement CloseButtonForEdit;
	public WebElement getCloseButtonForEdit() {
	return CloseButtonForEdit;
	}	
	@FindBy(xpath = "//input[@aria-label='controlled']")
	private WebElement UserActivateAndDeactiviateButton;
	public WebElement getUserActivateAndDeactiviateButton() {
	return UserActivateAndDeactiviateButton;
	}
	@FindBy(xpath = "//button[normalize-space()='confirm']")
	private WebElement UserActivateAndDeactiviateConfirmButton;
	public WebElement getUserActivateAndDeactiviateConfirmButton() {
	return UserActivateAndDeactiviateConfirmButton;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
}
