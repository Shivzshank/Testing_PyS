package adminLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.CancellationPolicyPage;
import com.cotyledon.pys.pomrepository.HomePage;

public class CancellationPolicy extends Baseclass  {

@BeforeMethod
	public void WebLogin() throws Throwable {
	WebApplicationLogin();	
	HomePage HomePage = new HomePage(driver);
	HomePage.getCancellationPolicy().click();
	}	
	
@Test(priority = 1, enabled = true)
	public void CreateCancellationPolicy01() throws Throwable {	
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateCancellationPolicy().click();
	CancellationPolicyPage CancellationPolicyPage = new CancellationPolicyPage(driver);
	CancellationPolicyPage.getShopNameField().click();
	RobotTypeTestShop();RobotBackSpace();Thread.sleep(500);
	CancellationPolicyPage.getTestShopNameVendor().click();Thread.sleep(500);
	CancellationPolicyPage.getCancellationTimeLimitField().click();RobotClearingField();
	CancellationPolicyPage.getCancellationTimeLimitField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("CancellationTimeLimit1"));
	CancellationPolicyPage.getCancellationPercentageField().click();RobotClearingField();
	CancellationPolicyPage.getCancellationPercentageField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("CancellationPercentage1"));
	CancellationPolicyPage.getUpdateButton().click();Thread.sleep(1500);
	TakeScreenShot("./ScreenShots/CancellationPolicy/001CreateCancellationPolicy.png");
	CancellationPolicyPage.getTestShopNameVendor().click();Thread.sleep(500);
	CancellationPolicyPage.getCancellationTimeLimitField().click();RobotClearingField();
	CancellationPolicyPage.getCancellationTimeLimitField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("CancellationTimeLimit2"));
	CancellationPolicyPage.getCancellationPercentageField().click();RobotClearingField();
	CancellationPolicyPage.getCancellationPercentageField().
	sendKeys(fileUtils.ReadDataFromTestingDataFile("CancellationPercentage2"));
	CancellationPolicyPage.getUpdateButton().click();Thread.sleep(1500);
	}
	
	
	
	
	
	
	
	
	
@AfterMethod
	public void WindowClose() {
	ExecuteAfterMethod();
	}	
}
