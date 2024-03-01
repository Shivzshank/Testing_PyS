package vendorLogin;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;
public class PYSDashBoard extends Baseclass {

	SoftAssert softassert=new SoftAssert();
	
@BeforeMethod
public void weblogin() throws Throwable {
		WebApplicationLogin();
}

@Test(priority = 1, enabled = true)
public void Dashboardwindow() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getProfileButton().click();
	TakeScreenShot("./screenshots/PYSDashboard/001DashboardProfileButton.png");
    //+timestamp()+"  
}

@Test(priority = 2, enabled = false)
public void ChangePassword() throws Throwable {
	ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"),
			fileUtils.readTheDataFromPropertyFile("newpassword"), 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/PYSDashboard/002ChangePassword.png");   
}

@Test(priority = 3, enabled = true)
public void ChangePassConfirmPassWrong() throws Throwable {
	ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"),
			fileUtils.readTheDataFromPropertyFile("newpassword"), 
			fileUtils.readTheDataFromPropertyFile("wrongconfirmpassword"));
	TakeScreenShot("./screenshots/PYSDashboard/003ChangePasswordConfirmPassWrong.png"); 
}

@Test(priority = 4, enabled = true)
public void ChangePassCurrentPassWrong() throws Throwable {
	ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("wrongcurrentpassword"), 
			fileUtils.readTheDataFromPropertyFile("newpassword"), 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/PYSDashboard/004ChangePasswordCurrentPassWrong.png");   
}

@Test(priority = 5, enabled = true)
public void ChangePassNewPassWrong() throws Throwable {
	ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"), 
			fileUtils.readTheDataFromPropertyFile("wrongnewpassword"), 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/PYSDashboard/005ChangePasswordNewPassWrong.png");   
}

@Test(priority = 6, enabled = true)
public void ChangePassEmptyCurrentPassField() throws Throwable {
	ChangePasswordInDashboard("", fileUtils.readTheDataFromPropertyFile("newpassword"), 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/PYSDashboard/006ChangePasswordEmptyCurrentPassField.png");  
}

@Test(priority = 7, enabled = true)
public void ChangePassEmptyNewPassField() throws Throwable {
	ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"), "", 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/PYSDashboard/007ChangePasswordEmptyNewPassField.png");
}

@Test(priority = 8, enabled = true)
public void ChangePassEmptyConfirmPassField() throws Throwable {
	ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"), 
			fileUtils.readTheDataFromPropertyFile("newpassword"), "");
	TakeScreenShot("./screenshots/PYSDashboard/008ChangePasswordEmptyConfirmPassField.png");   
}

@Test(priority = 9, enabled = true)
public void DashboardBookingsDropDown1() throws Throwable {
	DashboardDropDown();
	TakeScreenShot("./screenshots/PYSDashboard/009DashboardBookingDropDown1.png"); 
}

@Test(priority = 10, enabled = true)
public void DashboardBookingsDropDown2() throws Throwable {
	DashboardDropDown();
	HomePage HomePage = new HomePage(driver);
	HomePage.getDashboardBookingDropDown().click();
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/PYSDashboard/010DashboardBookingDropDown2.png");   
}

@Test(priority = 11, enabled = false)
public void ClickingOnLastTwoWeeks() throws Throwable {
	ScrollWindow1();
	HomePage HomePage = new HomePage(driver);
	HomePage.getLastTwoWeekButton().click();
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/PYSDashboard/011ClickingOnLastTwoWeeks.png");   
}

@Test(priority = 12, enabled = true)
public void LastTwoWeeksVerify() throws Throwable {
	HomePage homepage = new HomePage(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
	wait.until(ExpectedConditions.visibilityOf(homepage.getOnlineBox()));
	homepage.getOnlineBox().click();
	ScrollWindow1();
	Thread.sleep(1000);
	homepage.getLastTwoWeekButton().click();
	String expectedcolor = homepage.getLastTwoWeekButton().getCssValue("color");
	String Actualcolor = "rgba(32, 101, 209, 1)";
	softassert.assertEquals(Actualcolor, expectedcolor,"last two week button is not clicked ");
//	softassert.assertAll();
	TakeScreenShot("./screenshots/PYSDashboard/012ClickingOnLastTwoWeeksVerify.png");   
}




@AfterMethod
public void windowClose() {
	driver.close();
}
}