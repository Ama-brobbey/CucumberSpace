package CucumberSpace.Steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class contactUsSteps extends DriverFactory {

//WebDriver getDriver;

	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() {
		getDriver().get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@When("^i enter a valid firstname$")
	public void i_enter_a_valid_firstname() throws Throwable {
		Thread.sleep(3000);
		getDriver().findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Ama");
	}

	@When("^i enter a valid lastname$")

	public void i_enter_a_valid_lastname(DataTable dataTable)  {
		List<List<String>> data = dataTable.raw();
		getDriver().findElement(By.cssSelector("input[name=\"last_name\" ]")).sendKeys(data.get(0).get(1));

	}

	@When("^i enter a valid email address$")
	public void i_enter_a_valid_email_address() {
		getDriver().findElement(By.cssSelector("input[name=\"email\" ]")).sendKeys("ewu1@xang.com");

	}

	@When("^i enter comments$")
	public void i_enter_comments(DataTable dataTable)  {
		List<List<String>> data = dataTable.raw();
		getDriver().findElement(By.cssSelector("textarea[name=\"message\" ]")).sendKeys(data.get(0).get(0));
		getDriver().findElement(By.cssSelector("textarea[name=\"message\" ]")).sendKeys(data.get(0).get(1));
	}

	@When("^you click on the submit button$")
	public void you_click_on_the_submit_button()  {
		getDriver().findElement(By.xpath("//input[@value='SUBMIT']")).click();
	}

	@Then("^the information should be subitted via the contact us form$")
	public void the_information_should_be_subitted_via_the_contact_us_form() throws InterruptedException {
		Thread.sleep(3000);
		WebElement thanks = getDriver().findElement(By.xpath("//h1[contains(text(),'Thank You for your Message!')]"));
		Assert.assertEquals(true,thanks.isDisplayed());

	}

}
