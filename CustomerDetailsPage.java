package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage {

	WebDriver driver;
	public CustomerDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//View Customer Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "//input[@id='Customer Name']")
	private WebElement CustomerNameField;
	public WebElement getCustomerNameField() {
	return CustomerNameField;
	}
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement EmailField;
	public WebElement getEmailField() {
	return EmailField;
	}
	@FindBy(xpath = "//input[@id='Mobile Number']")
	private WebElement MobileNumberField;
	public WebElement getMobileNumberField() {
	return MobileNumberField;
	}
	@FindBy(xpath = "(//span[contains(text(),'Booking History')])[3]")
	private WebElement BookingHistoryButton;
	public WebElement getBookingHistoryButton() {
	return BookingHistoryButton;
	}
	@FindBy(xpath = "(//span[contains(text(),'Transaction History')])[3]")
	private WebElement TransactionHistoryButton;
	public WebElement getTransactionHistoryButton() {
	return TransactionHistoryButton;
	}
	@FindBy(xpath = "//input[@id='Select Booking Date']")
	private WebElement SelectBookingDateField;
	public WebElement getSelectBookingDateField() {
	return SelectBookingDateField;
	}
	@FindBy(xpath = "//div[@id='Booking Status']")
	private WebElement BokingStatusDropDown;
	public WebElement getBokingStatusDropDown() {
	return BokingStatusDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='BLOCKED']")
	private WebElement BlockedOption;
	public WebElement getBlockedOption() {
	return BlockedOption;
	}
	@FindBy(xpath = "//p[@aria-label='BOOKINGAVAILED']")
	private WebElement BookingAvailedOption;
	public WebElement getBookingAvailedOption() {
	return BookingAvailedOption;
	}
	@FindBy(xpath = "//p[@aria-label='CANCELLED']")
	private WebElement CancelledOption;
	public WebElement getCancelledOption() {
	return CancelledOption;
	}
	@FindBy(xpath = "//p[@aria-label='CONFIRMED']")
	private WebElement ConfirmedOption;
	public WebElement getConfirmedOption() {
	return ConfirmedOption;
	}
	@FindBy(xpath = "//p[@aria-label='INITIATED']")
	private WebElement InitiatedOption;
	public WebElement getInitiatedOption() {
	return InitiatedOption;
	}
	@FindBy(xpath = "//p[@aria-label='REJECTED']")
	private WebElement RejectedOption;
	public WebElement getRejectedOption() {
	return RejectedOption;
	}
	@FindBy(xpath = "//p[@aria-label='REVERSED']")
	private WebElement ReversedOption;
	public WebElement getReversedOption() {
	return ReversedOption;
	}
	@FindBy(xpath = "(//span[contains(text(),'Vendor Details')])[1]")
	private WebElement VendorDetailsButton;
	public WebElement getVendorDetailsButton() {
	return VendorDetailsButton;
	}
	@FindBy(xpath = "//input[@id='Select Transaction Date']")
	private WebElement TransactionDateField;
	public WebElement getTransactionDateField() {
	return TransactionDateField;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//Customer Booking Count Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Search Booking Count']")
	private WebElement SearchBookingCountField;
	public WebElement getSearchBookingCountField() {
	return SearchBookingCountField;
	}

////////////////////////////////////////////////////////////////////////////////////////////////	
//View Customer Payments Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//button[normalize-space()='PAYMENT HISTORY']")
	private WebElement PaymentHistoryNavigationalBar;
	public WebElement getPaymentHistoryNavigationalBar() {
	return PaymentHistoryNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='REFUNDS HISTORY']")
	private WebElement RefundsHistoryNavigationalBar;
	public WebElement getRefundsHistoryNavigationalBar() {
	return RefundsHistoryNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='ELIGIBLE REFUNDS']")
	private WebElement EligibleRefundsNavigationalBar;
	public WebElement getEligibleRefundsNavigationalBar() {
	return EligibleRefundsNavigationalBar;
	}
	@FindBy(xpath = "//div[@id='Status Type']")
	private WebElement StatusTypeDropDown;
	public WebElement getStatusTypeDropDown() {
	return StatusTypeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Authorized']")
	private WebElement AuthorizedOption;
	public WebElement getAuthorizedOption() {
	return AuthorizedOption;
	}
	@FindBy(xpath = "//p[@aria-label='Failed']")
	private WebElement FailedOption;
	public WebElement getFailedOption() {
	return FailedOption;
	}
	@FindBy(xpath = "//p[@aria-label='Refund']")
	private WebElement RefundOption;
	public WebElement getRefundOption() {
	return RefundOption;
	}
////////////////////////////////////////////////////////////////////////////////////////////////	
}
