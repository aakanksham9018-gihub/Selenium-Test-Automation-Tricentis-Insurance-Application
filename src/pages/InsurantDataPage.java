package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage {
	
		WebDriver driver;
		
		public InsurantDataPage (WebDriver driver) {
			this.driver = driver;
		}
		
		By firstname = By.id("firstname");
		By lastname = By.id("lastname");
		By DOB = By.id("birthdate");
		By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
		By streetadd = By.id("streetaddress");
		By country = By.id("country");
		By zipcode = By.id("zipcode");
		By city = By.id("city");
		By occupation = By.id("occupation");
		By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
		By website = By.id("website");
	
		
		By nextbtn = By.id("nextenterproductdata");
		
		
		public void fillInsurantData() {
			driver.findElement(firstname).sendKeys("Akku");
			driver.findElement(lastname).sendKeys("Malik");
			driver.findElement(DOB).sendKeys("12/11/2000");
			driver.findElement(gender).click();
			driver.findElement(streetadd).sendKeys("Aundh");
			new Select (driver.findElement(country)).selectByVisibleText("India");
			driver.findElement(zipcode).sendKeys("411034");
			driver.findElement(city).sendKeys("Pune");
			new Select (driver.findElement(occupation)).selectByVisibleText("Employee");
			driver.findElement(hobbies).click();
			driver.findElement(website).sendKeys("https://google.com");
		}
		
		public void clicknext() {
			driver.findElement(nextbtn).click();
		}
	}


