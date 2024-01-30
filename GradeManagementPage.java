package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GradeManagementPage {

	WebDriver driver;
	public GradeManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
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
	private WebElement SelectingLogeshBadmintonVendor;
	public WebElement getSelectingLogeshBadmintonVendor() {
	return SelectingLogeshBadmintonVendor;
}	
	@FindBy(xpath = "//input[@name = 'VendorPercentage']")
	private WebElement VendorPercentageField;
	public WebElement getVendorPercentageField() {
	return VendorPercentageField;
}	
	@FindBy(xpath = "//input[@name = 'MemberShioPercentage']")
	private WebElement PysPercentageField;
	public WebElement getPysPercentageField() {
	return PysPercentageField;
}	
	@FindBy(xpath = "//input[@id=':r5l:']")
	private WebElement CustomerPercentageField;
	public WebElement getCustomerPercentageField() {
	return CustomerPercentageField;
}	
	@FindBy(xpath = "//button[normalize-space()='Map Vendor']")
	private WebElement MapVendorButton;
	public WebElement getMapVendorButton() {
	return MapVendorButton;
}	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement CloseButton;
	public WebElement getCloseButton() {
	return CloseButton;
}	
	
	
	
}
