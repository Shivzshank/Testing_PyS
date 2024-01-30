package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancellationPolicyPage {

	WebDriver driver;
	public CancellationPolicyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Cancellation Policy Xpath.
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
	@FindBy(xpath = "(//a[contains(text(),'TestShopName')])[1]")
	private WebElement TestShopNameVendor;
	public WebElement getTestShopNameVendor() {
	return TestShopNameVendor;
	}
	@FindBy(xpath = "//input[@id='Cancellation Time Limit']")
	private WebElement CancellationTimeLimitField;
	public WebElement getCancellationTimeLimitField() {
	return CancellationTimeLimitField;
	}
	@FindBy(xpath = "//input[@id='Cancellation Percentage']")
	private WebElement CancellationPercentageField;
	public WebElement getCancellationPercentageField() {
	return CancellationPercentageField;
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
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}
