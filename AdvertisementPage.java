package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertisementPage {

	WebDriver driver;

	public AdvertisementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Advertisement Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//button[normalize-space()='Internal Ad']")
	private WebElement InternalAdNavigationalBar;
	public WebElement getInternalAdNavigationalBar() {
		return InternalAdNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='External Ad']")
	private WebElement ExternalAdNavigationalBar;
	public WebElement getExternalAdNavigationalBar() {
		return ExternalAdNavigationalBar;
	}
	//button[normalize-space()='Internal Ad']
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
	@FindBy(xpath = "//input[@id='Title']")
	private WebElement TitleField;
	public WebElement getTitleField() {
		return TitleField;
	}
	@FindBy(xpath = "//input[@id='fileUpload']")
	private WebElement InternalAdFileUploadField;
	public WebElement getInternalAdFileUploadField() {
		return InternalAdFileUploadField;
	}
	@FindBy(xpath = "//input[@id='advertisementFileUpload']")
	private WebElement ExternalAdFileUploadField;
	public WebElement getExternalAdFileUploadField() {
		return ExternalAdFileUploadField;
	}
	@FindBy(xpath = "//input[@placeholder = 'Type address']")
	private WebElement AddressField;
	public WebElement getAddressField() {
		return AddressField;
	}
	@FindBy(xpath = "//p[contains(text(),'Submit')]")
	private WebElement SubmitField;
	public WebElement getSubmitField() {
		return SubmitField;
	}
	@FindBy(xpath = "//input[@id='External Url']")
	private WebElement ExternalUrlField;
	public WebElement getExternalUrlField() {
		return ExternalUrlField;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//View Advertisement Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}
