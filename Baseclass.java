package com.cotyledon.pys.genericutility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cotyledon.pys.pomrepository.IndividualVendorPage;
import com.cotyledon.pys.pomrepository.SigninPage;
import com.cotyledon.pys.pomrepository.SlotsPage;

public class Baseclass {
	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
	public WebDriverUtility webdriverUtils = new WebDriverUtility();
	public ExcelUtility ExcelUtility = new ExcelUtility();
	public JavaUtility JavaUtility = new JavaUtility();

//Method for Browser Launch
	public void BrowserLaunch(int BrowserValue) throws Throwable {
		int BrowserName = BrowserValue;
		switch (BrowserName) {
		case 1:
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case 2:
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case 3:
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(6000);
			RobotEnter();
			break;
		}
	}

//Opening Browser and Signin to PYS testvendor login web application with proper credentials.
	public void WebApplicationLogin() throws Throwable {
		BrowserLaunch(2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		SigninPage SigninPage = new SigninPage(driver);
		driver.get(fileUtils.readTheDataFromPropertyFile("URL"));
		SigninPage.getEmailormobilefield().
		sendKeys(fileUtils.readTheDataFromPropertyFile("emailID"));
		SigninPage.getPasswordfield().
		sendKeys(fileUtils.readTheDataFromPropertyFile("AdminPass"));
		SigninPage.getLoginbutton().click();
		Thread.sleep(1000);
	}

//Quitting the web browser.
	public void ExecuteAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
//Method for taking screenshot and storing the file in certain location.	
	public void TakeScreenShot(String location) throws Throwable {
		TakesScreenshot Javascript = (TakesScreenshot)driver;
	    File source = Javascript.getScreenshotAs(OutputType.FILE);
	    File target = new File(location);
	    FileUtils.copyFile(source, target);
	}

////////////// Start of robot class 	
//Method for robotclass Escape button in keyboard.
	public void RobotEscape() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_ESCAPE);
		Robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

//Method for robotclass Tab button in keyboard.
	public void RobotForwardTab() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_TAB);
		Robot.keyRelease(KeyEvent.VK_TAB);
	}
//Method for robotclass Tab button in keyboard.
	public void RobotReverseTab() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_TAB);
		Robot.keyRelease(KeyEvent.VK_TAB);
		Robot.keyRelease(KeyEvent.VK_SHIFT);
	}	

//Method for robotclass Enter button in keyboard.
	public void RobotEnter() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_ENTER);
		Robot.keyRelease(KeyEvent.VK_ENTER);
	}

//Method for robotclass Up Arrow button in keyboard.		
	public void RobotUpArrow() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_UP);
		Robot.keyRelease(KeyEvent.VK_UP);
	}

//Method for robotclass Down Arrow button in keyboard.		
	public void RobotDownArrow() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_DOWN);
		Robot.keyRelease(KeyEvent.VK_DOWN);
	}

//Method for robotclass Left Arrow button in keyboard.
	public void RobotLeftArrow() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_LEFT);
		Robot.keyRelease(KeyEvent.VK_LEFT);
	}

//Method for robotclass Right Arrow button in keyboard.
	public void RobotRightArrow() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_RIGHT);
		Robot.keyRelease(KeyEvent.VK_RIGHT);
	}

//Method for robotclass capital letter 'L' button in keyboard.
	public void RobotL() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_L);
		Robot.keyRelease(KeyEvent.VK_L);
		Robot.keyRelease(KeyEvent.VK_SHIFT);
	}

//Method for robotclass capital letter 'O' button in keyboard.
	public void RobotO() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_O);
		Robot.keyRelease(KeyEvent.VK_O);
		Robot.keyRelease(KeyEvent.VK_SHIFT);
	}

//Method for robotclass small letter 'o' button in keyboard.
	public void Roboto() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_O);
		Robot.keyRelease(KeyEvent.VK_O);
	}

//Method for robotclass capital letter 'G' button in keyboard.
	public void RobotG() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_G);
		Robot.keyRelease(KeyEvent.VK_G);
		Robot.keyPress(KeyEvent.VK_SHIFT);
	}
//Method for robotclass typing 'test' in keyboard.
	public void RobotTypeTest() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_T);
		Robot.keyRelease(KeyEvent.VK_T);
		Robot.keyRelease(KeyEvent.VK_SHIFT);Thread.sleep(1000);
		Robot.keyPress(KeyEvent.VK_E);
		Robot.keyRelease(KeyEvent.VK_E);Thread.sleep(1000);
		Robot.keyPress(KeyEvent.VK_S);
		Robot.keyRelease(KeyEvent.VK_S);Thread.sleep(1000);
		Robot.keyPress(KeyEvent.VK_T);
		Robot.keyRelease(KeyEvent.VK_T);Thread.sleep(1000);
	}

//Method for robotclass small letter 'g' button in keyboard.
	public void Robotg() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_G);
		Robot.keyRelease(KeyEvent.VK_G);
	}

//Method for robotclass Back Space button in keyboard.
	public void RobotBackSpace() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

//Method for robotclass escaping lock of keys in keyboard.
	public void RobotExitLockingKeys() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_CONTROL);
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyRelease(KeyEvent.VK_SHIFT);
		Robot.keyRelease(KeyEvent.VK_CONTROL);
	}
