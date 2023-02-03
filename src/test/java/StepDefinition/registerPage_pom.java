package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.register;
import pages.mainPage;

public class registerPage_pom {

	WebDriver driver = new ChromeDriver();

//	String url = "https://dsportalapp.herokuapp.com/register";

	register rp=new register(driver);

//	@Given("user open the register page")
//	public void user_open_the_register_page() {

//		driver.get(url);
//	}

	@When("The user clicks {string} button after entering Numpysdet94, sdet94batch and sdet94batch")
	public void the_user_clicks_button_after_entering_numpysdet94_sdet94batch_and_sdet94batch(String string) throws InterruptedException {
		
		rp.register(string, string, string);
	}

	@Then("User get message {string}")
	public void user_get_message(String string) 
	{
		rp.getErrorMsg();
	}

	@Then("It should go to homepage and get message  {string}")
	public void it_should_go_to_homepage_and_get_message(String string)
	{
		rp.getRegisterAlert();
		rp.getSignIn();
	}
}
