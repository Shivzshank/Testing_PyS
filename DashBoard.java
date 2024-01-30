package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.AdminDashBoardPage;

public class DashBoard extends Baseclass{
	
@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();
	}
	
@Test(priority = 1, enabled = true)
	public void Dashboard1() throws Throwable {
	TakeScreenShot("./ScreenShots/DashBoard/001DashBoard.png");
	}

@Test(priority = 2, enabled = true)
	public void Dashboard2() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	AdminDashBoardPage.getBookingsNotofication().click();Thread.sleep(3000);
	TakeScreenShot("./ScreenShots/DashBoard/002ClickingOnVendorsNotification.png");
	}

@Test(priority = 3, enabled = true)
	public void Dashboard3() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	AdminDashBoardPage.getCustomersNotification().click();Thread.sleep(3000);
	TakeScreenShot("./ScreenShots/DashBoard/003ClickingOnCustomersNotification.png");
	}

@Test(priority = 4, enabled = true)
	public void Dashboard4() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	AdminDashBoardPage.getBookingsNotofication().click();Thread.sleep(3000);
	TakeScreenShot("./ScreenShots/DashBoard/004ClickingOnBookingsNotification.png");
	}	

@Test(priority = 5, enabled = true)
	public void Dashboard5() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	AdminDashBoardPage.getCustomerComplaintNotofication().click();Thread.sleep(3000);
	TakeScreenShot("./ScreenShots/DashBoard/005ClickingOnCustomerComplaintNotification.png");
	}	

@Test(priority = 6, enabled = true)
	public void Dashboard6() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	AdminDashBoardPage.getVendorComplaintsNotofication().click();Thread.sleep(3000);
	TakeScreenShot("./ScreenShots/DashBoard/006ClickingOnVendorComplaintsNotification.png");
	}

@Test(priority = 7, enabled = true)
	public void Dashboard7() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	AdminDashBoardPage.getDashboardDateButton().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("DashboardDate"), 
						fileUtils.readTheDataFromPropertyFile("DashboardMonthYear"));
	Thread.sleep(8000);AdminDashBoardPage.getFirstTodayVendorBookings().click();Thread.sleep(500);
	TakeScreenShot("./ScreenShots/DashBoard/007CheckingToday'sVendorBookings01.png");
	AdminDashBoardPage.getFirstMoreButton().click();Thread.sleep(1000);
	TakeScreenShot("./ScreenShots/DashBoard/007CheckingToday'sVendorBookings02.png");
	}

@Test(priority = 8, enabled = true)
	public void Dashboard8() throws Throwable {
	AdminDashBoardPage AdminDashBoardPage = new AdminDashBoardPage(driver);
	ScrollWindow();Thread.sleep(500);
	AdminDashBoardPage.getLastTwoWeekButton().click();
	ScrollWindow();Thread.sleep(500);
	TakeScreenShot("./ScreenShots/DashBoard/008CheckingLastTwoWeeksButton.png");
}

@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}		
}
