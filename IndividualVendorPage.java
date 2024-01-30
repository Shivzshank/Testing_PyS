package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualVendorPage {
	WebDriver driver;
	public IndividualVendorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Vendor Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Shop Name']")
	private WebElement ShopNameField;
	public WebElement getShopNameField() {
	return ShopNameField;
	}
	@FindBy(xpath = "//input[@id='Shop opening time']")
	private WebElement ShopOpeningTimeField;
	public WebElement getShopOpeningTimeField() {
	return ShopOpeningTimeField;
	}
	@FindBy(xpath = "//input[@id='Shop closing time']")
	private WebElement ShopClosingTimeField;
	public WebElement getShopClosingTimeField() {
	return ShopClosingTimeField;
	}
	@FindBy(xpath = "//input[@id='Shop Mobile Number']")
	private WebElement ShopMobileNumberField;
	public WebElement getShopMobileNumberField() {
	return ShopMobileNumberField;
	}
	@FindBy(xpath = "//input[@id='Address']")
	private WebElement ShopAddressField;
	public WebElement getShopAddressField() {
	return ShopAddressField;
	}
	@FindBy(xpath = "//input[@id='City']")
	private WebElement CityField;
	public WebElement getCityField() {
	return CityField;
	}
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement LatitiudeField;
	public WebElement getLatitiudeField() {
	return LatitiudeField;
	}
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement LongitudeField;
	public WebElement getLongitudeField() {
	return LongitudeField;
	}
	@FindBy(xpath = "//input[@id='Country']")
	private WebElement CountryField;
	public WebElement getCountryField() {
	return CountryField;
	}
	@FindBy(xpath = "//input[@id='Supervisor Name']")
	private WebElement SupervisorNameField;
	public WebElement getSupervisorNameField() {
	return SupervisorNameField;
	}
	@FindBy(xpath = "(//input[@type = 'text'])[9]")
	private WebElement SupervisorEmailField;
	public WebElement getSupervisorEmailField() {
	return SupervisorEmailField;
	}
	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement NextButton;
	public WebElement getNextButton() {
	return NextButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Back']")
	private WebElement BackButton;
	public WebElement getBackButton() {
	return BackButton;
	}
	@FindBy(xpath = "//div[@id='Activity']")
	private WebElement ActivityDropDown;
	public WebElement getActivityDropDown() {
	return ActivityDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement BadmintonOption;
	public WebElement getBadmintonOption() {
	return BadmintonOption;
	}
	@FindBy(xpath = "//p[@aria-label='Car Wash']")
	private WebElement CarWashOption;
	public WebElement getCarWashOption() {
	return CarWashOption;
	}
	@FindBy(xpath = "//p[@aria-label='Cricket']")
	private WebElement CricketOption;
	public WebElement getCricketOption() {
	return CricketOption;
	}
	@FindBy(xpath = "//p[@aria-label='Dance']")
	private WebElement DanceOption;
	public WebElement getDanceOption() {
	return DanceOption;
	}
	@FindBy(xpath = "//p[@aria-label='Gym']")
	private WebElement GymOption;
	public WebElement getGymOption() {
	return GymOption;
	}
	@FindBy(xpath = "//p[@aria-label='Rage Room']")
	private WebElement RageRoomOption;
	public WebElement getRageRoomOption() {
	return RageRoomOption;
	}
	@FindBy(xpath = "//p[@aria-label='Salon']")
	private WebElement SalonOption;
	public WebElement getSalonOption() {
	return SalonOption;
	}
	@FindBy(xpath = "//p[@aria-label='Skating']")
	private WebElement SkatingOption;
	public WebElement getSkatingOption() {
	return SkatingOption;
	}
	@FindBy(xpath = "//p[@aria-label='Sports']")
	private WebElement SportsOption;
	public WebElement getSportsOption() {
	return SportsOption;
	}
	@FindBy(xpath = "//p[@aria-label='Swimming']")
	private WebElement SwimmingOption;
	public WebElement getSwimmingOption() {
	return SwimmingOption;
	}
	@FindBy(xpath = "//span[normalize-space()='Badminton']")
	private WebElement BadmintonCheckBox;
	public WebElement getBadmintonCheckBox() {
	return BadmintonCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Hair Cut']")
	private WebElement HairCutCheckBox;
	public WebElement getHairCutCheckBox() {
	return HairCutCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Hair Cut Kid']")
	private WebElement HairCutKidCheckBox;
	public WebElement getHairCutKidCheckBox() {
	return HairCutKidCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Colouring']")
	private WebElement ColouringCheckBox;
	public WebElement getColouringCheckBox() {
	return ColouringCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Gym']")
	private WebElement GymCheckBox;
	public WebElement getGymCheckBox() {
	return GymCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Rage Room']")
	private WebElement RageRoomCheckBox;
	public WebElement getRageRoomCheckBox() {
	return RageRoomCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='NetPracticeCricket']")
	private WebElement NetPracticeCricketCheckBox;
	public WebElement getNetPracticeCricketCheckBox() {
	return NetPracticeCricketCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Kids Gym']")
	private WebElement KidsGymCheckBox;
	public WebElement getKidsGymCheckBox() {
	return KidsGymCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Kids Swimming']")
	private WebElement KidsSwimmingCheckBox;
	public WebElement getKidsSwimmingCheckBox() {
	return KidsSwimmingCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Adults Swimming']")
	private WebElement AdultsSwimmingCheckBox;
	public WebElement getAdultsSwimmingCheckBox() {
	return AdultsSwimmingCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Table Tennis']")
	private WebElement TableTennisCheckBox;
	public WebElement getTableTennisCheckBox() {
	return TableTennisCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Boxing']")
	private WebElement BoxingCheckBox;
	public WebElement getBoxingCheckBox() {
	return BoxingCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Football']")
	private WebElement FootballCheckBox;
	public WebElement getFootballCheckBox() {
	return FootballCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Cricket']")
	private WebElement CricketCheckBox;
	public WebElement getCricketCheckBox() {
	return CricketCheckBox;
	}
	@FindBy(xpath = "//div[@id='Sub Activities']")
	private WebElement SubActivitiesDropDown;
	public WebElement getSubActivitiesDropDown() {
	return SubActivitiesDropDown;
	}
	@FindBy(xpath = "//span[normalize-space()='Badminton']")
	private WebElement BadmintonSubActivitiesOption;
	public WebElement getBadmintonSubActivitiesOption() {
	return BadmintonSubActivitiesOption;
	}
	@FindBy(xpath = "//div[@id='Pay Mode']")
	private WebElement PayModeDropDown;
	public WebElement getPayModeDropDown() {
	return PayModeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Both']")
	private WebElement BothOption;
	public WebElement getBothOption() {
	return BothOption;
	}
	@FindBy(xpath = "//p[@aria-label='Cash']")
	private WebElement CashOption;
	public WebElement getCashOption() {
	return CashOption;
	}
	@FindBy(xpath = "//p[@aria-label='Online']")
	private WebElement OnlineOption;
	public WebElement getOnlineOption() {
	return OnlineOption;
	}
	@FindBy(xpath = "//div[@id='Gender']")
	private WebElement GenderDropDown;
	public WebElement getGenderDropDown() {
	return GenderDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Female']")
	private WebElement FemaleOption;
	public WebElement getFemaleOption() {
	return FemaleOption;
	}
	@FindBy(xpath = "//p[@aria-label='Male']")
	private WebElement MaleOption;
	public WebElement getMaleOption() {
	return MaleOption;
	}
	@FindBy(xpath = "//p[@aria-label='Unisex']")
	private WebElement UnisexOption;
	public WebElement getUnisexOption() {
	return UnisexOption;
	}
	@FindBy(xpath = "//textarea[@id='Guidelines']")
	private WebElement GuidelinesField;
	public WebElement getGuidelinesField() {
	return GuidelinesField;
	}
	@FindBy(xpath = "//p[contains(text(),'Register')]")
	private WebElement RegisterButton;
	public WebElement getRegisterButton() {
	return RegisterButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Agree']")
	private WebElement AgreeButton;
	public WebElement getAgreeButton() {
	return AgreeButton;
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//View Vendor Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
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
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[1]")
	private WebElement ShopNameEdit;
	public WebElement getShopNameEdit() {
	return ShopNameEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[2]")
	private WebElement ShopOpenTimeEdit;
	public WebElement getShopOpenTimeEdit() {
	return ShopOpenTimeEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[3]")
	private WebElement ShopCloseTimeEdit;
	public WebElement getShopCloseTimeEdit() {
	return ShopCloseTimeEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[4]")
	private WebElement ShopNumberEdit;
	public WebElement getShopNumberEdit() {
	return ShopNumberEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[5]")
	private WebElement ShopAddressEdit;
	public WebElement getShopAddressEdit() {
	return ShopAddressEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[6]")
	private WebElement CityEdit;
	public WebElement getCityEdit() {
	return CityEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[7]")
	private WebElement CountryEdit;
	public WebElement getCountryEdit() {
	return CountryEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[8]")
	private WebElement LatitudeEdit;
	public WebElement getLatitudeEdit() {
	return LatitudeEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[9]")
	private WebElement LongitudeEdit;
	public WebElement getLongitudeEdit() {
	return LongitudeEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[11]")
	private WebElement SubActivityDropDownEdit;
	public WebElement getSubActivityDropDownEdit() {
	return SubActivityDropDownEdit;
	}
	@FindBy(xpath = "//div[@id='Slot Types']")
	private WebElement SlotTypesEdit;
	public WebElement getSlotTypesEdit() {
	return SlotTypesEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[12]")
	private WebElement PaymentModeDropDownEdit;
	public WebElement getPaymentModeDropDownEdit() {
	return PaymentModeDropDownEdit;
	}
	@FindBy(xpath = "//div[@role='combobox']")
	private WebElement PaymentEdit;
	public WebElement getPaymentEdit() {
	return PaymentEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[13]")
	private WebElement GenderDropDownEdit;
	public WebElement getGenderDropDownEdit() {
	return GenderDropDownEdit;
	}
	@FindBy(xpath = "//div[@role='combobox']")
	private WebElement GenderEdit;
	public WebElement getGenderEdit() {
	return GenderEdit;
	}
	@FindBy(xpath = "(//p[@class = 'MuiTypography-root MuiTypography-body2 css-1o38g2n'])[14]")
	private WebElement GuidelinesEdit;
	public WebElement getGuidelinesEdit() {
	return GuidelinesEdit;
	}
	@FindBy(xpath = "//div[@class='MuiBox-root css-r68fyx']//*[name()='svg']")
	private WebElement TickButtonForAllEdit;
	public WebElement getTickButtonForAllEdit() {
	return TickButtonForAllEdit;
	}
	@FindBy(xpath = "//div[@class='MuiBox-root css-brnk2d']//*[name()='svg']")
	private WebElement CrossButtonForAllEdit;
	public WebElement getCrossButtonForAllEdit() {
	return CrossButtonForAllEdit;
	}
	@FindBy(xpath = "//input[@id='Shop Opening at']")
	private WebElement ShopOpeningAtField;
	public WebElement getShopOpeningAtField() {
	return ShopOpeningAtField;
	}
	@FindBy(xpath = "//input[@id='Shop Closing at']")
	private WebElement ShopClosingAtField;
	public WebElement getShopClosingAtField() {
	return ShopClosingAtField;
	}
	@FindBy(xpath = "//input[@id='Shop Number']")
	private WebElement ShopNumberEditField;
	public WebElement getShopNumberEditField() {
	return ShopNumberEditField;
	}
	@FindBy(xpath = "//input[@id='Latitude']")
	private WebElement LatitudeEditField;
	public WebElement getLatitudeEditField() {
	return LatitudeEditField;
	}
	@FindBy(xpath = "//input[@id='Longitude']")
	private WebElement LongitudeEditField;
	public WebElement getLongitudeEditField() {
	return LongitudeEditField;
	}
	@FindBy(xpath = "//span[normalize-space()='Singles Badminton']")
	private WebElement SinglesBadmintonOption;
	public WebElement getSinglesBadmintonOption() {
	return SinglesBadmintonOption;
	}
	@FindBy(xpath = "//span[normalize-space()='Double Badminton']")
	private WebElement DoubleBadmintonOption;
	public WebElement getDoubleBadmintonOption() {
	return DoubleBadmintonOption;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//Vendor List Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement FirstCheckBox;
	public WebElement getFirstCheckBox() {
	return FirstCheckBox;
	}
	@FindBy(xpath = "//p[normalize-space()='Test']")
	private WebElement TestCheckBox;
	public WebElement getTestCheckBox() {
	return TestCheckBox;
	}
	@FindBy(xpath = "//button[normalize-space()='Download']")
	private WebElement DownloadButton;
	public WebElement getDownloadButton() {
	return DownloadButton;
	}
	@FindBy(xpath = "//button[normalize-space()='All Vendor']")
	private WebElement AllVendorNavigationalBar;
	public WebElement getAllVendorNavigationalBar() {
	return AllVendorNavigationalBar;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
	
}
