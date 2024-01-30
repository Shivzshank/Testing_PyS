package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMarketingPage {

	WebDriver driver;
	public ViewMarketingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Customer Complaints Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Start Date']")
	private WebElement StartDateField;
	public WebElement getStartDateField() {
	return StartDateField;
	}
	@FindBy(xpath = "//input[@id='End Date']")
	private WebElement EndDateField;
	public WebElement getEndDateField() {
	return EndDateField;
	}
	@FindBy(xpath = "//button[normalize-space()='Download']")
	private WebElement DownloadButton;
	public WebElement getDownloadButton() {
	return DownloadButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////
}
