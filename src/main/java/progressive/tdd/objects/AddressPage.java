package progressive.tdd.objects;

import static progressive.tdd.common.CommonActions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public AddressPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='singleLineAddress']")
	WebElement insertPropertyAddress;
	
	public void insertPropertyAddress(String property) {
		insert(insertPropertyAddress, property );
	}
	@FindBy(xpath = "(//input[@id='paButtonSingleLine'])[1]")
	WebElement letsGoElement;
	
	public void clickLetsGoElement() {
		click(letsGoElement);
	}
	
	

	
	
	
	
	
	
		
	
	
	/*
	@FindBy(xpath = "//input[@id='PRIMARYFirstName']")
	WebElement firstName;
	public void inputFirstName() {
		firstName.sendKeys("Nargis");
	}
	@FindBy(xpath = "//input[@id='PRIMARYLastName']")
	WebElement lastName;
	public void inputLastName() {
		firstName.sendKeys("akter");
	}
	
	@FindBy(xpath ="//input[@name='CURRENTAddressLine1']")
	WebElement streetAddress;
	
	public void inputStreetAddress() {
		streetAddress.sendKeys("26 Court st");
	}
	@FindBy(xpath = "//input[@class='input width-control--md ng-pristine ng-valid ng-touched']")
    WebElement aptNumber;
	
	public void inputAptNumber() {
		aptNumber.sendKeys("Apt# B11");
	}
	@FindBy(xpath = "//input[@name='CURRENTCity']")
	WebElement cityElement;
	
	public void inputCityElement() {
		cityElement.sendKeys("Brooklyn");
	}
	@FindBy(xpath = "//span[text()=' Yes ']")
	WebElement verifyAddressOnInsure;
	
	public void clickAddressVerify() {
		verifyAddressOnInsure.click();
	}
	@FindBy(xpath = "//input[@id='PrimaryDOB']")
	WebElement dateOfBirth;
	public void inputDateOfBirth() {
		dateOfBirth.sendKeys("01-25-2001");
	}
	@FindBy(id="btn_next")
	WebElement nextBtn;
	public void clickNextBtn() {
		nextBtn.click();
	}*/
	

}
