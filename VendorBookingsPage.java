package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorBookingsPage {

	WebDriver driver;
	public VendorBookingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Vendor Booking Count Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//p[normalize-space()='Logesh Badminton']")
	private WebElement LogeshBadmintonDropDown;
	public WebElement getLogeshBadmintonDropDown() {
	return LogeshBadmintonDropDown;
	}
	
	@FindBy(xpath = "(//p[contains(text(),'View All')])[2]")
	private WebElement SecondViewAllButton;
	public WebElement getSecondViewAllButton() {
	return SecondViewAllButton;
	}
	@FindBy(xpath = "//div[@id='Sub-Activity']")
	private WebElement SubActivityDropDown;
	public WebElement getSubActivityDropDown() {
	return SubActivityDropDown;
	}
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
	
////////////////////////////////////////////////////////////////////////////////////////////////
//View Vendor Bookings Xpath.
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
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement BadmintonOption;
	public WebElement getBadmintonOption() {
	return BadmintonOption;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////
//View All Bookings Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	private WebElement ClearButton;
	public WebElement getClearButton() {
	return ClearButton;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////
}
