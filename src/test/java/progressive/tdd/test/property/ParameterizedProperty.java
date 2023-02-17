package progressive.tdd.test.property;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import progressive.tdd.base.BaseClass;

public class ParameterizedProperty extends BaseClass {

	@Parameters({ "expectedPageTitle1", "zipCode1", "PropertyAddress1", "Address1", "zipCode21", "firstName1",
			"lastName1", "dateOfBirth1" })
	@Test(enabled = true, groups = "property")
	public void createJoinForFreeTest(String expectedPageTitle, String zipCode, String PropertyAddress, String Address,
			String zipCode2, String firstName, String lastName, String dateOfBirth) throws InterruptedException {

		homePage.validateSelectTitle(expectedPageTitle);
		homePage.clickStartNewQuote();
		Thread.sleep(5000);
		getAQuate.insertZipCode(zipCode);
		Thread.sleep(5000);
		getAQuate.clickGetAQuote();
		Thread.sleep(5000);
		addressPage.insertPropertyAddress(PropertyAddress);
		Thread.sleep(5000);
		addressPage.clickLetsGoElement();
		Thread.sleep(5000);
		propertyAddress.insertPropertyAddress(Address);
		Thread.sleep(5000);
		propertyAddress.insertZipCode2(zipCode2);
		propertyAddress.clickContinueQuote();
		startPropertyAddress.insertFirstName(firstName);
		startPropertyAddress.insertLastName(lastName);
		startPropertyAddress.insertDateOfBirth(dateOfBirth);
		startPropertyAddress.clickNextButton();
	}

	@Parameters({ "expectedPageTitle1", "zipCode1", "PropertyAddress1", "Address1", "zipCode21", "firstName1",
			"lastName1", "dateOfBirth1" })
	@Test(enabled = false, groups = "property")
	public void create_PropertyForFreeTest(String expectedPageTitle, String zipCode, String PropertyAddress,
			String Address, String zipCode2, String firstName, String lastName, String dateOfBirth)
			throws InterruptedException {

		homePage.validateSelectTitle(expectedPageTitle);
		homePage.clickStartNewQuote();
		Thread.sleep(5000);
		getAQuate.insertZipCode(zipCode);
		Thread.sleep(5000);
		getAQuate.clickGetAQuote();
		Thread.sleep(5000);
		addressPage.insertPropertyAddress(PropertyAddress);
		Thread.sleep(5000);
		addressPage.clickLetsGoElement();
		Thread.sleep(5000);
		propertyAddress.insertPropertyAddress(Address);
		Thread.sleep(5000);
		propertyAddress.insertZipCode2(zipCode2);
		propertyAddress.clickContinueQuote();
		startPropertyAddress.insertFirstName(firstName);
		startPropertyAddress.insertLastName(lastName);
		startPropertyAddress.insertDateOfBirth(dateOfBirth);
		startPropertyAddress.clickNextButton();
	}

}
