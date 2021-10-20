package projekat;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestKlasa extends BaseTest {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");

	}

	@Test(priority = 10)
	public void openBanner() {
		clickButton.clickOnBanner();

	}

	@Test(priority = 20)
	public void openElements()  {

		
		String fullName = excelReader.getStringData("data", 1, 2);
		String email = excelReader.getStringData("data", 1, 3);
		String currentAddress = excelReader.getStringData("data", 1, 4);
		String permanentAddress = excelReader.getStringData("data", 1, 5);
		
		elementsButton.clickOnElement();
		elementsButton.clickOnTextBox();
		elementsButton.insertFullName(fullName);
		elementsButton.insertEmail(email);
		elementsButton.insertCurrentAddress(currentAddress);
		elementsButton.insertPermanentAddres(permanentAddress);
	
		elementsButton.clickOnSubmit();

	}

	@Test(priority = 30)
	public void openForm() throws InterruptedException {
		
		String studentsName = excelReader.getStringData("data", 7, 2);
		String studentsLastName = excelReader.getStringData("data", 7, 3);
		String studentsEmail = excelReader.getStringData("data", 7, 4);
		String studentsMobile = excelReader.getStringData("data", 7, 5);
		String studentsAddress = excelReader.getStringData("data", 7, 6);
		
		formsButton.clickOnForm();
		formsButton.clickOnPracticeForm();
		formsButton.insertStudentsName(studentsName);
		formsButton.insertStudentsLastName(studentsLastName);
		formsButton.insertStudentsEmail(studentsEmail);
		formsButton.clickStudentsGender();
		formsButton.insertStudentsMobile(studentsMobile);
		formsButton.clickStudentsHobbies();
		formsButton.insertStudentsAddress(studentsAddress);
		Thread.sleep(2000);
		formsButton.clickStudentSubmit();

	}

	@Test(priority = 40)
	public void openAlerts() {
		alertsButton.clickOnAlerts();
		alertsButton.clickOnBrowserButton();
		alertsButton.clickOnNewTab();
		alertsButton.clickOnNewWindow();
		alertsButton.clickOnNewMessage();
	}

	@Test(priority = 50)
	public void openWidgets() {
		widgetsButton.clickWidgets();
		widgetsButton.clickAccordian();
		widgetsButton.clickLorenButton();
		widgetsButton.clickLoren2Button();
		widgetsButton.clickLoren3Button();
	}

	@Test(priority = 60)
	public void openInteractions() {
		interactionsButton.openInteraction();
		interactionsButton.clickSortable();
		interactionsButton.clickGrid();
		interactionsButton.clickOneCube();
	}

	@Test(priority = 70)
	public void openBookStore() {
		bookStoreButton.openBookStore();
		bookStoreButton.clickFirstBook();
	}
}
