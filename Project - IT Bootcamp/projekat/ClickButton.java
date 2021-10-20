package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickButton {

	WebDriver driver;
	WebElement bannerImage;

	public ClickButton(WebDriver driver) {
		super();
		this.driver = driver;

	}

	public WebElement getBannerImage() {
		return driver.findElement(By.className("banner-image"));

	}

	public void clickOnBanner() {
		this.getBannerImage().click();
	}

}