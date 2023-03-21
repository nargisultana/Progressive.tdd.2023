package progressive.tdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.Status;
import static progressive.tdd.utils.IConstant.*;

import java.lang.reflect.Method;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import progressive.tdd.objects.AddressPage;
import progressive.tdd.objects.BundleSaveQuote;
import progressive.tdd.objects.GetAQuate;
import progressive.tdd.objects.HomePage;
import progressive.tdd.objects.MailingAddress;
import progressive.tdd.objects.PropertyAddress;
import progressive.tdd.objects.StartPropertyQuote;

import progressive.tdd.utils.Constant;
import progressive.tdd.utils.ReadProperties;

public class BaseClass extends ExtentListener {

	protected WebDriver driver;

	protected HomePage homePage;
	protected GetAQuate getAQuate;
	protected AddressPage addressPage;
	protected PropertyAddress propertyAddress;
	protected StartPropertyQuote startPropertyAddress;
	protected BundleSaveQuote bundleSaveQuote;
	protected MailingAddress mailingAddress;
	ReadProperties envVar = new ReadProperties();

	@Parameters({"browser"})
	@BeforeMethod
	public void setUpDriver(String browserName) {
		// Enum example
		// String browserName = envVar.getProperty(getString(browser));
		// String browserName = envVar.getProperty(browser.name());
		//String browserName = envVar.getProperty(BROWSER);
		String givenUrl = envVar.getProperty(URL);
		long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);
		long implicitwait = envVar.getNumProperty(IMPLICIT_WAIT);

		initDriver(browserName);
		initClasses(driver);
		driver.get(givenUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
	}

	private void initClasses(WebDriver driver) {
		homePage = new HomePage(driver);
		getAQuate = new GetAQuate(driver);
		addressPage = new AddressPage(driver);
		propertyAddress = new PropertyAddress(driver);
		startPropertyAddress = new StartPropertyQuote(driver);
		bundleSaveQuote = new BundleSaveQuote(driver);
		mailingAddress = new MailingAddress(driver);
	}

	private void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

	@AfterMethod
	public void getResult(ITestResult result, Method method) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, PASSED);
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, FAILED);
			test.addScreenCaptureFromPath(captureScreenShot(driver, method.getName()));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, SKIPPED);
		}
	}

	@SuppressWarnings("unused")
	private String getString(Constant constant) {
		return constant.name();
	}
}
