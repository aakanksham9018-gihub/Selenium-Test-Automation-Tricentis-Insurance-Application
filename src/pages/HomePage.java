package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By automotive = By.id("nav_automobile");
	By truck = By.id("nav_truck");
	By motorcycle = By.id("nav_motorcycle");
	By camper = By.id("nav_camper");

	public void Automobile() {
		driver.findElement(automotive).click();
	}

	public void truck() {
		driver.findElement(truck).click();
	}

	public void motorcycle() {
		driver.findElement(motorcycle).click();
	}

	public void camper() {
		driver.findElement(camper).click();
	}
}
