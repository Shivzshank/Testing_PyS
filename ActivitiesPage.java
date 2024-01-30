package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage {
	WebDriver driver;
	public ActivitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Activities Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
@FindBy(xpath = "//input[@id='Activity Name']")
	private WebElement ActivityNameField;
	public WebElement getActivityNameField() {
	return ActivityNameField;
}
	@FindBy(xpath = "//input[@id='Description']")
	private WebElement ActivityDescriptionField;
	public WebElement getActivityDescriptionField() {
	return ActivityDescriptionField;
}	
	@FindBy(xpath = "//input[@id='Priority']")
	private WebElement ActivityPriorityField;
	public WebElement getActivityPriorityField() {
	return ActivityPriorityField;
}	
	@FindBy(xpath = "//input[@id='formFile']")
	private WebElement ChooseFile;
	public WebElement getChooseFile() {
	return ChooseFile;
}	
	@FindBy(xpath = "//p[contains(text(),'Create')]")
	private WebElement CreateButton;
	public WebElement getCreateButton() {
	return CreateButton;
}	
	@FindBy(xpath = "(//button[@type = 'button'])[5]")
	private WebElement FirstActivityEditButton;
	public WebElement getFirstActivityEditButton() {
	return FirstActivityEditButton;
}	
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement ActivityUpdateButton;
	public WebElement getActivityUpdateButton() {
	return ActivityUpdateButton;
}	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement ActivityCloseButton;
	public WebElement getActivityCloseButton() {
	return ActivityCloseButton;
}
///////////////////////////////////////////////////////////////////////////////////////////////

//Map Sub-Activities Xpath.
///////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//div[@id='Activity']")
	private WebElement ActivityDropDown;
	public WebElement getActivityDropDown() {
	return ActivityDropDown;
}
	@FindBy(xpath = "//p[@aria-label='Test']")
	private WebElement TestOption;
	public WebElement getTestOption() {
	return TestOption;
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
	@FindBy(xpath = "(//button[@type = 'button'])[4]")
	private WebElement MapButton;
	public WebElement getMapButton() {
	return MapButton;
}
///////////////////////////////////////////////////////////////////////////////////////////////	
	
}
