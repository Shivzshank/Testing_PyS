package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.ActivitiesPage;
import com.cotyledon.pys.pomrepository.HomePage;

public class Activities extends Baseclass{

@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();
	HomePage HomePage = new HomePage(driver);
	HomePage.getActivities().click();
	}

@Test(priority = 1, enabled = true)
	public void CreateActivities01() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateActivities().click();
	ActivitiesPage ActivitiesPage = new ActivitiesPage(driver);
	ActivitiesPage.getActivityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityName1"));
	ActivitiesPage.getActivityDescriptionField().click();
	RobotClearingField();
	ActivitiesPage.getActivityDescriptionField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityDescription"));
	ActivitiesPage.getActivityPriorityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Priority"));
	ActivitiesPage.getChooseFile().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityImage"));
	ActivitiesPage.getCreateButton().click();
	TakeScreenShot("./ScreenShots/Activities/001CreatingNewActivity.png");
	}
	
@Test(priority = 2, enabled = true)
	public void CreateActivities02() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateActivities().click();
	ActivitiesPage ActivitiesPage = new ActivitiesPage(driver);
	ActivitiesPage.getFirstActivityEditButton().click();
	ActivitiesPage.getActivityNameField().click();
	RobotClearingField();
	ActivitiesPage.getActivityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityNameEdit"));
	ActivitiesPage.getActivityPriorityField().click();
	RobotClearingField();
	ActivitiesPage.getActivityPriorityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("PriorityEdit"));
	ActivitiesPage.getChooseFile().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityImageEdit1"));
	ActivitiesPage.getActivityUpdateButton().click();Thread.sleep(500);
	TakeScreenShot("./ScreenShots/Activities/002EditingExistingActivity.png");
	driver.navigate().refresh();Thread.sleep(2000);
	ActivitiesPage.getFirstActivityEditButton().click();
	ActivitiesPage.getActivityNameField().click();
	RobotClearingField();
	ActivitiesPage.getActivityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityName2"));
	ActivitiesPage.getActivityPriorityField().click();
	RobotClearingField();
	ActivitiesPage.getActivityPriorityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Priority"));
	ActivitiesPage.getChooseFile().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ActivityImageEdit2"));
	ActivitiesPage.getActivityUpdateButton().click();
	}
	
@Test(priority = 3, enabled = true)
	public void MapSubActivity01() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getMapSubActivities().click();
	ActivitiesPage ActivitiesPage = new ActivitiesPage(driver);
	ActivitiesPage.getActivityDropDown().click();Thread.sleep(500);
	ActivitiesPage.getTestOption().click();
	ActivitiesPage.getBadmintonCheckBox().click();
	ActivitiesPage.getMapButton().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/Activities/003MappingActiviyToSubActivity.png");
	driver.navigate().refresh();Thread.sleep(2000);
	ActivitiesPage.getActivityDropDown().click();Thread.sleep(500);
	ActivitiesPage.getTestOption().click();
	ActivitiesPage.getBadmintonCheckBox().click();
	ActivitiesPage.getMapButton().click();
}
	
	
	
	
@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}
}
