package CucumberSpace.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Constant;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

	@Before
	public void setup() {
//		driver = getDriver();
		System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);

	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

}
