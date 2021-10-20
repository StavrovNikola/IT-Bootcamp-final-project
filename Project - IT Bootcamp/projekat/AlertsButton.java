package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsButton {

	WebDriver driver;
	WebElement alertsButton;
	WebElement browserButton;
	WebElement newTabButton;
	WebElement newWindowButton;
	WebElement newWindowMessage;
	WebDriverWait wdwait;

	public AlertsButton(WebDriver driver) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getAlertsButton() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[1]"));
	}

	public WebElement getBrowserButton() {
		return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
	}

	public WebElement getNewTabButton() {
		return driver.findElement(By.id("tabButton"));
	}

	public WebElement getNewWindowButton() {
		return driver.findElement(By.id("windowButton"));
	}

	public WebElement getNewWindowMessage() {
		return driver.findElement(By.id("messageWindowButton"));
	}

	public void clickOnAlerts() {
		this.getAlertsButton().click();
	}

	public void clickOnBrowserButton() {
		this.getBrowserButton().click();
	}

	public void clickOnNewTab() {
		this.getNewTabButton().click();
	}

	public void clickOnNewWindow() {
		this.getNewWindowButton().click();
	}

	public void clickOnNewMessage() {
		this.getNewWindowMessage().click();
	}

	public void waiter(WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
