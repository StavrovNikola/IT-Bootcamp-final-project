package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsButton {

	WebDriver driver;
	WebElement interactionButton;
	WebElement sortableButton;
	WebElement gridButton;
	WebElement oneCubeButton;
	WebDriverWait wdwait;

	public InteractionsButton(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getInteractionButton() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[1]"));
	}

	public WebElement getSortableButton() {
		return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
	}

	public WebElement getGridButton() {
		return driver.findElement(By.id("demo-tab-grid"));
	}

	public WebElement getOneCubeButton() {
		return driver.findElement(By.cssSelector(".list-group-item.list-group-item-action"));
	}

	public void openInteraction() {
		this.getInteractionButton().click();
	}

	public void clickSortable() {
		this.getSortableButton().click();
	}

	public void clickGrid() {
		this.getGridButton();
	}

	public void clickOneCube() {
		this.getOneCubeButton();
	}

	public void waiter(WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
