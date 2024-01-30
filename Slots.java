package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.SlotsPage;

public class Slots extends Baseclass {

@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();	
	HomePage HomePage = new HomePage(driver);
	HomePage.getSlots().click();
	}
	
@Test(priority = 1, enabled = true, invocationCount = 1)
	public void CreateSlots01() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateSlots().click();
	SlotsPage SlotsPage = new SlotsPage(driver);
	TestShopName001VendorSearch();
	SlotsPage.getSubActivityDropDown().click();Thread.sleep(250);
	SlotsPage.getBadmintonOption().click();
	SlotsPage.getSlotTypeDropDown().click();Thread.sleep(250);
	SlotsPage.getSlotTypeBadmintonOption().click();
	SlotsPage.getEffectiveFromDateField().click();
	RobotForwardTab();RobotEnter();Thread.sleep(250);
	EffectiveFromDateCalender(fileUtils.ReadDataFromTestingDataFile("EffectiveSlotStartDate1"), 
			fileUtils.ReadDataFromTestingDataFile("EffectiveSlotMonthYear1"));
	SlotsPage.getEffectiveToDateField().click();
	RobotForwardTab();RobotEnter();Thread.sleep(250);
	EffectiveToDateCalender(fileUtils.ReadDataFromTestingDataFile("EffectiveSlotEndDate1"), 
			fileUtils.ReadDataFromTestingDataFile("EffectiveSlotMonthYear1"));
	SlotsPage.getSlotStartingTime().click();RobotClearingField();
	SlotsPage.getSlotStartingTime().sendKeys(fileUtils.ReadDataFromTestingDataFile("SlotStartTime1"));
	SlotsPage.getSlotEndingTime().click();RobotClearingField();
	SlotsPage.getSlotEndingTime().sendKeys(fileUtils.ReadDataFromTestingDataFile("SlotEndTime1"));
	SlotsPage.getDurationInMinutes().sendKeys(fileUtils.ReadDataFromTestingDataFile("DurationInMinutes1"));
	SlotsPage.getSlotReccurenceDropDown().click();Thread.sleep(250);ScrollWindow();
	ChoosingDaysForSlotsPage(9);RobotEscape();Thread.sleep(250);
	SlotsPage.getNoOfCourtsField().sendKeys(fileUtils.ReadDataFromTestingDataFile("Courts"));
	SlotsPage.getCostfield().sendKeys(fileUtils.ReadDataFromTestingDataFile("Cost"));
	SlotsPage.getGenerateSlotButton().click();Thread.sleep(1000);
//	SlotsPage.getCreateSlotsButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/Slots/001CreateSlotsBadmintonAutoGenetation.png");
	}
	
