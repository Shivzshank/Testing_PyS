package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplaintsPage {
	WebDriver driver;
	public ComplaintsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//Customer Complaints Xpath.
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
	@FindBy(xpath = "//div[@id='Status']")
	private WebElement StatusDropDown;
	public WebElement getStatusDropDown() {
	return StatusDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='ASSIGNED']")
	private WebElement AssignedOption;
	public WebElement getAssignedOption() {
	return AssignedOption;
	}
	@FindBy(xpath = "//p[@aria-label='NEW']")
	private WebElement NewOption;
	public WebElement getNewOption() {
	return NewOption;
	}
	@FindBy(xpath = "//p[@aria-label='REOPENED']")
	private WebElement ReopenedOption;
	public WebElement getReopenedOption() {
	return ReopenedOption;
	}
	@FindBy(xpath = "//p[@aria-label='RESOLVED']")
	private WebElement ResolvedOption;
	public WebElement getResolvedOption() {
	return ResolvedOption;
	}
	@FindBy(xpath = "//p[@aria-label='VERIFIED']")
	private WebElement VerifiedOption;
	public WebElement getVerifiedOption() {
	return VerifiedOption;
	}
	@FindBy(xpath = "//input[@id='Estimated Fixed Date']")
	private WebElement EstimatedFixedDateField;
	public WebElement getEstimatedFixedDateField() {
	return EstimatedFixedDateField;
	}
	@FindBy(xpath = "//input[@id='Staff Name']")
	private WebElement AssignedToField;
	public WebElement getAssignedToField() {
	return AssignedToField;
	}
	@FindBy(xpath = "//textarea[@id='Work around']")
	private WebElement WorkAroundField;
	public WebElement getWorkAroundField() {
	return WorkAroundField;
	}
	@FindBy(xpath = "//p[contains(text(),'Submit')]")
	private WebElement SubmitButton;
	public WebElement getSubmitButton() {
	return SubmitButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////
//Vendor Complaints Xpath.(all x paths are in Customer complaint)
////////////////////////////////////////////////////////////////////////////////////////////////
//	@FindBy(xpath = "")
//	private WebElement ;
//	public WebElement get() {
//	return ;
//	}

////////////////////////////////////////////////////////////////////////////////////////////////	
}
