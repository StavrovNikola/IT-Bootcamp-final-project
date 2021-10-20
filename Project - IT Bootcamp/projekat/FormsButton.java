package projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsButton {

	WebDriver driver;
	WebElement formsButton;
	WebElement practiceFormButton;
	WebElement studentFirstName;
	WebElement studentLastName;
	WebElement studentEmail;
	WebElement studentGender;
	WebElement studentMobile;
	WebElement studentHobbie;
	WebElement studentAddress;
	WebElement studentSubmit;
	WebDriverWait wdwait;

	public FormsButton(WebDriver driver) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getFormsButton() {
		return driver.findElement(By.className("group-header"));
	}

	public WebElement getPracticeFormButton() {
		return driver.findElement(By.id("item-0"));
	}

	public WebElement getStudentFirstName() {
		return driver.findElement(By.id("firstName"));
	}

	public WebElement getStudentLastName() {
		return driver.findElement(By.id("lastName"));
	}

	public WebElement getStudentEmail() {
		return driver.findElement(By.id("userEmail"));
	}

	public WebElement getStudentGender() {
		return driver.findElement(By.className("custom-control-label"));
	}

	public WebElement getStudentMobile() {
		return driver.findElement(By.id("userNumber"));
	}

	public WebElement getStudentHobbie() {
		return driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[1]/label"));
	}

	public WebElement getStudentAddress() {
		return driver.findElement(By.id("currentAddress"));
	}

	public WebElement getStudentSubmit() {
		return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	}

	public void clickOnForm() {
		this.getFormsButton().click();
	}

	public void clickOnPracticeForm() {
		this.getPracticeFormButton().click();
	}

	public void insertStudentsName(String studentsData) {
		this.getStudentFirstName().clear();
		this.getStudentFirstName().sendKeys(studentsData);
	}

	public void insertStudentsLastName(String studentsLastData) {
		this.getStudentLastName().clear();
		this.getStudentLastName().sendKeys(studentsLastData);
	}

	public void insertStudentsEmail(String studentsEData) {
		this.getStudentEmail().clear();
		this.getStudentEmail().sendKeys(studentsEData);
	}

	public void clickStudentsGender() {
		this.getStudentGender().click();
	}

	public void insertStudentsMobile(String studentsMobileData) {
		this.getStudentMobile().clear();
		this.getStudentMobile().sendKeys(studentsMobileData);
	}

	public void clickStudentsHobbies() {
		this.getStudentHobbie().click();
	}

	public void insertStudentsAddress(String studentsAddressData) {
		this.getStudentAddress().clear();
		this.getStudentAddress().sendKeys(studentsAddressData);
	}

	public void clickStudentSubmit() {
		this.getStudentSubmit().click();
	}
	
	public void waiter (WebElement element) {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