@Test(priority = 2, enabled = true, invocationCount = 1)
	public void CreateSlots02() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateSlots().click();
	SlotsPage SlotsPage = new SlotsPage(driver);
	TestShopName001VendorSearch();
	SlotsPage.getSubActivityDropDown().click();Thread.sleep(250);
	SlotsPage.getBadmintonOption().click();Thread.sleep(250);
	SlotsPage.getSlotTypeDropDown().click();Thread.sleep(250);
	SlotsPage.getSlotTypeBadmintonOption().click();Thread.sleep(250);
	SlotsPage.getEffectiveFromDateField().click();
	RobotForwardTab();RobotEnter();Thread.sleep(250);
	EffectiveFromDateCalender(fileUtils.ReadDataFromTestingDataFile("EffectiveSlotStartDate1"), 
			fileUtils.ReadDataFromTestingDataFile("EffectiveSlotMonthYear1"));
	SlotsPage.getEffectiveToDateField().click();
	RobotForwardTab();RobotEnter();Thread.sleep(250);
	EffectiveToDateCalender(fileUtils.ReadDataFromTestingDataFile("EffectiveSlotEndDate1"), 
			fileUtils.ReadDataFromTestingDataFile("EffectiveSlotMonthYear1"));
	SlotsPage.getSlotGenerationTypeDropDown().click();Thread.sleep(500);
	SlotsPage.getManualGenerationType().click();Thread.sleep(750);
	SlotsPage.getSlotReccurenceDropDown().click();Thread.sleep(250);ScrollWindow();
	ChoosingDaysForSlotsPage(9);RobotEscape();Thread.sleep(250);
	SlotsPage.getNoOfCourtsField().sendKeys(fileUtils.ReadDataFromTestingDataFile("Courts"));
	SlotsPage.getCostfield().sendKeys(fileUtils.ReadDataFromTestingDataFile("Cost"));
	SlotsPage.getSlotStartingTime().click();RobotClearingField();
	SlotsPage.getSlotStartingTime().sendKeys(fileUtils.ReadDataFromTestingDataFile("SlotStartTime1"));
	SlotsPage.getSlotEndingTime().click();RobotClearingField();
	SlotsPage.getSlotEndingTime().sendKeys(fileUtils.ReadDataFromTestingDataFile("SlotEndTimeManual"));
	Thread.sleep(500);SlotsPage.getAddSlotButton().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/Slots/002CreateSlotsBadmintonManualGenetation01.png");
	SlotsPage.getViewSlotButton().click();Thread.sleep(1500);
	SlotsPage.getRemoveSlotButton().click();Thread.sleep(500);
	TakeScreenShot("./ScreenShots/Slots/002CreateSlotsBadmintonManualGenetation02.png");
	SlotsPage.getConfirmButtonPopUp().click();Thread.sleep(500);
	SlotsPage.getAddSlotButton().click();Thread.sleep(1500);
	SlotsPage.getViewSlotButton().click();Thread.sleep(1500);
//	SlotsPage.getCreateSlotsButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/Slots/002CreateSlotsBadmintonManualGenetation03.png");
}

@Test(priority = 3, enabled = true, invocationCount = 1)
	public void CreateSlots03() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateSlots().click();
	SlotsPage SlotsPage = new SlotsPage(driver);
	SlotsPage.getSubActivityDropDown().click();
	SlotsPage.getBadmintonOption().click();Thread.sleep(1000);
	SlotsPage.getSlotTypeDropDown().click();
	SlotsPage.getCourseSlotType().click();
	SlotsPage.getRegistrationEndDate().click();RobotForwardTab();RobotEnter();
	EffectiveFromDateCalender(fileUtils.ReadDataFromTestingDataFile("RegistrationEndDate"), 
			fileUtils.ReadDataFromTestingDataFile("RegistrationEndMonthAndYear"));
	SlotsPage.getCourseName().sendKeys(fileUtils.ReadDataFromTestingDataFile("CourseName"));
	SlotsPage.getMaximumAllowed().sendKeys(fileUtils.ReadDataFromTestingDataFile("MaximumAllowed"));
	SlotsPage.getCourseStartDateField().click();RobotForwardTab();RobotEnter();
	EffectiveFromDateCalender(fileUtils.ReadDataFromTestingDataFile("CourseStartDate"), 
			fileUtils.ReadDataFromTestingDataFile("CourseMonthYear"));
	SlotsPage.getCourseEndDateField().click();RobotForwardTab();RobotEnter();Thread.sleep(500);
	EffectiveToDateCalender(fileUtils.ReadDataFromTestingDataFile("CourseEndDate"), 
			fileUtils.ReadDataFromTestingDataFile("CourseMonthYear"));
	SlotsPage.getSlotReccurenceDropDown().click();
	ChoosingDaysForSlotsPage(1);;RobotEscape();
	SlotsPage.getSlotStartingTime().sendKeys(fileUtils.ReadDataFromTestingDataFile("SlotStartTime2"));
	SlotsPage.getSlotEndingTime().sendKeys(fileUtils.ReadDataFromTestingDataFile("SlotEndTime2"));
	SlotsPage.getCostfield().sendKeys(fileUtils.ReadDataFromTestingDataFile("Cost"));
	SlotsPage.getGuidelines().sendKeys(fileUtils.ReadDataFromTestingDataFile("Guidelines2"));
//	TakeScreenShot("./ScreenShots/Slots/003CreateSlotsCourses.png");
	}

//@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}	
}
