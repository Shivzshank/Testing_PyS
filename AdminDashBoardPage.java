package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashBoardPage {

	WebDriver driver;
	public AdminDashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//h6[contains(text(),'Vendors')]")
	private WebElement VendorsNotofication;
public WebElement getVendorsNotofication() {
	return VendorsNotofication;
}
@FindBy(xpath = "//h6[contains(text(),'Customers')]")
private WebElement CustomersNotification;
public WebElement getCustomersNotification() {
return CustomersNotification;
}
@FindBy(xpath = "//h6[contains(text(),'Bookings')]")
private WebElement BookingsNotofication;
public WebElement getBookingsNotofication() {
return BookingsNotofication;
}
@FindBy(xpath = "//h6[contains(text(),'CustomerComplaint')]")
private WebElement CustomerComplaintNotofication;
public WebElement getCustomerComplaintNotofication() {
return CustomerComplaintNotofication;
}
@FindBy(xpath = "//h6[contains(text(),'VendorComplaints')]")
private WebElement VendorComplaintsNotofication;
public WebElement getVendorComplaintsNotofication() {
return CustomerComplaintNotofication;
}
@FindBy(xpath = "(//button[@type = 'button'])[4]")
private WebElement DashboardDateButton;
public WebElement getDashboardDateButton() {
return DashboardDateButton;
}
@FindBy(xpath = "//div[@class='MuiButtonBase-root MuiAccordionSummary-root css-1u2iach']")
private WebElement FirstTodayVendorBookings;
public WebElement getFirstTodayVendorBookings() {
return FirstTodayVendorBookings;
}
@FindBy(xpath = "(//p[@aria-label='View More Details'][normalize-space()='more..'])[1]")
private WebElement FirstMoreButton;
public WebElement getFirstMoreButton() {
return FirstMoreButton;
}
@FindBy(xpath = "//button[normalize-space()='Last Two Week']")
private WebElement LastTwoWeekButton;
public WebElement getLastTwoWeekButton() {
return LastTwoWeekButton;
}








}
