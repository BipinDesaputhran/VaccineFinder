package vaccine_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

	vaccine_Utilities.ReadConfig readconfig = new vaccine_Utilities.ReadConfig();

	public String Url = readconfig.getapplicationUrl(); // "https://indian-vaccine.web.app/";
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}

}
