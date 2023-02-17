package progressive.tdd.objects;

import static progressive.tdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAQuate {
	
	public GetAQuate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='zipCode_overlay_subproducts']")
	WebElement insertZipCodElement;
	
	public void insertZipCode(String zip) {
		insert(insertZipCodElement, zip);

	}
	@FindBy(xpath = "(//input[@name='qsButton'])[3]")
	WebElement getAQuote;
	
	public void clickGetAQuote() {
		click(getAQuote);
	}

	
	
	
	/*@FindBy(className = "(//span[@class='quotebox_heading category-header headline'])[1]")
	WebElement getAQuotePageTitle;
	@FindBy(className = "(//div[@class='icon-dropdown__item1'])[2]")
	WebElement homeIcon;
	@FindBy(id = "//input[@id='zipCodeInputEl']")
	WebElement zipCode;
	@FindBy(xpath = "(//button[contains(text(),'start my quote')])[2]")
	WebElement startMyQuote;

	public void validateGetAquotePageTitle(String expected) {
		validate(homeIcon, expected);
	}
	public void insertZipCode() {
	
	
	@FindBy (xpath = "//input[@id='zipCodeInputEl']")

	WebElement insertZipCodeField;
	
	public void insertZipCode(String Zip) {
		insert(insertZipCodeField, Zip) ;
	}
	@FindBy(xpath = "//button[@id='btnStart']")
	WebElement startMyQuotElement;
	
	public void clickStartMyQuote() {
		startMyQuotElement.click();
	}*/
	
		
}
