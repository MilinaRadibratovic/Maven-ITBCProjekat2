package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	
	public static void addProduct(WebDriver driver) {
		WebElement addProducts = driver.findElement(By.xpath(Data.ADD_PRODUCT_XPATH));
		addProducts.click(); 
	}
	
	public static void sendProductName(WebDriver driver,String name) {
		WebElement productName = driver.findElement(By.xpath(Data.PRODUCT_NAME_XPATH));
		productName.click(); 
		productName.sendKeys(name);
	}
	
	public static void sendProductID(WebDriver driver,String id) {
		WebElement productId = driver.findElement(By.xpath(Data.PRODUCT_ID_XPATH));
		productId.click(); 
		productId.sendKeys(id);
	}
	
	public static void sendProductPrice(WebDriver driver,String price) {
		WebElement productPrice = driver.findElement(By.xpath(Data.PRODUCT_PRICE_XPATH));
		productPrice.click(); 
		productPrice.sendKeys(price);
	}
	
	public static void saveProduct(WebDriver driver) {
		WebElement saveProduct = driver.findElement(By.xpath(Data.SAVE_PRODUCT_XPATH));
		saveProduct.click(); 
		saveProduct=driver.findElement(By.xpath(Data.PRODUCTS_PAGE_XPATH));
		saveProduct.click();
		driver.navigate().to(Data.PRODUCTS_PAGE_URL);
	}
	
	public static void saveNewPrice(WebDriver driver) {
		WebElement savePrice = driver.findElement(By.xpath(Data.SAVE_CHANGES_XPATH));
		savePrice.click();
		WebElement editProducts = driver.findElement(By.xpath(Data.EDIT_PAGE_XPATH));
		editProducts.click();
		
	}

}
