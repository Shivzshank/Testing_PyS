package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//div[contains(text(),'dashboard')]")
private WebElement DashBoard;
public WebElement getDashBoard() {
	return DashBoard;
}
@FindBy(xpath = "//div[contains(text(),'PyS User Management')]")
private WebElement PysUserManagement;
public WebElement getPysUserManagement() {
	return PysUserManagement;
}
@FindBy(xpath = "//div[normalize-space()='Create Users']")
private WebElement CreateUsers;
public WebElement getCreateUsers() {
	return CreateUsers;
}
@FindBy(xpath = "//div[normalize-space()='View Users']")
private WebElement ViewUsers;
public WebElement getViewUsers() {
	return ViewUsers;
}
@FindBy(xpath = "//div[normalize-space()='Grade Management']")
private WebElement GradeManagement;
public WebElement getGradeManagement() {
	return GradeManagement;
}
@FindBy(xpath = "(//div[contains(text(),'Activities')])[1]")
private WebElement Activities;
public WebElement getActivities() {
	return Activities;
}
@FindBy(xpath = "//div[normalize-space()='Create Activities']")
private WebElement CreateActivities;
public WebElement getCreateActivities() {
	return CreateActivities;
}
@FindBy(xpath = "//div[normalize-space()='Map Sub-Activities']")
private WebElement MapSubActivities;
public WebElement getMapSubActivities() {
	return MapSubActivities;
}
@FindBy(xpath = "//div[@class='MuiListItemText-root css-1tsvksn'][normalize-space()='Sub-Activities']")
private WebElement SubActivities;
public WebElement getSubActivities() {
	return SubActivities;
}
@FindBy(xpath = "//div[normalize-space()='Create Sub-Activities']")
private WebElement CreateSubActivities;
public WebElement getCreateSubActivities() {
	return CreateSubActivities;
}
@FindBy(xpath = "//div[normalize-space()='View Sub-Activities']")
private WebElement ViewSubActivities;
public WebElement getViewSubActivities() {
	return ViewSubActivities;
}
@FindBy(xpath = "//div[contains(text(),'Child Sub-Activities')]")
private WebElement ChildSubActivities;
public WebElement getChildSubActivities() {
	return ChildSubActivities;
}
@FindBy(xpath = "//div[normalize-space()='Create Child']")
private WebElement CreateChild;
public WebElement getCreateChild() {
	return CreateChild;
}
@FindBy(xpath = "//div[normalize-space()='View Child Mapping']")
private WebElement ViewChildMapping;
public WebElement getViewChildMapping() {
	return ViewChildMapping;
}
@FindBy(xpath = "(//div[contains(text(),'Amenities')])[1]")
private WebElement Amenities;
public WebElement getAmenities() {
	return Amenities;
}
@FindBy(xpath = "//div[normalize-space()='Create Amenities']")
private WebElement CreateAmenities;
public WebElement getCreateAmenities() {
	return CreateAmenities;
}
@FindBy(xpath = "//div[normalize-space()='Map Amenities to Vendor']")
private WebElement MapAmenitiesToVendor;
public WebElement getMapAmenitiesToVendor() {
	return MapAmenitiesToVendor;
}
@FindBy(xpath = "//div[contains(text(),'Individual Vendor')]")
private WebElement IndividualVendor;
public WebElement getIndividualVendor() {
	return IndividualVendor;
}
@FindBy(xpath = "//div[normalize-space()='Create Vendors']")
private WebElement CreateVendors;
public WebElement getCreateVendors() {
	return CreateVendors;
}
@FindBy(xpath = "//div[normalize-space()='View Vendors']")
private WebElement ViewVendors;
public WebElement getViewVendors() {
	return ViewVendors;
}
@FindBy(xpath = "//div[normalize-space()='Vendors List']")
private WebElement VendorsList;
public WebElement getVendorsList() {
	return VendorsList;
}
@FindBy(xpath = "(//div[contains(text(),'Group')])[1]")
private WebElement Group;
public WebElement getGroup() {
	return Group;
}
@FindBy(xpath = "//div[normalize-space()='Create Group']")
private WebElement CreateGroup;
public WebElement getCreateGroup() {
	return CreateGroup;
}
@FindBy(xpath = "//div[normalize-space()='View Group']")
private WebElement ViewGroup;
public WebElement getViewGroup() {
	return ViewGroup;
}
@FindBy(xpath = "//div[normalize-space()='Create Branch']")
private WebElement CreateBranch;
public WebElement getCreateBranch() {
	return CreateBranch;
}
@FindBy(xpath = "//div[normalize-space()='View Branch']")
private WebElement ViewBranch;
public WebElement getViewBranch() {
	return ViewBranch;
}
@FindBy(xpath = "(//div[contains(text(),'Cancellation Policy')])[1]")
private WebElement CancellationPolicy;
public WebElement getCancellationPolicy() {
	return CancellationPolicy;
}
@FindBy(xpath = "//div[contains(text(),'Create Cancellation Policy')]")
private WebElement CreateCancellationPolicy;
public WebElement getCreateCancellationPolicy() {
	return CreateCancellationPolicy;
}
@FindBy(xpath = "(//div[contains(text(),'Slots')])[1]")
private WebElement Slots;
public WebElement getSlots() {
	return Slots;
}
@FindBy(xpath = "//div[normalize-space()='Create Slots']")
private WebElement CreateSlots;
public WebElement getCreateSlots() {
	return CreateSlots;
}
@FindBy(xpath = "//div[normalize-space()='View Slots']")
private WebElement ViewSlots;
public WebElement getViewSlots() {
	return ViewSlots;
}
@FindBy(xpath = "//div[normalize-space()='Block Slots']")
private WebElement BlockSlots;
public WebElement getBlockSlots() {
	return BlockSlots;
}
@FindBy(xpath = "(//div[contains(text(),'Offers')])[1]")
private WebElement Offers;
public WebElement getOffers() {
	return Offers;
}
@FindBy(xpath = "//div[normalize-space()='Create Offers']")
private WebElement CreateOffers;
public WebElement getCreateOffers() {
	return CreateOffers;
}
@FindBy(xpath = "//div[normalize-space()='View Offers']")
private WebElement ViewOffers;
public WebElement getViewOffers() {
	return ViewOffers;
}
@FindBy(xpath = "//div[contains(text(),'Image Gallery')]")
private WebElement ImageGallery;
public WebElement getImageGallery() {
	return ImageGallery;
}
@FindBy(xpath = "//div[contains(text(),'Upload Vendor Image')]")
private WebElement UploadVendorImage;
public WebElement getUploadVendorImage() {
	return UploadVendorImage;
}
@FindBy(xpath = "(//div[contains(text(),'Advertisement')])[1]")
private WebElement Advertisement;
public WebElement getAdvertisement() {
	return Advertisement;
}
@FindBy(xpath = "//div[normalize-space()='Create Advertisement']")
private WebElement CreateAdvertisement;
public WebElement getCreateAdvertisement() {
	return CreateAdvertisement;
}
@FindBy(xpath = "//div[normalize-space()='View Advertisement']")
private WebElement ViewAdvertisement;
public WebElement getViewAdvertisement() {
	return ViewAdvertisement;
}
@FindBy(xpath = "(//div[contains(text(),'Tournament')])[1]")
private WebElement Tournament;
public WebElement getTournament() {
	return Tournament;
}
@FindBy(xpath = "//div[normalize-space()='Create Tournament']")
private WebElement CreateTournament;
public WebElement getCreateTournament() {
	return CreateTournament;
}
@FindBy(xpath = "//div[normalize-space()='View Tournament']")
private WebElement ViewTournament;
public WebElement getViewTournament() {
	return ViewTournament;
}
@FindBy(xpath = "//div[contains(text(),'Supervisors Management')]")
private WebElement SupervisorsManagement;
public WebElement getSupervisorsManagement() {
	return SupervisorsManagement;
}
@FindBy(xpath = "//div[normalize-space()='Create Supervisors']")
private WebElement CreateSupervisors;
public WebElement getCreateSupervisors() {
	return CreateSupervisors;
}
@FindBy(xpath = "//div[normalize-space()='View Supervisors']")
private WebElement ViewSupervisors;
public WebElement getViewSupervisors() {
	return ViewSupervisors;
}
@FindBy(xpath = "//div[contains(text(),'Trainers Management')]")
private WebElement TrainersManagement;
public WebElement getTrainersManagement() {
	return TrainersManagement;
}
@FindBy(xpath = "//div[normalize-space()='Create Trainers']")
private WebElement CreateTrainers;
public WebElement getCreateTrainers() {
	return CreateTrainers;
}
@FindBy(xpath = "//div[normalize-space()='View Trainers']")
private WebElement ViewTrainers;
public WebElement getViewTrainers() {
	return ViewTrainers;
}
@FindBy(xpath = "(//div[contains(text(),'Vendor Bookings')])[1]")
private WebElement VendorBookings;
public WebElement getVendorBookings() {
	return VendorBookings;
}
@FindBy(xpath = "//div[normalize-space()='Vendors Booking Count']")
private WebElement VendorsBookingCount;
public WebElement getVendorsBookingCount() {
	return VendorsBookingCount;
}
@FindBy(xpath = "//div[normalize-space()='View Vendor Bookings']")
private WebElement ViewVendorBookings;
public WebElement getViewVendorBookings() {
	return ViewVendorBookings;
}
@FindBy(xpath = "//div[normalize-space()='View All Bookings']")
private WebElement ViewAllBookings;
public WebElement getViewAllBookings() {
	return ViewAllBookings;
}
@FindBy(xpath = "//div[contains(text(),'Vendor Payments')]")
private WebElement VendorPayments;
public WebElement getVendorPayments() {
	return VendorPayments;
}
@FindBy(xpath = "//div[normalize-space()='Payment Due']")
private WebElement PaymentDue;
public WebElement getPaymentDue() {
	return PaymentDue;
}
@FindBy(xpath = "//div[normalize-space()='Payment History']")
private WebElement PaymentHistory;
public WebElement getPaymentHistory() {
	return PaymentHistory;
}
@FindBy(xpath = "//div[contains(text(),'Report Generation')]")
private WebElement ReportGeneration;
public WebElement getReportGeneration() {
	return ReportGeneration;
}
@FindBy(xpath = "//div[normalize-space()='Vendors Wise Report']")
private WebElement VendorsWiseReport;
public WebElement getVendorsWiseReport() {
	return VendorsWiseReport;
}
@FindBy(xpath = "//div[normalize-space()='Activity Wise RePort']")
private WebElement ActivityWiseRePort;
public WebElement getActivityWiseRePort() {
	return ActivityWiseRePort;
}
@FindBy(xpath = "//div[contains(text(),'Customers Details')]")
private WebElement CustomersDetails;
public WebElement getCustomersDetails() {
	return CustomersDetails;
}
@FindBy(xpath = "//div[normalize-space()='View Customers']")
private WebElement ViewCustomers;
public WebElement getViewCustomers() {
	return ViewCustomers;
}
@FindBy(xpath = "//div[normalize-space()='Customers Booking Count']")
private WebElement CustomersBookingCount;
public WebElement getCustomersBookingCount() {
	return CustomersBookingCount;
}
@FindBy(xpath = "//div[normalize-space()='View Customers Payments']")
private WebElement ViewCustomersPayments;
public WebElement getViewCustomersPayments() {
	return ViewCustomersPayments;
}
@FindBy(xpath = "(//div[contains(text(),'Complaints')])[1]")
private WebElement Complaints;
public WebElement getComplaints() {
	return Complaints;
}
@FindBy(xpath = "//div[normalize-space()='Customers Complaints']")
private WebElement CustomersComplaints;
public WebElement getCustomersComplaints() {
	return CustomersComplaints;
}
@FindBy(xpath = "//div[normalize-space()='Vendor Complaints']")
private WebElement VendorComplaints;
public WebElement getVendorComplaints() {
	return VendorComplaints;
}
@FindBy(xpath = "//div[contains(text(),'Priority Management')]")
private WebElement PriorityManagement;
public WebElement getPriorityManagement() {
	return PriorityManagement;
}
@FindBy(xpath = "//div[contains(text(),'Map Priority To Vendor')]")
private WebElement MapPriorityToVendor;
public WebElement getMapPriorityToVendor() {
	return MapPriorityToVendor;
}
@FindBy(xpath = "(//div[contains(text(),'Enrolment')])[1]")
private WebElement Enrolment;
public WebElement getEnrolment() {
	return Enrolment;
}
@FindBy(xpath = "//div[contains(text(),'View Enrolment')]")
private WebElement ViewEnrolment;
public WebElement getViewEnrolment() {
	return ViewEnrolment;
}
@FindBy(xpath = "(//div[contains(text(),'ViewMarketing')])[1]")
private WebElement ViewMarketing;
public WebElement getViewMarketing() {
	return ViewMarketing;
}
@FindBy(xpath = "(//div[contains(text(),'ViewMarketing')])[2]")
private WebElement ViewMarketingDropDown;
public WebElement getViewMarketingDropDown() {
	return ViewMarketingDropDown;
}

}
