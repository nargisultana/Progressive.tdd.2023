package progressive.tdd.test.property;

import org.testng.Assert;
import org.testng.annotations.Test;
import progressive.tdd.base.BaseClass;
import progressive.tdd.reporting.Logs;

public class PropertyElementTest extends BaseClass {

	@Test(enabled = true, groups = "property")
	public void createJoinForFreeTest() throws InterruptedException {

		homePage.validateSelectTitle("Select a product to quote");
		homePage.clickStartNewQuote();
		Thread.sleep(5000);
		getAQuate.insertZipCode("11219");
		Thread.sleep(5000);
		getAQuate.clickGetAQuote();
		Thread.sleep(5000);
		addressPage.insertPropertyAddress("244 Dahill road, Brooklyn ,NY -11219");
		Thread.sleep(5000);
		addressPage.clickLetsGoElement();
		Thread.sleep(5000);
		propertyAddress.insertPropertyAddress("244 Dahill road");
		Thread.sleep(5000);
		propertyAddress.insertZipCode2("Brooklyn");
		propertyAddress.clickContinueQuote();
		Thread.sleep(5000);
		startPropertyAddress.insertFirstName("Sabrina");
		startPropertyAddress.insertLastName("Hasan");
		startPropertyAddress.insertDateOfBirth("05-12-2001");
		startPropertyAddress.clickNextButton();
	}

	@Test(enabled = false, priority = 0, groups = { "property",
			"non-functional" }, dependsOnMethods = "test2", ignoreMissingDependencies = true)
	public void test1() {
		Logs.log("Test1");
	}

	@Test(enabled = false, priority = 1, groups = { "property", "non-functional" }, invocationCount = 2)
	public void test2() {
		Logs.log("Test2");
	}

	@Test(enabled = false, priority = 1, groups = { "property", "non-functional" })
	public void test3() {
		Logs.log("Test3");
		Assert.fail();
	}

	@Test(enabled = false, priority = 1, groups = { "property",
			"non-functional" }, retryAnalyzer = progressive.tdd.retry.RetryFailedTests.class)
	public void testRetry() {
		Logs.log("Retry test");
		Assert.fail();
	}
}
