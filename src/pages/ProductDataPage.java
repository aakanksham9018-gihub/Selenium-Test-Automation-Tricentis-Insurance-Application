package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage {

	WebDriver driver;

	public ProductDataPage(WebDriver driver) {
		this.driver = driver;
	}

	By startdate = By.id("startdate");
	By insurancesum = By.id("insurancesum");
	By damageinsurance = By.id("damageinsurance");
	By OptionalProduct = By.xpath("//label[normalize-space()='Euro Protection']//span[@class='ideal-check']");

	By clickbtn = By.id("nextselectpriceoption");

	public void fillCommonProductData() {
		driver.findElement(startdate).sendKeys("09/28/2026");
		new Select(driver.findElement(insurancesum)).selectByVisibleText("7.000.000,00");
		new Select(driver.findElement(damageinsurance)).selectByVisibleText("Partial Coverage");
		driver.findElement(OptionalProduct).click();
	}

	public void clicknext() {
		driver.findElement(clickbtn).click();
	}
}
