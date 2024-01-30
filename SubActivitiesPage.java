package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubActivitiesPage {

	WebDriver driver;
	public SubActivitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Sub-Activities Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "//input[@id='Sub Activity Name']")
	private WebElement SubActivityNameField;
	public WebElement getSubActivityNameField() {
	return SubActivityNameField;
	}
	@FindBy(xpath = "//input[@id='Description']")
	private WebElement DescriptionField;
	public WebElement getDescriptionField() {
	return DescriptionField;
	}
	@FindBy(xpath = "//input[@id='Priority']")
	private WebElement PriorityField;
	public WebElement getPriorityField() {
	return PriorityField;
	}
	@FindBy(xpath = "//input[@id='formFile']")
	private WebElement ChooseFileField;
	public WebElement getChooseFileField() {
	return ChooseFileField;
	}
	@FindBy(xpath = "//span[normalize-space()='PRE DEFINED SLOT']")
	private WebElement PreDefinedSlotCheckBox;
	public WebElement getPreDefinedSlotCheckBox() {
	return PreDefinedSlotCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='NET PRACTICE']")
	private WebElement NetPracticeCheckBox;
	public WebElement getNetPracticeCheckBox() {
	return NetPracticeCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='NET_PRACTICE']")
	private WebElement NetPractice1CheckBox;
	public WebElement getNetPractice1CheckBox() {
	return NetPractice1CheckBox;
	}
	
	@FindBy(xpath = "//span[normalize-space()='BADMINTON']")
	private WebElement BadmintonCheckBox;
	public WebElement getBadmintonCheckBox() {
	return BadmintonCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='COURSE']")
	private WebElement CoursesCheckBox;
	public WebElement getCoursesCheckBox() {
	return CoursesCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='MEMBERSHIP']")
	private WebElement MembershipCheckBox;
	public WebElement getMembershipCheckBox() {
	return MembershipCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='CONSECUTIVE']")
	private WebElement ConsecutiveCheckBox;
	public WebElement getConsecutiveCheckBox() {
	return ConsecutiveCheckBox;
	}
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-jd79pv']")
	private WebElement CreateButton;
	public WebElement getCreateButton() {
	return CreateButton;
	}
///////////////////////////////////////////////////////////////////////////////////////////////

//View Sub-Activities Xpath.
///////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@placeholder='Search Sub Activity']")
	private WebElement SearchSubActivityField;
	public WebElement getSearchSubActivityField() {
	return SearchSubActivityField;
	}
	@FindBy(xpath = "(//h6[contains(text(),'Edit')])[1]")
	private WebElement FirstEditButton;
	public WebElement getFirstEditButton() {
	return FirstEditButton;
	}
	@FindBy(xpath = "(//h6[contains(text(),'Edit')])[2]")
	private WebElement SecondEditButton;
	public WebElement getSecondEditButton() {
	return SecondEditButton;
	}
	@FindBy(xpath = "(//h6[contains(text(),'Edit')])[3]")
	private WebElement ThirdEditButton;
	public WebElement getThirdEditButton() {
	return ThirdEditButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Sub-Activity Details']")
	private WebElement SubActivityDetailsNavigationButton;
	public WebElement getSubActivityDetailsNavigationButton() {
	return SubActivityDetailsNavigationButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Slot Type']")
	private WebElement SlotTypeNavigationButton;
	public WebElement getSlotTypeNavigationButton() {
	return SlotTypeNavigationButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement UpdateButton;
	public WebElement getUpdateButton() {
	return UpdateButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Update Mapping']")
	private WebElement UpdateMappingButton;
	public WebElement getUpdateMappingButton() {
	return UpdateMappingButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Close']")
	private WebElement CloseButton;
	public WebElement getCloseButton() {
	return CloseButton;
	}
	@FindBy(xpath = "//div[@id='Slot Types']")
	private WebElement SlotTypesDropDown;
	public WebElement getSlotTypesDropDown() {
	return SlotTypesDropDown;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////		
}
