package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreButton {

	WebDriver driver;
	WebElement bookStoreButton;
	WebElement firstBookButton;
	WebDriverWait wdwait;

	public BookStoreButton(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getBookStoreButton() {
		return driver.findElement(By.className("card-up"));
	}

	public WebElement getFirstBookButton() {
		return driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
	}

	public void openBookStore() {
		this.getBookStoreButton().click();
	}

	public void clickFirstBook() {
		this.getFirstBookButton().click();
	}

	public void waiter(WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
