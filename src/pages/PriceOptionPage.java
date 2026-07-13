package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PriceOptionPage {

	WebDriver driver;

	public PriceOptionPage(WebDriver driver) {
		this.driver = driver;
	}

	By silverPlan = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
	By nextBtn = By.id("nextsendquote");

	public void selectPricePlan() {

		driver.findElement(silverPlan).click();
	}

	public void clickNext() {

		driver.findElement(nextBtn).click();

	}
}
