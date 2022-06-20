package CucumberSpace.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class productSteps extends DriverFactory {
	WebDriver driver;



@Given("^user navigates to \"([^\"]*)\" website$")
public void user_navigates_to_website(String url) throws Throwable {
	Thread.sleep(3000);
	getDriver().get(url);
    
}

@When("^user clicks on the \"([^\"]*)\"$")
public void user_clicks_on_the(String button) throws Throwable {
	getDriver().findElement(By.id(button)).click();
    
}

@Then("^user should be presented with a promo alert$")
public void user_should_be_presented_with_a_promo_alert() throws Throwable {
	Thread.sleep(3000);
	getDriver().findElement(By.xpath("//button[text()='Proceed']")).click();
    
}

}
