package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPaymentsPage {

	WebDriver driver;
	public VendorPaymentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Payment Due Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "(//button[contains(@type,'button')])[4]")
	private WebElement FromDateIcon;
	public WebElement getFromDateIcon() {
	return FromDateIcon;
	}
	@FindBy(xpath = "(//button[contains(@type,'button')])[5]")
	private WebElement ToDateIcon;
	public WebElement getToDateIcon() {
	return ToDateIcon;
	}
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement PaymentInitiatedButton;
	public WebElement getPaymentInitiatedButton() {
	return PaymentInitiatedButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Initiate']")
	private WebElement InitiateButton;
	public WebElement getInitiateButton() {
	return InitiateButton;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////
//Payment History Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='From Date']")
	private WebElement FromDateField;
	public WebElement getFromDateField() {
	return FromDateField;
	}
	@FindBy(xpath = "//input[@id='To Date']")
	private WebElement ToDateField;
	public WebElement getToDateField() {
	return ToDateField;
	}
	@FindBy(xpath = "//button[normalize-space()='Particular Vendor']")
	private WebElement ParticularVendorNavigationalBar;
	public WebElement getParticularVendorNavigationalBar() {
	return ParticularVendorNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='INITIATED']")
	private WebElement InitiatedButton;
	public WebElement getInitiatedButton() {
	return InitiatedButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement YesButton;
	public WebElement getYesButton() {
	return YesButton;
	}
	@FindBy(xpath = "//button[normalize-space()='No']")
	private WebElement NoButton;
	public WebElement getNoButton() {
	return NoButton;
	}
	@FindBy(xpath = "//input[@id='Shop Name']")
	private WebElement ShopNameField;
	public WebElement getShopNameField() {
	return ShopNameField;
	}
	@FindBy(xpath = "//input[@id='Sub Activity']")
	private WebElement SubActivityDropDown;
	public WebElement getSubActivityDropDown() {
	return SubActivityDropDown;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////
}
