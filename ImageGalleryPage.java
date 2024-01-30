package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImageGalleryPage {

	WebDriver driver;

	public ImageGalleryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Upload Vendor Image Xpath.
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
	@FindBy(xpath = "//div[@id='Image Type']")
	private WebElement ImageTypeDropDown;
	public WebElement getImageTypeDropDown() {
		return ImageTypeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Gallery Image']")
	private WebElement GalleryImage;
	public WebElement getGalleryImage() {
		return GalleryImage;
	}
	@FindBy(xpath = "//p[@aria-label='Profile Image']")
	private WebElement ProfileImage;
	public WebElement getProfileImage() {
		return ProfileImage;
	}
	@FindBy(xpath = "//p[@aria-label='Vendor Banner']")
	private WebElement VendorbBanner;
	public WebElement getVendorbBanner() {
		return VendorbBanner;
	}
	@FindBy(xpath = "//input[@id='formFileSm']")
	private WebElement FileChoosingLink;
	public WebElement getFileChoosingLink() {
		return FileChoosingLink;
	}
	@FindBy(xpath = "//p[contains(text(),'Upload')]")
	private WebElement UploadButton;
	public WebElement getUploadButton() {
		return UploadButton;
	}
	@FindBy(xpath = "//div[@id='SubActivities ']")
	private WebElement SubActivitiesDropDown;
	public WebElement getSubActivitiesDropDown() {
		return SubActivitiesDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement BadmintonOption;
	public WebElement getBadmintonOption() {
		return BadmintonOption;
	}
	@FindBy(xpath = "//div[text()='Profile image has been Updated!']")
	private WebElement ProfileUpdateSuccessPopUp;
	public WebElement getProfileUpdateSuccessPopUp() {
		return ProfileUpdateSuccessPopUp;
	}
	@FindBy(xpath = "//div/button[contains(text(),'Cancel')]")
	private WebElement PopUpCancelButton;
	public WebElement getPopUpCancelButton() {
		return PopUpCancelButton;
	}
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement FirstImageDeleteButton;
	public WebElement getFirstImageDeleteButton() {
		return FirstImageDeleteButton;
	}
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement PopUpOkButton;
	public WebElement getPopUpOkButton() {
		return PopUpOkButton;
	}

////////////////////////////////////////////////////////////////////////////////////////////////	
}
