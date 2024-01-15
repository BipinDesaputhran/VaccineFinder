package vaccine_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import vaccine_CommonMethods.CommonMethods;

public class Test_VaccineFinderPageObjects extends CommonMethods {

	WebDriver driver;

	public Test_VaccineFinderPageObjects(WebDriver driver) { // Constructor for the class

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ***********Locators allocated to webelemets*************//

	@FindBy(xpath = "//a[text()='Covid Cases']")
	WebElement coivdcases;

	@FindBy(xpath = "//select[@name='selectedState']")
	WebElement State;

	@FindBy(xpath = "//select[@name='selectedDistrict']")
	WebElement district;

	@FindBy(css = "button.active.mr-2.btn.btn-outline-info.btn-sm")
	WebElement piechart;

	@FindBy(xpath = "//button[@type='button'][2]")
	WebElement waitforobject1;

	@FindBy(xpath = "//h5[text()='Download Certificate in Whatsapp']")
	WebElement waitforobject2;

	@FindBy(xpath = "//button[@type='button'][2]")
	WebElement textclick;

	@FindBy(css = "button.active.btn.btn-outline-info.btn-sm")
	WebElement textdetails;

	@FindBy(css = "button.mt-2.btn.btn-outline-info.btn-sm")
	WebElement refreshbutton;

	@FindBy(xpath = "//a[text()='Download Certificate']")
	WebElement downloadcertificate;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	WebElement cancelbutton;

	// ************Methods declared for the locators********************//

	public void clickonCovidcases() {

		coivdcases.click();
	}

	public void selectstate(String value) {
		Select state = new Select(State);
		state.selectByValue(value);

	}

	public void waitforobject1() {
		elementtoappear(waitforobject1);
	}

	public void waitforobject2() {
		elementtoappear(waitforobject2);
	}

	public void selectdistrict(String distrcit) {
		Select state = new Select(district);
		state.selectByValue(distrcit);

	}

	public boolean piechartdisplayed() {
		return piechart.isDisplayed();
	}

	public void clickontext() {
		textclick.click();
	}

	public boolean textchatdisplayed() {
		return textdetails.isDisplayed();
	}

	public void refreshbutton() {
		refreshbutton.click();
	}

	public void clicktodownloadcertificate() {
		downloadcertificate.click();
	}

	public void clickoncancelbutton() {
		cancelbutton.click();
	}
}
