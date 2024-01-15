package vaccine_CommonMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	WebDriver driver;

	public CommonMethods(WebDriver driver) { // constructor for the class

		this.driver = driver;
	}

	public void elementtoappear(WebElement waiting) { // Common methods defined to use common codes

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(waiting));
	}

}
