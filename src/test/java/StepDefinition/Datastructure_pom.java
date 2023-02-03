package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datastructure_pom {
	
	
	WebDriver driver=new FirefoxDriver();
	 
	By getStartedDS=By.xpath("//body/div[3]/div[1]/div/div//a");
	By getTimeComplexity=By.xpath("//body/div[2]//ul/a");
		 
@When("user click getstarted in datastructure")
public void user_click_getstarted_in_datastructure() 
{
	driver.findElement(getStartedDS).click();
}

@When("click on timecomplexity")
public void click_on_timecomplexity() {
	
 driver.findElement(getTimeComplexity).click();
}

@Then("user navigate to homepage")
public void user_navigate_to_homepage() {
  
	driver.navigate().back();
}
}