//Method for clearing the field using Robot class.
	public void RobotClearingField() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_CONTROL);
		Robot.keyPress(KeyEvent.VK_A);
		Robot.keyRelease(KeyEvent.VK_A);
		Robot.keyRelease(KeyEvent.VK_CONTROL);
		Robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
//Method for robotclass typing 'test' in keyboard.
	public void RobotTypeTestShop() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_T);
		Robot.keyRelease(KeyEvent.VK_T);
		Robot.keyRelease(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_E);Robot.keyRelease(KeyEvent.VK_E);
		Robot.keyPress(KeyEvent.VK_S);Robot.keyRelease(KeyEvent.VK_S);
		Robot.keyPress(KeyEvent.VK_T);Robot.keyRelease(KeyEvent.VK_T);
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_S);Robot.keyRelease(KeyEvent.VK_S);
		Robot.keyRelease(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_H);Robot.keyRelease(KeyEvent.VK_H);
		Robot.keyPress(KeyEvent.VK_O);Robot.keyRelease(KeyEvent.VK_O);
		Robot.keyPress(KeyEvent.VK_P);Robot.keyRelease(KeyEvent.VK_P);Thread.sleep(500);
	}


/////////////End of robot class

//Method for calender from Effective From Date.	
		public void EffectiveFromDateCalender(String fromdayvalue, String monthyearvalue) throws Throwable {
		String fromday = fromdayvalue;
		String monthyear = monthyearvalue;
		for (;;) {
			SlotsPage Slots = new SlotsPage(driver);
			String monthyeartext = Slots.getMonthYearText().getText();
			if (monthyeartext.equalsIgnoreCase(monthyear)) {
				break;
			} else {
				Slots.getRightArrowButton().click();Thread.sleep(250);
					}
				}
			driver.findElement(By.xpath("//button[normalize-space()=" + fromday + "]")).click();
		}
		
//Method for calender from Effective To Date.	
		public void EffectiveToDateCalender(String enddayvalue, String monthyearvalue) throws Throwable {
			String endday = enddayvalue;
			String monthyear = monthyearvalue;
			for (;;) {
				SlotsPage Slots = new SlotsPage(driver);
				String monthyeartext = Slots.getMonthYearText().getText();
				if (monthyeartext.equalsIgnoreCase(monthyear)) {
					break;
				} else {
					Slots.getRightArrowButton().click();
				}
			}
			driver.findElement(By.xpath("//button[normalize-space()=" + endday + "]")).click();
		}
		
//Method for calender dropdown left arrow
		public void CalenderLeftArrow(String pastdayvalue) {
			String pastday = pastdayvalue;
			SlotsPage Slots = new SlotsPage(driver);
			Slots.getleftArrowButton().click();
			driver.findElement(By.xpath("//button[normalize-space()=" + pastday + "]")).click();
		}
		
//Method for scrolling down the window.		
		public void ScrollWindow() throws Throwable {
			JavascriptExecutor JavascriptExecutor = (JavascriptExecutor) driver;
			JavascriptExecutor.executeScript(fileUtils.readTheDataFromPropertyFile("ScrollRate"), "");
			Thread.sleep(1000);
		}		

//Method for If Else Statement for searching Specific Vendor And Clicking.		
		
		public void TestShopName001VendorSearch() throws Throwable {
			IndividualVendorPage IndividualVendorPage = new IndividualVendorPage(driver);
			IndividualVendorPage.getShopNameField().click();
			RobotTypeTestShop();Thread.sleep(500);
			RobotBackSpace();Thread.sleep(2000);RobotBackSpace();Thread.sleep(1500);
			IndividualVendorPage.getTestShopNameVendor().click();Thread.sleep(500);
		}
		
//Method for choosing dates for from list.
		public void ChoosingDaysForSlotsPage(int dayvalue) {
			int day = dayvalue;
			SlotsPage SlotsPage = new SlotsPage(driver);
			switch (day) {
			  case 1:
				SlotsPage.getAlldaysCheckBox().click();
			    System.out.println("AllDays");
			    break;
			  case 2:
				SlotsPage.getMondayCheckBox().click();  
			    System.out.println("Monday");
			    break;
			  case 3:
				SlotsPage.getTuesdayCheckBox().click();  
			    System.out.println("Tuesday");
			    break;
			  case 4:
				SlotsPage.getWednesdayCheckBox().click();
			    System.out.println("Wednesday");
			    break;
			  case 5:
				  SlotsPage.getThursdayCheckBox().click();
			    System.out.println("Thursday");
			    break;
			  case 6:
				  SlotsPage.getFridayCheckBox().click();
			    System.out.println("Friday");
			    break;
			  case 8:
				  SlotsPage.getSaturdayCheckBox().click();
			    System.out.println("Saturday");
			    break;
			  case 9:
				  SlotsPage.getSundayCheckBox().click();
				    System.out.println("Sunday");
				    break;
			  case 10:
				  SlotsPage.getWeekDaysCheckBox().click();
				    System.out.println("Week Days");
				    break;
			  case 11:
				  SlotsPage.getWeekEndcheckbox().click();
				    System.out.println("Week Ends");
				    break;
			}

		}		
		
		
		
		
		
		
		
		
		
		
		
}
