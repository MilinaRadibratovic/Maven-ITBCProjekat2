package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import objects.Data;
import objects.LandingPage;

public class LandingPageTest extends BaseTest {
	
	// Testing if it is possible to login with blank fields
	@Test(priority = 1, enabled = true)
	public void loginBlankFields() throws Exception {
		driver.get(Data.SANDBOX_URL);
		LandingPage.clickLogin(driver);
		WebElement elem = driver.findElement(By.xpath(Data.LOGIN_ERROR_XPATH));
		sa.assertNotNull(elem);
		sa.assertAll();
	}

	// Testing if it is possible to login with only username
	@Test(priority = 2, enabled = true)
	public void loginFirstField() throws Exception {
		driver.get(Data.SANDBOX_URL);
		LandingPage.sendUsername(driver, Data.getUserLoginData(1, 0));
		LandingPage.clickLogin(driver);
		WebElement elem = driver.findElement(By.xpath(Data.LOGIN_ERROR_XPATH));
		sa.assertNotNull(elem);
		sa.assertAll();

	}

	// Testing if it is possible to login with only password
	@Test(priority = 3, enabled = true)
	public void loginSecondField() throws Exception {
		driver.get(Data.SANDBOX_URL);
		LandingPage.sendPassword(driver, Data.getUserLoginData(1, 1));
		LandingPage.clickLogin(driver);
		WebElement elem = driver.findElement(By.xpath(Data.LOGIN_ERROR_XPATH));
		sa.assertNotNull(elem);
		sa.assertAll();

	}
	// Testing if it is possible to login with unregistered account
	@Test(priority = 4, enabled = true)
	public void loginBothFieldsInvalid() throws Exception {
		driver.get(Data.SANDBOX_URL);
		LandingPage.sendUsername(driver, Data.getUserLoginData(2, 0));
		LandingPage.sendPassword(driver, Data.getUserLoginData(2, 1));
		LandingPage.clickLogin(driver);
		
		WebElement elem = driver.findElement(By.xpath(Data.LOGIN_INCORRECT_XPATH));
		sa.assertNotNull(elem);
		sa.assertAll();

	}

	// Testing if it is possible to login with registered account
	@Test(priority = 5, enabled = true)
	public void loginBothFieldsValid() throws Exception {
		driver.get(Data.SANDBOX_URL);
		LandingPage.sendUsername(driver, Data.getUserLoginData(1, 0));
		LandingPage.sendPassword(driver, Data.getUserLoginData(1, 1));
		LandingPage.clickLogin(driver);
		
		WebElement elem = driver.findElement(By.id(Data.ACCOUNT_AVATAR_ID));
		elem.click();
		elem=driver.findElement(By.id(Data.LOGOUT_BTN_ID));
		sa.assertNotNull(elem);
		sa.assertAll();
	}
	
}
