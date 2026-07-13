package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CamperVehicleDataPage extends VehicleDataPage {

	public CamperVehicleDataPage(WebDriver driver) {
		super(driver);
	}

	By NoofSeats = By.id("numberofseats");
	By righthanddrive = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span");
	By fuel = By.id("fuel");
	By payload = By.id("payload");
	By totalWeight = By.id("totalweight");
	By licensePlate = By.id("licenseplatenumber");

	public void fillCamperData() {
		fillCommonVehicleData();

		new Select(driver.findElement(NoofSeats)).selectByVisibleText("5");
		driver.findElement(righthanddrive).click();
		new Select(driver.findElement(fuel)).selectByVisibleText("Petrol");
		driver.findElement(payload).sendKeys("500");
		driver.findElement(totalWeight).sendKeys("3500");
		driver.findElement(licensePlate).sendKeys("MH22MH2233");
	}
}
