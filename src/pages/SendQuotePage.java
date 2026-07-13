package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuotePage {

	WebDriver driver;

	public SendQuotePage(WebDriver driver) {
		this.driver = driver;
	}

	By email = By.id("email");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.id("password");
	By confirmPassword = By.id("confirmpassword");
	By comments = By.id("Comments");
	By sendEmail = By.id("sendemail");

	public void fillQuoteData() {

		driver.findElement(email).sendKeys("akku123@gmail.com");
		driver.findElement(phone).sendKeys("8888888888");
		driver.findElement(username).sendKeys("Akku");
		driver.findElement(password).sendKeys("Akku@123");
		driver.findElement(confirmPassword).sendKeys("Akku@123");
		driver.findElement(comments).sendKeys("Insurance");
	}

	public void sendQuote() {

		driver.findElement(sendEmail).click();

	}

}
