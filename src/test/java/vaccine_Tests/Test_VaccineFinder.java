package vaccine_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import vaccine_PageObjects.Test_VaccineFinderPageObjects;

public class Test_VaccineFinder extends BaseTestClass {

	Test_VaccineFinderPageObjects obj;

	@Test
	public void clickonCovidCases() throws InterruptedException {

		driver.get(Url);
		obj = new Test_VaccineFinderPageObjects(driver);
		obj.clickonCovidcases();					//Testcase-1-as per manual test case shared in excel
		obj.selectstate("Andhra Pradesh");			//Testcase-2-as per manual test case shared in excel
		obj.selectdistrict("Guntur");				//Testcase-3-as per manual test case shared in excel
		Assert.assertTrue(obj.piechartdisplayed());	//Testcase-4-as per manual test case shared in excel
		obj.waitforobject1();						//waiting for the object to appear
		obj.clickontext();							//Click on text field to appear
		Assert.assertTrue(obj.textchatdisplayed());	//Testcase-5-as per manual test case shared in excel
		obj.selectstate("Kerala");					//Testcase-6-as per manual test case shared in excel
		obj.selectdistrict("Pathanamthitta");		//Testcase-7-as per manual test case shared in excel
		obj.refreshbutton();						//Testcase-8-as per manual test case shared in excel
		obj.clicktodownloadcertificate();			//Testcase-9-as per manual test case shared in excel
		obj.waitforobject2();						//waiting for the object to appear
		obj.clickoncancelbutton();					//Testcase-10-as per manual test case shared in excel

	}

}
