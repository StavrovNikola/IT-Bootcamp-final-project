package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsButton {

	WebDriver driver;
	WebElement widgetsButton;
	WebElement accordianButton;
	WebElement lorenButton;
	WebElement loren2Button;
	WebElement loren3Button;
	WebDriverWait wdwait;

	public WidgetsButton(WebDriver driver) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getWidgetsButton() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[1]"));
	}

	public WebElement getAccordianButton() {
		return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
	}

	public WebElement getLorenButton() {
		return driver.findElement(By.id("section1Heading"));
	}

	public WebElement getLoren2Button() {
		return driver.findElement(By.id("section2Heading"));
	}

	public WebElement getLoren3Button() {
		return driver.findElement(By.id("section3Heading"));
	}

	public void clickWidgets() {
		this.getWidgetsButton().click();
	}

	public void clickAccordian() {
		this.getAccordianButton().click();
	}

	public void clickLorenButton() {
		this.getLorenButton().click();
	}

	public void clickLoren2Button() {
		this.getLoren2Button();
	}

	public void clickLoren3Button() {
		this.getLoren3Button().click();
	}

	public void waiter(WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
