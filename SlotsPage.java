package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlotsPage {

	WebDriver driver;
	public SlotsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//Create Slots Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "//input[@id='Shop Name']")
	private WebElement ShopNameField;
	public WebElement getShopNameField() {
	return ShopNameField;
	}
	@FindBy(xpath = "//input[@id='City']")
	private WebElement CityField;
	public WebElement getCityField() {
	return CityField;
	}
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
	@FindBy(xpath = "//div[@id='Sub-Activity ']")
	private WebElement SubActivityDropDown;
	public WebElement getSubActivityDropDown() {
	return SubActivityDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement BadmintonOption;
	public WebElement getBadmintonOption() {
	return BadmintonOption;
	}
	@FindBy(xpath = "//div[@id='Slot Type']")
	private WebElement SlotTypeDropDown;
	public WebElement getSlotTypeDropDown() {
	return SlotTypeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='BADMINTON']")
	private WebElement SlotTypeBadmintonOption;
	public WebElement getSlotTypeBadmintonOption() {
	return SlotTypeBadmintonOption;
	}
	@FindBy(xpath = "//input[@id='Effective From Date']")
	private WebElement EffectiveFromDateField;
	public WebElement getEffectiveFromDateField() {
	return EffectiveFromDateField;
	}
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement FromDateCalenderButtonIcon;
	public WebElement getFromDateCalenderButtonIcon() {
		return FromDateCalenderButtonIcon;
	}
	@FindBy(xpath = "//input[@id='Effective To Date']")
	private WebElement EffectiveToDateField;
	public WebElement getEffectiveToDateField() {
	return EffectiveToDateField;
	}
	@FindBy(xpath = "(//button[@type='button'])[7]")
	private WebElement ToDateCalenderButton;
	public WebElement getToDateCalenderButton() {
		return ToDateCalenderButton;
	}
	@FindBy(xpath = "//div[@id='Slot Genration type']")
	private WebElement SlotGenerationTypeDropDown;
	public WebElement getSlotGenerationTypeDropDown() {
		return SlotGenerationTypeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Auto generation']")
    private WebElement AutoGenerationType;
	public WebElement getAutoGenerationType() {
		return AutoGenerationType;
	}
	@FindBy(xpath = "//p[@aria-label='Manual generation']")
	private WebElement ManualGenerationType;
	public WebElement getManualGenerationType() {
		return ManualGenerationType;
	}
	@FindBy(xpath = "//input[@id='Slot starts from']")
	private WebElement SlotStartingTime;
	public WebElement getSlotStartingTime() {
		return SlotStartingTime;
	}
	@FindBy(xpath = "//input[@id='Slot ends at']")
	private WebElement SlotEndingTime;
	public WebElement getSlotEndingTime() {
		return SlotEndingTime;
	}
	@FindBy(xpath = "//input[@id='Duration in minutes']")
	private WebElement DurationInMinutes;
	public WebElement getDurationInMinutes() {
		return DurationInMinutes;
	}
	@FindBy(xpath = "//div[contains(@id,'Slot Reccurance')]")
	private WebElement SlotReccurenceDropDown;
	public WebElement getSlotReccurenceDropDown() {
		return SlotReccurenceDropDown;
	}
	@FindBy(xpath = "//input[contains(@id,'No. of courts')]")
	private WebElement NoOfCourtsField;
	public WebElement getNoOfCourtsField() {
		return NoOfCourtsField;
	}
	@FindBy(xpath = "//input[contains(@id,'Cost')]")
	private WebElement CostField;
	public WebElement getCostfield() {
		return CostField;
	}
	@FindBy(xpath = "//p[contains(text(),'Generate Slots')]")
	private WebElement GenerateSlotsButton;
	public WebElement getGenerateSlotsButton() {
		return GenerateSlotsButton;
	}
	@FindBy(xpath = "//p[contains(text(),'Create')]")
	private WebElement CreateSlotsButton;
	public WebElement getCreateSlotsButton() {
		return CreateSlotsButton;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Generate Slot')]")
	private WebElement GenerateSlotButton;
	public WebElement getGenerateSlotButton() {
		return GenerateSlotButton;
	}
	@FindBy(xpath = "//p[contains(text(),'Add Slot')]")
	private WebElement AddSlotButton;
	public WebElement getAddSlotButton() {
		return AddSlotButton;
	}
	@FindBy(xpath = "//p[contains(text(),'View Slot')]")
	private WebElement ViewSlotButton;
	public WebElement getViewSlotButton() {
		return ViewSlotButton;
	}
	@FindBy(xpath = "//div[@class='MuiStack-root css-wkpw2c']//*[name()='svg']")
	private WebElement RemoveSlotButton;
	public WebElement getRemoveSlotButton() {
		return RemoveSlotButton;
	}
	
	@FindBy(xpath = "//span[text()='ALL_DAYS']")
	private WebElement AlldaysCheckBox;
	public WebElement getAlldaysCheckBox() {
		return AlldaysCheckBox;
	}
	@FindBy(xpath = "//span[text()='MONDAY']")
	private WebElement MondayCheckBox;
	public WebElement getMondayCheckBox() {
		return MondayCheckBox;
	}
	@FindBy(xpath = "//span[text()='TUESDAY']")
	private WebElement TuesdayCheckBox;
	public WebElement getTuesdayCheckBox() {
		return TuesdayCheckBox;
	}
	@FindBy(xpath = "//span[text()='WEDNESDAY']")
	private WebElement WednesdayCheckBox;
	public WebElement getWednesdayCheckBox() {
		return WednesdayCheckBox;
	}
	@FindBy(xpath = "//span[text()='THURSDAY']")
	private WebElement ThursdayCheckBox;
	public WebElement getThursdayCheckBox() {
		return ThursdayCheckBox;
	}
	@FindBy(xpath = "//span[text()='FRIDAY']")
	private WebElement FridayCheckBox;
	public WebElement getFridayCheckBox() {
		return FridayCheckBox;
	}
	@FindBy(xpath = "//span[text()='SATURDAY']")
	private WebElement SaturdayCheckBox;
	public WebElement getSaturdayCheckBox() {
		return SaturdayCheckBox;
	}
	@FindBy(xpath = "//span[text()='SUNDAY']")
	private WebElement SundayCheckBox;
	public WebElement getSundayCheckBox() {
		return SundayCheckBox;
	}
	@FindBy(xpath = "//span[text()='WEEKDAYS']")
	private WebElement WeekDaysCheckBox;
	public WebElement getWeekDaysCheckBox() {
		return WeekDaysCheckBox;
	}
	@FindBy(xpath = "//span[text()='WEEKEND']")
	private WebElement WeekEndcheckbox;
	public WebElement getWeekEndcheckbox() {
		return WeekEndcheckbox;
	}
	@FindBy(xpath = "//button[@title='Next month']//*[name()='svg']")
	private WebElement RightArrowButton;
	public WebElement getRightArrowButton() {
		return RightArrowButton;
	}
	@FindBy(xpath = "(//div[@class='MuiPickersCalendarHeader-labelContainer css-195v8y8'])[1]")
	private WebElement MonthYearText;
	public WebElement getMonthYearText() {
		return MonthYearText;
	}
	@FindBy(xpath = "//*[@data-testid=\"ArrowLeftIcon\"]")
	private WebElement leftArrowButton;
	public WebElement getleftArrowButton() {
		return leftArrowButton;
	}
	@FindBy(xpath = "//p[@aria-label='COURSE']")
	private WebElement CourseSlotType;
	public WebElement getCourseSlotType() {
		return CourseSlotType;
	}
	@FindBy(xpath = "//input[@id='Registration End Date']")
	private WebElement RegistrationEndDate;
	public WebElement getRegistrationEndDate() {
		return RegistrationEndDate;
	}
	@FindBy(xpath = "//input[@id='Course Name']")
	private WebElement CourseName;
	public WebElement getCourseName() {
		return CourseName;
	}
	@FindBy(xpath = "//input[@id='Course Start Date']")
	private WebElement CourseStartDateField;
	public WebElement getCourseStartDateField() {
		return CourseStartDateField;
	}
	@FindBy(xpath = "//input[@id='Course End Date']")
	private WebElement CourseEndDateField;
	public WebElement getCourseEndDateField() {
		return CourseEndDateField;
	}
	@FindBy(xpath = "//textarea[@id='Guidelines']")
	private WebElement Guidelines;
	public WebElement getGuidelines() {
		return Guidelines;
	}
	@FindBy(xpath = "//input[@id='Maximum Allowed']")
	private WebElement MaximumAllowed;
	public WebElement getMaximumAllowed() {
		return MaximumAllowed;
	}
	@FindBy(xpath = "//button[normalize-space()='View Slots (1)']")
	private WebElement ViewSlotCourse;
	public WebElement getViewSlotCourse() {
		return ViewSlotCourse;
	}
	@FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-f9ajrd']//span[@class='css-199trak']")
	private WebElement removeaction;
	public WebElement getRemoveaction() {
		return removeaction;
	}
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement OkButton;
	public WebElement getOkButton() {
		return OkButton;
	}
////////////////////////////////////////////////////////////////////////////////////////////////
//View Slots Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "(//span[@class='css-1k5atgd'])[1]")
	private WebElement EditFirstButton;
	public WebElement getEditFirstButton() {
		return EditFirstButton;
	}
	@FindBy(xpath = "(//span[@class='css-1k5atgd'])[2]")
	private WebElement EditSecondButton;
	public WebElement getEditSecondButton() {
		return EditSecondButton;
	}
	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement FromDateCalender;
	public WebElement getFromDateCalender() {
		return FromDateCalender;
	}
	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement ToDateCalender;
	public WebElement getToDateCalender() {
		return ToDateCalender;
	}
	@FindBy(xpath = "//p[text()='Update']")
	private WebElement UpdateButton;
	public WebElement getUpdateButton() {
		return UpdateButton;
	}
	@FindBy(xpath = "//button[@title='Go to previous page']")
	private WebElement LeftArrow;
	public WebElement getLeftArrow() {
		return LeftArrow;
	}
	@FindBy(xpath = "//button[@title='Go to next page']")
	private WebElement RightArrow;
	public WebElement getRightArrow() {
		return RightArrow;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////
//Block Slots Xpath.
////////////////////////////////////////////////////////////////////////////////////////////////
	@FindBy(xpath = "(//button[@type = 'button'])[4]")
	private WebElement DateIconButton;
	public WebElement getDateIconButton() {
		return DateIconButton;
	}
	@FindBy(xpath = "(//button[contains(text(),'2')])[1]")
	private WebElement SelectDateAs2;
	public WebElement getSelectDateAs2() {
		return SelectDateAs2;
	}
	@FindBy(xpath = "//button[normalize-space()='Multiple Block']")
	private WebElement MultipleBlockButton;
	public WebElement getMultipleBlockButton() {
		return MultipleBlockButton;
	}
	@FindBy(xpath = "//button[normalize-space()='Multiple UnBlock']")
    private WebElement MultipleUnblock;
	public WebElement getMultipleUnblock() {
		return MultipleUnblock;
	}
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement SelectAllCheckBox;
	public WebElement getSelectAllCheckBox() {
		return SelectAllCheckBox;
	}
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement FirstCheckBox;
	public WebElement getFirstCheckBox() {
		return FirstCheckBox;
	}
	@FindBy(xpath = "(//span[@class = 'css-1k5atgd'])[1]")
	private WebElement FirstBlockOrUnblockSymbol;
	public WebElement getFirstBlockOrUnblockSymbol() {
		return FirstBlockOrUnblockSymbol;
	}
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[4]")
	private WebElement FromDateCalenderPopUp;
	public WebElement getFromDateCalenderPopUp() {
		return FromDateCalenderPopUp;
	}
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[5]")
	private WebElement ToDateCalenderPopUp;
	public WebElement getToDateCalenderPopUp() {
		return ToDateCalenderPopUp;
	}
	@FindBy(xpath = "//input[@class = 'MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")
	private WebElement CommentTexArea;
	public WebElement getCommentTexArea() {
		return CommentTexArea;
	}
	@FindBy(xpath = "//div[@id='demo-simple-select']")	
	private WebElement LayoutButtonPopUp;
   	public WebElement getLayoutButtonPopUp() {
   		return LayoutButtonPopUp;
   	}	
   	@FindBy(xpath = "//button[normalize-space()='Confirm']")	
	private WebElement ConfirmButtonPopUp;
   	public WebElement getConfirmButtonPopUp() {
   		return ConfirmButtonPopUp;
   	}
  
////////////////////////////////////////////////////////////////////////////////////////////////	
}
