package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.IndividualVendorPage;

public class IndividualVendor extends  Baseclass{

@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();	
	HomePage HomePage = new HomePage(driver);
	HomePage.getIndividualVendor().click();
	}
	
@Test(priority = 1, enabled = true, invocationCount = 1)
	public void CreateVendor01() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	IndividualVendorPage.getShopNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopName"));
	IndividualVendorPage.getShopOpeningTimeField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopOpeningTime"));
	IndividualVendorPage.getShopClosingTimeField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopClosingTime"));
	IndividualVendorPage.getShopMobileNumberField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopMobileNumber"));
	IndividualVendorPage.getShopAddressField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopAddress"));
	RobotDownArrow();RobotEnter();
	IndividualVendorPage.getCityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("City"));
	IndividualVendorPage.getLatitiudeField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Latitude"));
	IndividualVendorPage.getLongitudeField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Longitude"));
	IndividualVendorPage.getCountryField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Country"));
	IndividualVendorPage.getSupervisorNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SupervisorName"));
	IndividualVendorPage.getSupervisorEmailField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("SupervisorEmail"));
	IndividualVendorPage.getNextButton().click();Thread.sleep(1000);
	IndividualVendorPage.getActivityDropDown().click();Thread.sleep(250);
	IndividualVendorPage.getBadmintonOption().click();
	IndividualVendorPage.getSubActivitiesDropDown().click();Thread.sleep(250);
	IndividualVendorPage.getBadmintonCheckBox().click();RobotEscape();
	IndividualVendorPage.getPayModeDropDown().click();Thread.sleep(250);
	IndividualVendorPage.getBothOption().click();
	IndividualVendorPage.getGenderDropDown().click();
	IndividualVendorPage.getMaleOption().click();
	IndividualVendorPage.getGuidelinesField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Guidelines1"));
	IndividualVendorPage.getRegisterButton().click();Thread.sleep(1000);
//	IndividualVendorPage.getAgreeButton().click();Thread.sleep(2000);
	TakeScreenShot("./ScreenShots/IndividualVendor/001CreateNewVendor.png");
	}

@Test(priority = 2, enabled = true, invocationCount = 1)
	public void ViewVendor01() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getShopNameEdit().click();RobotClearingField();
	IndividualVendorPage.getShopNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopNameEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/002ViewVendorEditShopName.png");
	IndividualVendorPage.getShopNameEdit().click();RobotClearingField();
	IndividualVendorPage.getShopNameField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("VendorName2"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
}

@Test(priority = 3, enabled = true, invocationCount = 1)
	public void ViewVendor02() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getShopOpenTimeEdit().click();
	IndividualVendorPage.getShopOpeningAtField().click();RobotClearingField();
	IndividualVendorPage.getShopOpeningAtField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopOpeningTimeEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/003ViewVendorEditShopOpeningTime.png");
	IndividualVendorPage.getShopOpenTimeEdit().click();
	IndividualVendorPage.getShopOpeningAtField().click();RobotClearingField();
	IndividualVendorPage.getShopOpeningAtField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopOpeningTime"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 4, enabled = true, invocationCount = 1)
	public void ViewVendor03() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getShopCloseTimeEdit().click();
	IndividualVendorPage.getShopClosingAtField().click();RobotClearingField();
	IndividualVendorPage.getShopClosingAtField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopClosingTimeEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/004ViewVendorEditShopClosingTime.png");
	IndividualVendorPage.getShopCloseTimeEdit().click();
	IndividualVendorPage.getShopClosingAtField().click();RobotClearingField();
	IndividualVendorPage.getShopClosingAtField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopClosingTime"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 5, enabled = true, invocationCount = 1)
	public void ViewVendor04() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getShopNumberEdit().click();
	IndividualVendorPage.getShopNumberEditField().click();RobotClearingField();
	IndividualVendorPage.getShopNumberEditField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopMobileNumberEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/005ViewVendorEditShopNumber.png");
	IndividualVendorPage.getShopNumberEdit().click();
	IndividualVendorPage.getShopNumberEditField().click();RobotClearingField();
	IndividualVendorPage.getShopNumberEditField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopMobileNumberReEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 6, enabled = true, invocationCount = 1)
	public void ViewVendor05() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getShopAddressEdit().click();RobotClearingField();
	IndividualVendorPage.getShopAddressField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopAddressEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/006ViewVendorEditShopAddress.png");
	IndividualVendorPage.getShopAddressEdit().click();RobotClearingField();
	IndividualVendorPage.getShopAddressField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("ShopAddress"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 7, enabled = true, invocationCount = 1)
	public void ViewVendor06() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getCityEdit().click();RobotClearingField();
	IndividualVendorPage.getCityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("CityEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/007ViewVendorEditShop'sCity.png");
	IndividualVendorPage.getCityEdit().click();RobotClearingField();
	IndividualVendorPage.getCityField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("City"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 8, enabled = true, invocationCount = 1)
	public void ViewVendor07() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getCountryEdit().click();RobotClearingField();
	IndividualVendorPage.getCountryField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("CountryEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/008ViewVendorEditShop'sCountry.png");
	IndividualVendorPage.getCountryEdit().click();RobotClearingField();
	IndividualVendorPage.getCountryField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Country"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 9, enabled = true, invocationCount = 1)
	public void ViewVendor08() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getLatitudeEdit().click();
	IndividualVendorPage.getLatitudeEditField().click();RobotClearingField();
	IndividualVendorPage.getLatitudeEditField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("LatitudeEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/009ViewVendorEditShopLatitude.png");
	IndividualVendorPage.getLatitudeEdit().click();
	IndividualVendorPage.getLatitudeEditField().click();RobotClearingField();
	IndividualVendorPage.getLatitudeEditField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Latitude"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 10, enabled = true, invocationCount = 1)
	public void ViewVendor09() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getLongitudeEdit().click();
	IndividualVendorPage.getLongitudeEditField().click();RobotClearingField();
	IndividualVendorPage.getLongitudeEditField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("LongitudeEdit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/010ViewVendorEditShopLongitude.png");
	IndividualVendorPage.getLongitudeEdit().click();
	IndividualVendorPage.getLongitudeEditField().click();RobotClearingField();
	IndividualVendorPage.getLongitudeEditField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Longitude"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 11, enabled = true, invocationCount = 1)
	public void ViewVendor10() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getSubActivityDropDownEdit().click();
	IndividualVendorPage.getSlotTypesEdit().click();
	IndividualVendorPage.getSinglesBadmintonOption().click();
	IndividualVendorPage.getDoubleBadmintonOption().click();RobotEscape();Thread.sleep(250);
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(650);
	TakeScreenShot("./ScreenShots/IndividualVendor/011ViewVendorEditSubActivity.png");
	IndividualVendorPage.getSubActivityDropDownEdit().click();
	IndividualVendorPage.getSlotTypesEdit().click();
	IndividualVendorPage.getSinglesBadmintonOption().click();
	IndividualVendorPage.getDoubleBadmintonOption().click();RobotEscape();Thread.sleep(250);
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(750);
	}

