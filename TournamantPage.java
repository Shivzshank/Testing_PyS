package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TournamantPage {

	WebDriver driver;
	public TournamantPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Tournamant Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Name Of The Tournament']")
	private WebElement NameOfTheTournament;
	public WebElement getNameOfTheTournament() {
		return NameOfTheTournament;	
	}
	@FindBy(xpath = "(//button[@type = 'button'])[4]")
	private WebElement FromDateIcon;
	public WebElement getFromDateIcon() {
		return FromDateIcon;	
	}
	@FindBy(xpath = "(//button[@type = 'button'])[5]")
	private WebElement ToDateIcon;
	public WebElement getToDateIcon() {
		return ToDateIcon;	
	}
	@FindBy(xpath = "//input[@id='Organizer1 Number']")
	private WebElement Organizer1NumberField;
	public WebElement getOrganizer1NumberField() {
		return Organizer1NumberField;	
	}
	@FindBy(xpath = "//input[@id='Organizer2 Number']")
	private WebElement Organizer2NumberField;
	public WebElement getOrganizer2NumberField() {
		return Organizer2NumberField;	
	}
	@FindBy(xpath = "//input[@placeholder= 'Type Address']")
	private WebElement AddressField;
	public WebElement getAddressField() {
		return AddressField;	
	}
	@FindBy(xpath = "//input[@id='formFileSm']")
	private WebElement UploadFileField;
	public WebElement getUploadFileField() {
		return UploadFileField;	
	}
	@FindBy(xpath = "//input[@id='Category']")
	private WebElement CategoryField;
	public WebElement getCategoryField() {
		return CategoryField;	
	}
	@FindBy(xpath = "//input[@id='Category Type']")
	private WebElement CategoryTypeField;
	public WebElement getCategoryTypeField() {
		return CategoryTypeField;	
	}
	@FindBy(xpath = "//input[@id='Court Type']")
	private WebElement CourtTypeField;
	public WebElement getCourtTypeField() {
		return CourtTypeField;	
	}
	@FindBy(xpath = "//input[@id='Enrollment Fee']")
	private WebElement EnrollmentFeeField;
	public WebElement getEnrollmentFeeField() {
		return EnrollmentFeeField;	
	}
	@FindBy(xpath = "//textarea[@placeholder= 'Type in here...']")
	private WebElement RulesField;
	public WebElement getRulesField() {
		return RulesField;	
	}
	@FindBy(xpath = "//textarea[@placeholder= 'Type in here']")
	private WebElement DescreptionField;
	public WebElement getDescreptionField() {
		return DescreptionField;	
	}
	@FindBy(xpath = "//input[@id=':rfj:']")
	private WebElement PrizeField;
	public WebElement getPrizeField() {
		return PrizeField;	
	}
	@FindBy(xpath = "(//button[@type= 'button'])[6]")
	private WebElement PrizePlusButton;
	public WebElement getPrizePlusButton() {
		return PrizePlusButton;	
	}
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	private WebElement CreateButton;
	public WebElement getCreateButton() {
		return CreateButton;	
	}

////////////////////////////////////////////////////////////////////////////////////////////////
//View Tournamant Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "(//input[@class = 'PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]")
	private WebElement ActivationAndDeactivationButton;
	public WebElement getActivationAndDeactivationButton() {
		return ActivationAndDeactivationButton;	
	}
	@FindBy(xpath = "(//button[@type = 'button'])[4]")
	private WebElement EditButton;
	public WebElement getEditButton() {
		return EditButton;	
	}
	@FindBy(xpath = "(//button[@type = 'button'])[5]")
	private WebElement DeleteButton;
	public WebElement getDeleteButton() {
		return DeleteButton;	
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}