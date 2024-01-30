package adminLogin;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cotyledon.pys.genericutility.FileUtility;
import com.cotyledon.pys.pomrepository.SigninPage;

public class Sample {
	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	FileUtility fileUtils = new FileUtility();
 	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		SigninPage SigninPage = new SigninPage(driver);
		driver.get(fileUtils.readTheDataFromPropertyFile("URL"));
		SigninPage.getEmailormobilefield().sendKeys(fileUtils.readTheDataFromPropertyFile("emailID"));
		SigninPage.getPasswordfield().sendKeys(fileUtils.readTheDataFromPropertyFile("AdminPass"));
		SigninPage.getLoginbutton().click();
		Thread.sleep(1000);
}
	
}
