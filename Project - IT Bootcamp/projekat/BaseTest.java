package projekat;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public static WebDriver driver;
	public static ClickButton clickButton;
	public static ElementsButton elementsButton;
	public static FormsButton formsButton;
	public static AlertsButton alertsButton;
	public static WidgetsButton widgetsButton;
	public static InteractionsButton interactionsButton;
	public static BookStoreButton bookStoreButton;
	public static ExcelReader excelReader;
	public static WebDriverWait wdwait;

	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.gecko.driver", "driver-lib\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
		clickButton = new ClickButton(driver);
		elementsButton = new ElementsButton(driver);
		formsButton = new FormsButton(driver);
		alertsButton = new AlertsButton(driver);
		widgetsButton = new WidgetsButton(driver);
		interactionsButton = new InteractionsButton(driver);
		bookStoreButton = new BookStoreButton(driver);
		excelReader = new ExcelReader("C:/Users/stavr/Desktop/IT Bootcamp/Project - IT Bootcamp/DataProject.xlsx");
	}

}
