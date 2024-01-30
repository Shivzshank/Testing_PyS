package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupervisorsManagementPage {

	WebDriver driver;
	public SupervisorsManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Supervisors Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Shop Name']")
	private WebElement ShopNameField;
	public WebElement getShopNameField() {
	return ShopNameField;
	}
	@FindBy(xpath = "//input[@id='City']")
	private WebElement CityField;
	public WebElement getCityField() {
	return CityField;
	}
	@FindBy(xpath = "//input[@id='Area']")
	private WebElement AreaField;
	public WebElement getAreaField() {
	return AreaField;
	}
	@FindBy(xpath = "//a[contains(text(),'Logesh Badminton')]")
	private WebElement LogeshBadmintonVendor;
	public WebElement getLogeshBadmintonVendor() {
	return LogeshBadmintonVendor;
	}
	@FindBy(xpath = "//input[@id='Supervisor Name']")
	private WebElement SupervisorName;
	public WebElement getSupervisorName() {
	return SupervisorName;
	}
	@FindBy(xpath = "//input[@id='Supervisor Email Id']")
	private WebElement SupervisorEmailId;
	public WebElement getSupervisorEmailId() {
	return SupervisorEmailId;
	}
	@FindBy(xpath = "//input[@id='Contact Number']")
	private WebElement SupervisorContactNumber;
	public WebElement getSupervisorContactNumber() {
	return SupervisorContactNumber;
	}
	@FindBy(xpath = "//p[contains(text(),'Create supervisor')]")
	private WebElement CreateSupervisorButton;
	public WebElement getCreateSupervisorButton() {
	return CreateSupervisorButton;
	}
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement CloseButton;
	public WebElement getCloseButton() {
	return CloseButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//View Supervisors Xpath.	
////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	private WebElement ActivateOrDeactivateSupervisorButton;
	public WebElement getActivateOrDeactivateSupervisorButton() {
	return ActivateOrDeactivateSupervisorButton;
	}
	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	private WebElement ConfirmButton;
	public WebElement getConfirmButton() {
	return ConfirmButton;
	}
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	private WebElement CancelButton;
	public WebElement getCancelButton() {
	return CancelButton;
	}
	@FindBy(xpath = "(//button[contains(@type,'button')])[7]")
	private WebElement FourthSupervisorDeleteButton;
	public WebElement getFourthSupervisorDeleteButton() {
	return FourthSupervisorDeleteButton;
	}
	@FindBy(xpath = "(//span[contains(@class,'css-1k5atgd')])[4]")
	private WebElement FourthSupervisorEditButton;
	public WebElement getFourthSupervisorEditButton() {
	return FourthSupervisorEditButton;
	}
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement NameField;
	public WebElement getNameField() {
	return NameField;
	}
	@FindBy(xpath = "//input[@id='Email ID']")
	private WebElement EmailIdField;
	public WebElement getEmailIdField() {
	return EmailIdField;
	}
	@FindBy(xpath = "//input[@id='Mobile']")
	private WebElement MobileField;
	public WebElement getMobileField() {
	return MobileField;
	}
	@FindBy(xpath = "//p[normalize-space()='Update']")
	private WebElement UpdateButton;
	public WebElement getUpdateButton() {
	return UpdateButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}
