package progressive.tdd.objects;

import static progressive.tdd.common.CommonActions.validate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static progressive.tdd.common.CommonActions.*;

public class BundleSaveQuote {

	public BundleSaveQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//this first commentout test not go through every time.So comment it out and try with different one.

	/*  
	 * @FindBy(xpath = "//p[text()='Better insurance starts here']") WebElement
	 * homePageText;
	 * public void validateHomePageText(String expectedTitle) throws
	 * InterruptedException{ validate(homePageText, expectedTitle); }
	 */

	@FindBy(tagName = "h2")
	WebElement homepageTextElement;

	public void validateSelectTitle(String expectedTitle) {
		validate(homepageTextElement, expectedTitle);
	}

	@FindBy(xpath = "(//p[@class='text block-link is-simple bounce'])[1]")
	WebElement bundleSaveElement;

	public void clickBundleSave() {
		click(bundleSaveElement);
	}

	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipElement;

	public void insertZipCodeField(String zip) {
		insert(insertZipElement, zip);
	}

	@FindBy(xpath = "//input[@id='qsButton_overlay_subproducts']")
	WebElement getQuoryElement;

	public void clickGetQuory() {
		click(getQuoryElement);
	}

}