@Test(priority = 12, enabled = true, invocationCount = 1)
	public void ViewVendor11() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getPaymentModeDropDownEdit().click();
	IndividualVendorPage.getPaymentEdit().click();
	IndividualVendorPage.getCashOption().click();
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/IndividualVendor/012ViewVendorEditPaymentMode01.png");
	IndividualVendorPage.getPaymentModeDropDownEdit().click();
	IndividualVendorPage.getPaymentEdit().click();
	IndividualVendorPage.getOnlineOption().click();
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/IndividualVendor/012ViewVendorEditPaymentMode02.png");
	IndividualVendorPage.getPaymentModeDropDownEdit().click();
	IndividualVendorPage.getPaymentEdit().click();
	IndividualVendorPage.getBothOption().click();
	IndividualVendorPage.getTickButtonForAllEdit().click();
	}

@Test(priority = 13, enabled = true, invocationCount = 1)
	public void ViewVendor12() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();
	IndividualVendorPage.getGenderDropDownEdit().click();
	IndividualVendorPage.getGenderEdit().click();
	IndividualVendorPage.getFemaleOption().click();
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/IndividualVendor/013ViewVendorEditGender01.png");
	IndividualVendorPage.getGenderDropDownEdit().click();
	IndividualVendorPage.getGenderEdit().click();
	IndividualVendorPage.getUnisexOption().click();
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/IndividualVendor/013ViewVendorEditGender02.png");
	IndividualVendorPage.getGenderDropDownEdit().click();
	IndividualVendorPage.getGenderEdit().click();
	IndividualVendorPage.getMaleOption().click();
	IndividualVendorPage.getTickButtonForAllEdit().click();
	}

@Test(priority = 14, enabled = true, invocationCount = 1)
	public void ViewVendor13() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewVendors().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	TestShopName001VendorSearch();ScrollWindow();
	IndividualVendorPage.getGuidelinesEdit().click();RobotClearingField();
	IndividualVendorPage.getGuidelinesField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Guidelines1Edit"));
	IndividualVendorPage.getTickButtonForAllEdit().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/IndividualVendor/014ViewVendorEditGuidelines.png");
	IndividualVendorPage.getGuidelinesEdit().click();RobotClearingField();
	IndividualVendorPage.getGuidelinesField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("Guidelines1"));
	IndividualVendorPage.getTickButtonForAllEdit().click();
	}

@Test(priority = 15, enabled = true, invocationCount = 1)
	public void VendorList01() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getVendorsList().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	IndividualVendorPage.getTestCheckBox().click();
	IndividualVendorPage.getDownloadButton().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/IndividualVendor/015VendorListDownload.png");
	}

@Test(priority = 16, enabled = true, invocationCount = 1)
	public void VendorList02() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getVendorsList().click();
	IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
	IndividualVendorPage.getAllVendorNavigationalBar().click();
	TakeScreenShot("./ScreenShots/IndividualVendor/016.png");
	}

@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}
}
