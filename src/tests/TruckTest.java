package tests;

import base.BaseTest;
import pages.HomePage;
import pages.InsurantDataPage;
import pages.PriceOptionPage;
import pages.ProductDataPage;
import pages.SendQuotePage;

import pages.TruckVehicleDataPage;

public class TruckTest extends BaseTest{

	public static void main(String[] args) {

		// Because setup() and tearDown() are not static methods.creates an object named
		// test.
		TruckTest test = new TruckTest();

		// Browser opens.
		test.setup();

		// The driver created in setup() is passed to HomePage.
		HomePage home = new HomePage(test.driver);

		// Same for all pages:
		TruckVehicleDataPage vehicle = new TruckVehicleDataPage(test.driver);
		InsurantDataPage insurant = new InsurantDataPage(test.driver);
		ProductDataPage product = new ProductDataPage(test.driver);
		PriceOptionPage price = new PriceOptionPage(test.driver);
		SendQuotePage quote = new SendQuotePage(test.driver);

		// Inside HomePage.java
		home.truck();

		vehicle.fillTruckData();
		vehicle.clicknext();

		// Moves to Insurant Data section.Everything is grouped into one method.
		insurant.fillInsurantData();
		// Moves to Product Data page.
		insurant.clicknext();

		product.fillCommonProductData();
		product.clicknext();

		price.selectPricePlan();
		price.clickNext();

		quote.fillQuoteData();
		quote.sendQuote();

		// Inside BaseTest method:Browser closes.
		test.teardown();
	}
}
