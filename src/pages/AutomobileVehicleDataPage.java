package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomobileVehicleDataPage extends VehicleDataPage {

	public AutomobileVehicleDataPage(WebDriver driver) {
		super(driver);
	}
	
	By NoofSeats = By.id("numberofseats");
	By fuel = By.id("fuel");
	By licensePlate = By.id("licenseplatenumber");

	public void fillAutomobileData() {                      
		fillCommonVehicleData();

		new Select(driver.findElement(NoofSeats)).selectByVisibleText("5");
		new Select(driver.findElement(fuel)).selectByVisibleText("Petrol");
		driver.findElement(licensePlate).sendKeys("MH22MH2233");
	}
}
