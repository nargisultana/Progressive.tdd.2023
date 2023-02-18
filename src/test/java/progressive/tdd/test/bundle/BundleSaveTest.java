package progressive.tdd.test.bundle;

import org.testng.annotations.Test;

import progressive.tdd.base.BaseClass;

public class BundleSaveTest extends BaseClass {

	@Test(enabled = true, priority = 2, groups = "bundle")
	public void createA_AutoQuote() throws InterruptedException {

		bundleSaveQuote.validateSelectTitle("Select a product to quote");
		bundleSaveQuote.clickBundleSave();
		Thread.sleep(5000);
		bundleSaveQuote.insertZipCodeField("11219");
		Thread.sleep(5000);
		bundleSaveQuote.clickGetQuory();
		Thread.sleep(5000);
		mailingAddress.insertFirstName("Sultana");
		Thread.sleep(5000);
		mailingAddress.insertDateOfBirth("06-12-2008");
		Thread.sleep(5000);
		mailingAddress.insertStreetNumber("244 Dahill Road");
		Thread.sleep(5000);
		mailingAddress.insertCityAddress("Brooklyn");
		Thread.sleep(5000);

	}
}