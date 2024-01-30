package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.PysUserManagementPage;

public class PySUserManagement extends Baseclass {

@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();
	HomePage HomePage = new HomePage(driver);
	HomePage.getPysUserManagement().click();
	Thread.sleep(500);
	}
	
@Test(priority = 1, enabled = true)	
public void CreateUser() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateUsers().click();Thread.sleep(500);
	PysUserManagementPage PysUserManagementPage = new PysUserManagementPage(driver);
	PysUserManagementPage.getNameField()
	.sendKeys(ExcelUtility.readTheStringData("Sheet1", 1, 1));
	PysUserManagementPage.getGenderFieldDropDown().click();
	PysUserManagementPage.getMaleButton().click();
	PysUserManagementPage.getDateOfBirthIcon().click();ScrollWindow();
	PysUserManagementPage.getChoosingYearAs2000().click();
	PysUserManagementPage.getChoosingDayAs1().click();
	PysUserManagementPage.getAuthorityDropDown().click();Thread.sleep(500);
	PysUserManagementPage.getChoosingRoleManager().click();
	PysUserManagementPage.getAddressField()
	.sendKeys(fileUtils.readTheDataFromPropertyFile("Address"));Thread.sleep(500);
	RobotDownArrow();RobotEnter();
	PysUserManagementPage.getMobileNumberField()
	.sendKeys(fileUtils.readTheDataFromPropertyFile("MobileNumberTest"));
	PysUserManagementPage.getEmailIdField()
	.sendKeys(fileUtils.readTheDataFromPropertyFile("EmailTest"));
//	PysUserManagementPage.getSaveButton().click();
	TakeScreenShot("./ScreenShots/PySUserManagement/001CreateUser.png");
	}
	
@Test(priority = 2, enabled = true)	
	public void ViewUser1() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewUsers().click();
	PysUserManagementPage PysUserManagementPage = new PysUserManagementPage(driver);
	PysUserManagementPage.getAuthorityDropDown().click();
	PysUserManagementPage.getChoosingRoleAdmin().click();
	PysUserManagementPage.getUserNameField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("PySUserAdminName"));
	PysUserManagementPage.getEmailField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("PySUserEmail"));
	PysUserManagementPage.getMobileNoField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("PySUserMobileNo"));
	PysUserManagementPage.getTestAdminButton().click();
	PysUserManagementPage.getUserNameFieldForEdit().click();
	RobotClearingField();
	PysUserManagementPage.getUserNameFieldForEdit().
	sendKeys(fileUtils.readTheDataFromPropertyFile("RenamePySUserName"));
	PysUserManagementPage.getEmailIdFieldForEdit().click();
	RobotClearingField();
	PysUserManagementPage.getEmailIdFieldForEdit().
	sendKeys(fileUtils.readTheDataFromPropertyFile("RenamePySEmailId"));
	PysUserManagementPage.getUpdateButtonForEdit().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/PySUserManagement/002ViewUserUpdatingField.png");
	PysUserManagementPage.getUserNameField().click();
	RobotClearingField();
	PysUserManagementPage.getEmailField().click();
	RobotClearingField();
	PysUserManagementPage.getTestAdminButton().click();
	PysUserManagementPage.getUserNameFieldForEdit().click();
	RobotClearingField();
	PysUserManagementPage.getUserNameFieldForEdit().
	sendKeys(fileUtils.readTheDataFromPropertyFile("PySUserAdminName"));
	PysUserManagementPage.getEmailIdFieldForEdit().click();
	RobotClearingField();
	PysUserManagementPage.getEmailIdFieldForEdit().
	sendKeys(fileUtils.readTheDataFromPropertyFile("PySUserEmail"));
	PysUserManagementPage.getUpdateButtonForEdit().click();
	}

@Test(priority = 3, enabled = true)	
	public void ViewUser2() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewUsers().click();
	PysUserManagementPage PysUserManagementPage = new PysUserManagementPage(driver);
	PysUserManagementPage.getTestAdminButton().click();
	PysUserManagementPage.getUserActivateAndDeactiviateButton().click();
	PysUserManagementPage.getUserActivateAndDeactiviateConfirmButton().click();Thread.sleep(500);
	TakeScreenShot("./ScreenShots/PySUserManagement/003UserDeactivation01.png");
	PysUserManagementPage.getUserActivateAndDeactiviateButton().click();
	PysUserManagementPage.getUserActivateAndDeactiviateConfirmButton().click();
	TakeScreenShot("./ScreenShots/PySUserManagement/003UserReactivation02.png");
	}

@Test(priority = 4, enabled = true)	
	public void ViewUser3() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewUsers().click();
	PysUserManagementPage PysUserManagementPage = new PysUserManagementPage(driver);
	PysUserManagementPage.getTestAdminButton().click();
	PysUserManagementPage.getMobileNumberFieldForEdit().click();
	RobotClearingField();
	PysUserManagementPage.getMobileNumberFieldForEdit().
	sendKeys(fileUtils.readTheDataFromPropertyFile("NewUserMobileNumber"));
	TakeScreenShot("./ScreenShots/PySUserManagement/004MobileNumberAlreadyExistsMessage.png");
	}


@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}	
}
