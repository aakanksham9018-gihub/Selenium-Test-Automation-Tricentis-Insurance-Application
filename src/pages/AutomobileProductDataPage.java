package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomobileProductDataPage extends ProductDataPage {

	public AutomobileProductDataPage(WebDriver driver) {
		super(driver);
	}

	By meritrating = By.id("meritrating");
	By courtesycar = By.id("courtesycar");

	public void fillProductData() {

		fillCommonProductData();

		new Select(driver.findElement(meritrating)).selectByVisibleText("Bonus 4");
		new Select(driver.findElement(courtesycar)).selectByVisibleText("No");
	}
}
