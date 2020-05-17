package tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import objects.Data;
import objects.ProductsPage;

public class ProductPageTest extends BaseTest {

	// Adding 5 different products
	@Test(priority = 6, enabled = true)
	public void addingProducts() throws Exception {
		driver.manage().window().maximize();
		driver.navigate().to(Data.PRODUCTS_PAGE_URL);

		for (int i = 0; i < 5; i++) {
			ProductsPage.addProduct(driver);
			ProductsPage.sendProductName(driver, Data.getProductData(i, 0));
			ProductsPage.sendProductID(driver, Data.getProductData(i, 1));
			ProductsPage.sendProductPrice(driver, Data.getProductData(i, 2));
			ProductsPage.saveProduct(driver);
		}
		List<WebElement> names = driver.findElements(By.xpath(Data.PRODUCTS_XPATH));
		for (int i = 0; i < 5; i++) {
			String actuaNames = names.get(i).getText();
			sa.assertEquals(actuaNames, Data.getProductData(i, 0));
		}
		sa.assertAll();
	}

	// Changing price for five products
	@Test(priority = 7, enabled = true)
	public void priceChange() throws Exception {
		// this part navigates to edit products section
		driver.navigate().to(Data.PRODUCTS_PAGE_URL);
		WebElement editProducts = driver.findElement(By.xpath(Data.EDIT_PAGE_XPATH));
		editProducts.click();

		// Geting price, raising price and navigates to edit product section
		List<WebElement> prices = driver.findElements(By.xpath(Data.CHANGE_PRICE_XPATH));
		for (int i = 0; i < 5; i++) {
			String actual = prices.get(i).getAttribute("value");
			double priceRaise = Double.parseDouble(actual) + 100;
			String newPrice = Double.toString(priceRaise);
			Actions action = new Actions(driver);
			action.doubleClick(prices.get(i)).sendKeys(newPrice).build().perform();
		}
		ProductsPage.saveNewPrice(driver);

		// Testing if price is raised
		List<WebElement> newPrices = driver.findElements(By.xpath(Data.CHANGE_PRICE_XPATH));
		for (int i = 0; i < 5; i++) {
			String actualPrice = newPrices.get(i).getAttribute("value");
			sa.assertEquals(actualPrice, Data.getProductData(i, 3));
		}
		sa.assertAll();
	}

}
