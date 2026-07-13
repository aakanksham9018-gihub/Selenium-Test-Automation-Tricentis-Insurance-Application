package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MotorcycleVehicleDataPage extends VehicleDataPage {

	public MotorcycleVehicleDataPage(WebDriver driver) {
		super(driver);
	}

	By model = By.id("model");
	By cylindercapacity = By.id("cylindercapacity");
	By NoofSeats = By.id("numberofseatsmotorcycle");

	public void fillMotorcycleData() {
		
		fillCommonVehicleData();

		driver.findElement(model).sendKeys("Motorcycle");
		driver.findElement(cylindercapacity).sendKeys("1587");
		new Select(driver.findElement(NoofSeats)).selectByVisibleText("2");
	}
}
