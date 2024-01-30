package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildSubActivitiesPage {

	WebDriver driver;
	public ChildSubActivitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Child Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//div[@id='Parent Sub Activity']")
	private WebElement ParentSubActivityDropDown;
	public WebElement getParentSubActivityDropDown() {
	return ParentSubActivityDropDown;
	}
	@FindBy(xpath = "//input[@placeholder ='Search']")
	private WebElement SearchInDropDown;
	public WebElement getSearchInDropDown() {
	return SearchInDropDown;
	}
	@FindBy(xpath = "(//li[@role='option'])[1]")
	private WebElement FirstOptionInDropDown;
	public WebElement getFirstOptionInDropDown() {
	return FirstOptionInDropDown;
	}
	@FindBy(xpath = "//span[normalize-space()='Hair Cut Test']")
	private WebElement HairCutTestCheckBox;
	public WebElement getHairCutTestCheckBox() {
	return HairCutTestCheckBox;
	}
	@FindBy(xpath = "//span[normalize-space()='Adults']")
	private WebElement AdultsCheckBox;
	public WebElement getAdultsCheckBox() {
	return AdultsCheckBox;
	}
	@FindBy(xpath = "//p[contains(text(),'Map Child Sub Activities')]")
	private WebElement MapChildSubActivitiesButton;
	public WebElement getMapChildSubActivitiesButton() {
	return MapChildSubActivitiesButton;
	}
////////////////////////////////////////////////////////////////////////////////////////////////	
//View Child Mapping Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath = "//p[normalize-space()='Colouring']")
	private WebElement ColouringButton;
	public WebElement getColouringButton() {
	return ColouringButton;
	}
	@FindBy(xpath = "//p[normalize-space()='Hair Cut Kid']")
	private WebElement HairCutKidChildActivityBox;
	public WebElement getHairCutKidChildActivityBox() {
	return HairCutKidChildActivityBox;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Adults']")
	private WebElement AdultsChildActivityBox;
	public WebElement getAdultsChildActivityBox() {
	return AdultsChildActivityBox;
	}
	@FindBy(xpath = "//p[normalize-space()='Kids Gym']")
	private WebElement KidsGymChildActivityBox;
	public WebElement getKidsGymChildActivityBox() {
	return KidsGymChildActivityBox;
	}
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[27]")
	private WebElement AdultsRemovalOption;
	public WebElement getAdultsRemovalOption() {
	return AdultsRemovalOption;
	}
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 css-7721ce']//div[2]//div[1]//*[name()='svg']")
	private WebElement HairCutTestRemovalOption;
	public WebElement getHairCutTestRemovalOption() {
	return HairCutTestRemovalOption;
	}
	@FindBy(xpath = "//button[normalize-space()='confirm']")
	private WebElement ConfirmButton;
	public WebElement getConfirmButton() {
	return ConfirmButton;
	}
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement OkButton;
	public WebElement getOkButton() {
	return OkButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement CancelButton;
	public WebElement getCancelButton() {
	return CancelButton;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
}
