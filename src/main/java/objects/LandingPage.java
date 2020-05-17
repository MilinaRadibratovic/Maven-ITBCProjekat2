package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
 
	// Sends user name 
	public static void sendUsername(WebDriver driver, String user) {
		WebElement username = driver.findElement(By.name(Data.USERNAME_NAME));
		username.click(); 
		username.sendKeys(user);
	}
	
	// Sends user password
	public static void sendPassword(WebDriver driver, String pwd) {
		WebElement password = driver.findElement(By.id(Data.PASSWORD_ID));
		password.click();
		password.sendKeys(pwd);
	}

	// Clicks login button
	public static void clickLogin(WebDriver driver) {
		WebElement login = driver.findElement(By.xpath(Data.LOGIN_BTN_XPATH));
		login.click();
	} 
	
	
	
	
	
}
