package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportGenerationPage {

	WebDriver driver;
	public ReportGenerationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Vendor Wise Report Xpath.
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
	@FindBy(xpath = "//button[normalize-space()='Download']")
	private WebElement DownloadButton;
	public WebElement getDownloadButton() {
	return DownloadButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Particular Vendor']")
	private WebElement ParticularVendorNavigationalBar;
	public WebElement getParticularVendorNavigationalBar() {
	return ParticularVendorNavigationalBar;
	}
	@FindBy(xpath = "//input[@id='Shop Name']")
	private WebElement ShopNameField;
	public WebElement getShopNameField() {
	return ShopNameField;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//Activity Wise Report Xpath.(Same as Vendorwise report)
////////////////////////////////////////////////////////////////////////////////////////////////	

}
