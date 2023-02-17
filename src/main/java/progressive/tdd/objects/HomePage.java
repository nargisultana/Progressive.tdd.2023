package progressive.tdd.objects;

import static progressive.tdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h2")
	WebElement homepageTextElement;

	public void validateSelectTitle(String expectedTitle) {
		validate(homepageTextElement, expectedTitle);
	}

	@FindBy(xpath = "(//span[@class='last-word'])[2]")
	WebElement getaQuate;

	public void clickStartNewQuote() {
		click(getaQuate);

	}

	// Alibaba

	/*
	 * @FindBy(className = "cr-guide") WebElement landingPageTitle;
	 * 
	 * public void validateLandingPageTitle(String expectedTitle) {
	 * validate(landingPageTitle, expectedTitle); }
	 * 
	 * @FindBy(xpath = "(//a[@class='cr-button'])[1]") WebElement
	 * joinForFreeElement;
	 * 
	 * public void clickJoinForFree() { click(joinForFreeElement); }
	 * 
	 * @FindBy(xpath = "//p[text()='Better insurance starts here']") WebElement
	 * homePageText;
	 * 
	 * public void validateHomePageText(String expectedTitle) throws
	 * InterruptedException{ validate(homePageText, expectedTitle); }
	 */

}
