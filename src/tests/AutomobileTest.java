package tests;

import base.BaseTest;
import pages.AutomobileProductDataPage;
import pages.AutomobileVehicleDataPage;
import pages.HomePage;
import pages.InsurantDataPage;
import pages.PriceOptionPage;
import pages.ProductDataPage;
import pages.SendQuotePage;

public class AutomobileTest extends BaseTest {

	public static void main(String[] args) {

		// Because setup() and tearDown() are not static methods.creates an object named
		// test.
		AutomobileTest test = new AutomobileTest();

		// Browser opens.
		test.setup();

		// The driver created in setup() is passed to HomePage.
		HomePage home = new HomePage(test.driver);

		// Same for all pages:
		AutomobileVehicleDataPage vehicle = new AutomobileVehicleDataPage(test.driver);
		InsurantDataPage insurant = new InsurantDataPage(test.driver);
		AutomobileProductDataPage product = new AutomobileProductDataPage(test.driver);
		PriceOptionPage price = new PriceOptionPage(test.driver);
		SendQuotePage quote = new SendQuotePage(test.driver);

		// Inside HomePage.java
		home.Automobile();

		vehicle.fillAutomobileData();
		vehicle.clicknext();

		// Moves to Insurant Data section.Everything is grouped into one method.
		insurant.fillInsurantData();
		// Moves to Product Data page.
		insurant.clicknext();

		product.fillProductData();
		product.clicknext();

		price.selectPricePlan();
		price.clickNext();

		quote.fillQuoteData();
		quote.sendQuote();

		// Inside BaseTest method:Browser closes.
		test.teardown();
	}
}
