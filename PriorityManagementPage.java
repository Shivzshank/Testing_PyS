package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriorityManagementPage {

	WebDriver driver;
	public PriorityManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Map Priority To Vendor Xpath.
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
	@FindBy(xpath = "//div[@id='Select a Priority']")
	private WebElement SelectAPriorityDropDown;
	public WebElement getSelectAPriorityDropDown() {
	return SelectAPriorityDropDown;
	}
	@FindBy(xpath = "//button[normalize-space()='Map Priority']")
	private WebElement MapPriorityButton;
	public WebElement getMapPriorityButton() {
	return MapPriorityButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement CloseButton;
	public WebElement getCloseButton() {
	return CloseButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}
