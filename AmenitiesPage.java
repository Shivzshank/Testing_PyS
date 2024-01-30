package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmenitiesPage {

	WebDriver driver;
	public AmenitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Amenities Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Amenity Name']")
	private WebElement AmenityNameField;
	public WebElement getAmenityNameField() {
	return AmenityNameField;
	}
	@FindBy(xpath = "//input[@id='fullWidth']")
	private WebElement AmenityDescriptionField;
	public WebElement getAmenityDescriptionField() {
	return AmenityDescriptionField;
	}
	@FindBy(xpath = "//p[contains(text(),'Create Amenities')]")
	private WebElement CreateAmenitiesButton;
	public WebElement getCreateAmenitiesButton() {
	return CreateAmenitiesButton;
	}
	@FindBy(xpath = "(//button[@type = 'button'])[13]")
	private WebElement ExistingAmenities13;
	public WebElement getExistingAmenities13() {
	return ExistingAmenities13;
	}
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement UpdateButton;
	public WebElement getUpdateButton() {
	return UpdateButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement CloseButton;
	public WebElement getCloseButton() {
	return CloseButton;
	}
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement OkButton;
	public WebElement getOkButton() {
	return OkButton;
	}
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12 css-15j76c0']//input[@id='Amenity Name']")
	private WebElement AmenityNameFieldEdit;
	public WebElement getAmenityNameFieldEdit() {
	return AmenityNameFieldEdit;
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//Map Amenities To Vendor Xpath.
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
	@FindBy(xpath = "//span[normalize-space()='TestAmenity02']")
	private WebElement TestAmenity02CheckBox;
	public WebElement getTestAmenity02CheckBox() {
	return TestAmenity02CheckBox;
	}
	@FindBy(xpath = "//button[normalize-space()='Map Amenities']")
	private WebElement MapAmenitiesButton;
	public WebElement getMapAmenitiesButton() {
	return MapAmenitiesButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}
