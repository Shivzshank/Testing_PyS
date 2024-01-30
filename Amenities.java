package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.AmenitiesPage;
import com.cotyledon.pys.pomrepository.HomePage;

public class Amenities extends Baseclass {

@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();	
	HomePage HomePage = new HomePage(driver);
	HomePage.getAmenities().click();
	}

@Test(priority = 1, enabled = true)
	public void CreateAmenities01() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateAmenities().click();
	AmenitiesPage AmenitiesPage = new AmenitiesPage(driver);
	AmenitiesPage.getAmenityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("AmenityName"));
	RobotForwardTab();RobotBackSpace();
	AmenitiesPage.getAmenityDescriptionField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("AmenityDescription"));
	AmenitiesPage.getCreateAmenitiesButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/Amenities/001CreateNewAmenities.png");
	}
	
@Test(priority = 2, enabled = true)
	public void CreateAmenities02() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateAmenities().click();
	AmenitiesPage AmenitiesPage = new AmenitiesPage(driver);
	AmenitiesPage.getExistingAmenities13().click();Thread.sleep(1500);
	RobotForwardTab();RobotForwardTab();RobotBackSpace();
	AmenitiesPage.getAmenityNameFieldEdit().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("AmenityReName"));
	AmenitiesPage.getUpdateButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/Amenities/002UpdateAmenities.png");
	AmenitiesPage.getOkButton().click();Thread.sleep(1500);
	AmenitiesPage.getExistingAmenities13().click();Thread.sleep(1500);
	RobotForwardTab();RobotForwardTab();RobotBackSpace();
	AmenitiesPage.getAmenityNameFieldEdit().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("AmenityName"));
	AmenitiesPage.getUpdateButton().click();Thread.sleep(1000);	
	}	
	
@Test(priority = 3, enabled = true)
	public void CreateAmenities03() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateAmenities().click();
	AmenitiesPage AmenitiesPage = new AmenitiesPage(driver);
	AmenitiesPage.getExistingAmenities13().click();Thread.sleep(1500);
	RobotForwardTab();RobotForwardTab();RobotBackSpace();
	AmenitiesPage.getAmenityNameFieldEdit().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("AmenityExistingName"));
	TakeScreenShot("./ScreenShots/Amenities/003MessageForExistingNameCheck01.png");
	driver.navigate().refresh();Thread.sleep(2000);
	AmenitiesPage.getAmenityNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("AmenityExistingName"));
	TakeScreenShot("./ScreenShots/Amenities/003MessageForExistingNameCheck02.png");
	}

@Test(priority = 4, enabled = true)
	public void MapAmenitiesToVendor01() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getMapAmenitiesToVendor().click();
	AmenitiesPage AmenitiesPage = new AmenitiesPage(driver);
	AmenitiesPage.getShopNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("VendorName1"));
	AmenitiesPage.getLogeshBadmintonVendor().click();Thread.sleep(1000);
	AmenitiesPage.getTestAmenity02CheckBox().click();
	AmenitiesPage.getMapAmenitiesButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/Amenities/004MappingAmenitiesToVendor.png");
	AmenitiesPage.getOkButton().click();
	AmenitiesPage.getLogeshBadmintonVendor().click();Thread.sleep(1000);
	AmenitiesPage.getTestAmenity02CheckBox().click();
	AmenitiesPage.getMapAmenitiesButton().click();Thread.sleep(1000);
	}
	
	
@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}	
}
