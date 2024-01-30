package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.SubActivitiesPage;

public class SubActivities extends Baseclass {
	@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();
	HomePage HomePage = new HomePage(driver);
	HomePage.getSubActivities().click();
	}
	
@Test(priority = 1, enabled = true)
	public void CreateSubActivities01() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateSubActivities().click();
	SubActivitiesPage SubActivitiesPage = new SubActivitiesPage(driver);
	SubActivitiesPage.getSubActivityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityName1"));
	SubActivitiesPage.getDescriptionField().click();RobotClearingField();
	SubActivitiesPage.getDescriptionField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityDescription"));
	SubActivitiesPage.getPriorityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Priority"));
	SubActivitiesPage.getChooseFileField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityImage"));
	SubActivitiesPage.getPreDefinedSlotCheckBox().click();
	SubActivitiesPage.getCoursesCheckBox().click();
	SubActivitiesPage.getMembershipCheckBox().click();
	SubActivitiesPage.getCreateButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/SubActivities/001CreatingNewSubActivity.png");
	}
	
@Test(priority = 2, enabled = true)
	public void ViewSubActivities01() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewSubActivities().click();
	SubActivitiesPage SubActivitiesPage = new SubActivitiesPage(driver);
	SubActivitiesPage.getSearchSubActivityField().click();Thread.sleep(500);
	RobotTypeTest();RobotExitLockingKeys();Thread.sleep(2000);
	SubActivitiesPage.getFirstEditButton().click();
	SubActivitiesPage.getSubActivityNameField().click();RobotClearingField();
	SubActivitiesPage.getSubActivityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityName2"));
	SubActivitiesPage.getPriorityField().click();RobotClearingField();Thread.sleep(250);
	SubActivitiesPage.getPriorityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("PriorityEdit"));
	SubActivitiesPage.getChooseFileField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityImageEdit1"));
//	SubActivitiesPage.getUpdateButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/SubActivities/002UpdatingNewSubActivity.png");
	driver.navigate().refresh();Thread.sleep(2000);
	SubActivitiesPage.getSearchSubActivityField().click();Thread.sleep(500);
	RobotTypeTest();RobotExitLockingKeys();Thread.sleep(2000);
	SubActivitiesPage.getFirstEditButton().click();
	SubActivitiesPage.getSubActivityNameField().click();RobotClearingField();
	SubActivitiesPage.getSubActivityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityName3"));
	SubActivitiesPage.getPriorityField().click();RobotClearingField();Thread.sleep(250);
	SubActivitiesPage.getPriorityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Priority"));
	SubActivitiesPage.getChooseFileField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SubActivityImageEdit2"));
//	SubActivitiesPage.getUpdateButton().click();Thread.sleep(1000);
	}
	
@Test(priority = 3, enabled = true)
	public void ViewSubActivities02() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewSubActivities().click();
	SubActivitiesPage SubActivitiesPage = new SubActivitiesPage(driver);
	SubActivitiesPage.getSearchSubActivityField().click();Thread.sleep(500);
	RobotTypeTest();RobotExitLockingKeys();Thread.sleep(2000);
	SubActivitiesPage.getFirstEditButton().click();
	SubActivitiesPage.getSlotTypeNavigationButton().click();Thread.sleep(500);
	SubActivitiesPage.getSlotTypesDropDown().click();Thread.sleep(500);
	SubActivitiesPage.getCoursesCheckBox().click();
	SubActivitiesPage.getMembershipCheckBox().click();RobotEscape();
//	SubActivitiesPage.getUpdateMappingButton().click();
	TakeScreenShot("./ScreenShots/SubActivities/003UpdateMappingInSubActivity.png");
	driver.navigate().refresh();Thread.sleep(2000);
	SubActivitiesPage.getSearchSubActivityField().click();Thread.sleep(500);
	RobotTypeTest();RobotExitLockingKeys();Thread.sleep(2000);
	SubActivitiesPage.getFirstEditButton().click();
	SubActivitiesPage.getSlotTypeNavigationButton().click();Thread.sleep(500);
	SubActivitiesPage.getSlotTypesDropDown().click();Thread.sleep(500);
	SubActivitiesPage.getCoursesCheckBox().click();
	SubActivitiesPage.getMembershipCheckBox().click();RobotEscape();
//	SubActivitiesPage.getUpdateMappingButton().click();
	
	}	
	
	
@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}
}
