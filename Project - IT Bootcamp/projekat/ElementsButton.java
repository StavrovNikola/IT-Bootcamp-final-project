package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementsButton {

	WebDriver driver;
	WebElement elementsButton;
	WebElement textBoxButton;
	WebElement fullNameField;
	WebElement emailField;
	WebElement currentAddresField;
	WebElement permanentAddresField;
	WebElement submitButtonField;
	WebDriverWait wdwait;
	

	public ElementsButton(WebDriver driver) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
		
	}

	public WebElement getElementsButton() {
		return driver.findElement(By.className("card-up"));
	}

	public WebElement getTextBoxButton() {
		return driver.findElement(By.id("item-0"));
	}

	public WebElement getFullNameField() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("userEmail"));
	}

	public WebElement getCurrentAddresField() {
		return driver.findElement(By.id("currentAddress"));
	}

	public WebElement getPermanentAddresField() {
		return driver.findElement(By.id("permanentAddress"));
	}

	public WebElement getSubmitButtonField() {
		return driver.findElement(By.cssSelector(".btn.btn-primary"));
	}

	public void clickOnElement() {
		this.getElementsButton().click();

	}

	public void clickOnTextBox() {
		this.getTextBoxButton().click();
	}

	public void insertFullName(String userData) {
		this.getFullNameField().clear();
		this.getFullNameField().sendKeys(userData);
	}

	public void insertEmail(String emailData) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(emailData);
	}

	public void insertCurrentAddress(String currentAddressData) {
		this.getCurrentAddresField().clear();
		this.getCurrentAddresField().sendKeys(currentAddressData);
	}

	public void insertPermanentAddres(String permanentAddressData) {
		this.getPermanentAddresField().clear();
		this.getPermanentAddresField().sendKeys(permanentAddressData);
	}

	public void clickOnSubmit() {
		this.getSubmitButtonField().click();
	}
	
	public void waiter (WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
