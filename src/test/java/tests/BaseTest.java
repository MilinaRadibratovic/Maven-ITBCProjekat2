package tests;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected static WebDriver driver;
	protected static SoftAssert sa;
	
	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.getInstance(CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sa = new SoftAssert();
	}
	
	


	@AfterSuite
	public void afterSuite() {
		driver.quit();

	}
}
