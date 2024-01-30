package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.ChildSubActivitiesPage;
import com.cotyledon.pys.pomrepository.HomePage;

public class ChildSubActivity extends Baseclass {
	
@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();
	HomePage HomePage = new HomePage(driver);
	HomePage.getChildSubActivities().click();
	}	
	
@Test(priority = 1, enabled = true)
	public void CreateSubActivities01() throws Throwable {
	HomePage HomePage = new HomePage(driver);		
	HomePage.getCreateChild().click();
	ChildSubActivitiesPage ChildSubActivitiesPage = new ChildSubActivitiesPage(driver);
	ChildSubActivitiesPage.getParentSubActivityDropDown().click();Thread.sleep(250);
	ChildSubActivitiesPage.getSearchInDropDown().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SearchValue"));Thread.sleep(500);
	ChildSubActivitiesPage.getFirstOptionInDropDown().click();Thread.sleep(500);
	ChildSubActivitiesPage.getHairCutTestCheckBox().click();
	ChildSubActivitiesPage.getMapChildSubActivitiesButton().click();
	TakeScreenShot("./ScreenShots/ChildSubActivities/001MappingNewSubActivity.png");
	}	
	
@Test(priority = 2, enabled = true)
	public void ViewChildMapping01() throws Throwable {
	HomePage HomePage = new HomePage(driver);	
	HomePage.getViewChildMapping().click();
	ChildSubActivitiesPage ChildSubActivitiesPage = new ChildSubActivitiesPage(driver);
	ChildSubActivitiesPage.getHairCutKidChildActivityBox().click();Thread.sleep(1000);
	ChildSubActivitiesPage.getHairCutTestRemovalOption().click();Thread.sleep(500);
	ChildSubActivitiesPage.getConfirmButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/ChildSubActivities/002RemovalOfChildSubActivity.png");
}





@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}	
}	
	
	
	
	
