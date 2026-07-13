package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage {

	WebDriver driver;

	public VehicleDataPage(WebDriver driver) {
		this.driver = driver;
	}

	By make = By.id("make");
	By enginePerformance = By.id("engineperformance");
	By manufacturingDate = By.id("dateofmanufacture");
	By listPrice = By.id("listprice");
	By annualMileage = By.id("annualmileage");

	By nextbtn = By.id("nextenterinsurantdata");

	public void fillCommonVehicleData() {
		new Select(driver.findElement(make)).selectByVisibleText("Honda");
		driver.findElement(enginePerformance).sendKeys("1000");
		driver.findElement(manufacturingDate).sendKeys("06/09/2026");
		driver.findElement(listPrice).sendKeys("10000");
		driver.findElement(annualMileage).sendKeys("10000");
	}

	public void clicknext() {
		driver.findElement(nextbtn).click();
	}

}
