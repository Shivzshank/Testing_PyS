package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {

	WebDriver driver;
	public OffersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Offers Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//button[normalize-space()='Flat Offer']")
	private WebElement FlatOfferNavigationalBar;
	public WebElement getFlatOfferNavigationalBar() {
		return FlatOfferNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='First Time Offer']")
	private WebElement firstTimeOfferNavigationalBar;
	public WebElement getFirstTimeOfferNavigationalBar() {
		return firstTimeOfferNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='Slot Offer']")
	private WebElement SlotofferNavigationalBar;
	public WebElement getSlotofferNavigationalBar() {
		return SlotofferNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='Adjacent Offer']")
	private WebElement AdjacentOfferNavigationalBar;
	public WebElement getAdjacentOfferNavigationalBar() {
		return AdjacentOfferNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='Happy Hours']")
	private WebElement HappyHoursNavigationalBar;
	public WebElement getHappyHoursNavigationalBar() {
		return HappyHoursNavigationalBar;
	}
	@FindBy(xpath = "//button[normalize-space()='Referral Offer']")
	private WebElement ReferralOfferNavigationalBar;
	public WebElement getReferralOfferNavigationalBar() {
		return ReferralOfferNavigationalBar;
	}
	@FindBy(xpath = "//div[@id='Offer Provider']")
	private WebElement OfferProviderDropDown;
	public WebElement getOfferProviderDropDown() {
		return OfferProviderDropDown;
	}
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-12xczkh'])[1]")
	private WebElement FromDateIcon;
	public WebElement getFromDateIcon() {
		return FromDateIcon;
	}
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-12xczkh'])[2]")
	private WebElement ToDateIcon;
	public WebElement getToDateIcon() {
		return ToDateIcon;
	}
	@FindBy(xpath = "//input[@id='Discount Percentage']")
	private WebElement DiscountPercentageField;
	public WebElement getDiscountPercentageField() {
		return DiscountPercentageField;
	}
	@FindBy(xpath = "//input[@id='Max Discount Amount']")
	private WebElement MaxDiscountAmountField;
	public WebElement getMaxDiscountAmountField() {
		return MaxDiscountAmountField;
	}
	@FindBy(xpath = "//input[@id='Usage Limit']")
	private WebElement UsageLimitField;
	public WebElement getUsageLimitField() {
		return UsageLimitField;
	}
	@FindBy(xpath = "//div[@id='Vendor Type']")
	private WebElement VendorTypeDropDown;
	public WebElement getVendorTypeDropDown() {
		return VendorTypeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='ALL']")
	private WebElement AllOption;
	public WebElement getAllOption() {
		return AllOption;
	}
	@FindBy(xpath = "//p[@aria-label = 'Particular']")
	private WebElement ParticularOption;
	public WebElement getParticularOption() {
		return ParticularOption;
	}
	@FindBy(xpath = "//div[@id='Sub-Activity Type']")
	private WebElement SubActivityDropDown;
	public WebElement getSubActivityDropDown() {
		return SubActivityDropDown;
	}
	@FindBy(xpath = "//div[@id='Customer Type']")
	private WebElement CustomerTypeDropDown;
	public WebElement getCustomerTypeDropDown() {
		return CustomerTypeDropDown;
	}
	@FindBy(xpath = "//input[@id='Shop Name']")
	private WebElement ShopNameField;
	public WebElement getShopNameField() {
		return ShopNameField;
	}
	@FindBy(xpath = "//div[@id='subActivity Type']")
	private WebElement SubActivityTypeDropDown;
	public WebElement getSubActivityTypeDropDown() {
		return SubActivityTypeDropDown;
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
	@FindBy(xpath = "//input[@id='Customer Name']")
	private WebElement CustomerNameFieldDropDown;
	public WebElement getCustomerNameFieldDropDown() {
		return CustomerNameFieldDropDown;
	}
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-jd79pv']")
	private WebElement PublishOfferButton;
	public WebElement getPublishOfferButton() {
		return PublishOfferButton;
	}
	@FindBy(xpath = "(//div[@class= 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-sm-4 MuiGrid-grid-md-3 css-pq7chb'])[1]")
	private WebElement FirstSlotSelect;
	public WebElement getFirstSlotSelect() {
		return FirstSlotSelect;
	}
	@FindBy(xpath = "//input[@id='Start time']")
	private WebElement OfferStartTime;
	public WebElement getOfferStartTime() {
		return OfferStartTime;
	}
	@FindBy(xpath = "//input[@id='End time']")
	private WebElement OfferEndTime;
	public WebElement getOfferEndTime() {
		return OfferEndTime;
	}
	@FindBy(xpath = "//div[@id='slots']")
	private WebElement SlotsSelect;
	public WebElement getSlotsSelect() {
		return SlotsSelect;
	}
	@FindBy(xpath = "//li[normalize-space()='Select All']")
	private WebElement SlotsSelectAll;
	public WebElement getSlotsSelectAll() {
		return SlotsSelectAll;
	}
	@FindBy(xpath = "//p[contains(text(),'Submit')]")
	private WebElement SubmitButton;
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
//View Offers Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//div[@id='Offer Status ']")
	private WebElement OfferStatusDropDown;
	public WebElement getOfferStatusDropDown() {
		return OfferStatusDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Active']")
	private WebElement ActiveOption;
	public WebElement getActiveOption() {
		return ActiveOption;
	}
	@FindBy(xpath = "//p[@aria-label='Expired']")
	private WebElement ExpiredOption;
	public WebElement getExpiredOption() {
		return ExpiredOption;
	}
	@FindBy(xpath = "//p[@aria-label='Upcoming']")
	private WebElement UpcomingOption;
	public WebElement getUpcomingOption() {
		return UpcomingOption;
	}
	@FindBy(xpath = "//span[@class = 'css-1k5atgd']")
	private WebElement EditActionOption;
	public WebElement getEditActionOption() {
		return EditActionOption;
	}
	@FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-12xczkh'])[1]")
	private WebElement ActionFromDate;
	public WebElement getActionFromDate() {
		return ActionFromDate;
	}
	@FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-12xczkh'])[2]")
	private WebElement actionToDate;
	public WebElement getActionToDate() {
		return actionToDate;
	}
	@FindBy(xpath = "//input[@id = 'Discount Percentage']")
	private WebElement ActionDiscountPercentage;
	public WebElement getActionDiscountPercentage() {
		return ActionDiscountPercentage;
	}
	@FindBy(xpath = "//input[@id = 'Max Discount Amount']")
	private WebElement ActionMaxDiscounAmount;
	public WebElement getActionMaxDiscounAmount() {
		return ActionMaxDiscounAmount;
	}
	@FindBy(xpath = "//input[@id = 'Usage Limit']")
	private WebElement ActionUsageLimit;
	public WebElement getActionUsageLimit() {
		return ActionUsageLimit;
	}
	@FindBy(xpath = "//input[@id = 'Slot Count']")
	private WebElement actionSlotCount;
	public WebElement getActionSlotCount() {
		return actionSlotCount;
	}
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement ActionUpdate;
	public WebElement getActionUpdate() {
		return ActionUpdate;
	}
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement ActionClose;
	public WebElement getActionClose() {
		return ActionClose;
	}
	@FindBy(xpath = "//button[normalize-space()='Personalised Offer']")
	private WebElement PersonalisedOfferNavigationalBar;
	public WebElement getPersonalisedOfferNavigationalBar() {
		return PersonalisedOfferNavigationalBar;
	}
	@FindBy(xpath = "//div[@id='Published By']")
	private WebElement PublishedByDropDown;
	public WebElement getPublishedByDropDown() {
		return PublishedByDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Admin']")
	private WebElement AdminOption;
	public WebElement getAdminOption() {
		return AdminOption;
	}
	@FindBy(xpath = "//p[@aria-label='Vendor']")
	private WebElement VendorOption;
	public WebElement getVendorOption() {
		return VendorOption;
	}
	@FindBy(xpath = "(//span[@class='css-1fp14yo'])[1]")
	private WebElement FirstOfferDeleteOption;
	public WebElement getFirstOfferDeleteOption() {
		return FirstOfferDeleteOption;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	
	
	
	
	
	
	
	
	
}
