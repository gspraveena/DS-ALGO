package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.mainPage;
 

public class mainPage_pom  
{
	
 
//	public static
//	WebDriver driver=new FirefoxDriver();
	
//	String URl="https://dsportalapp.herokuapp.com";
	
	mainPage mp=new mainPage(driver);
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
    
		driver.get(URl);
//		mp.getPage();
	}
	@Given("user get into the homepage")
	public void user_get_into_the_homepage() {
	
	    mp.clickOngetStarted();
		
	}

	@Then("user click on the dropdownDS arrow")
	public void user_click_on_the_dropdown_ds_arrow() {
  
		mp.clickOndropDownDS();
	}

	@Then("user get alert message")
	public void user_get_alert_message() {
   
		mp.msg();
	}

	@Then("user click on datastructure getstarted button")
	public void user_click_on_datastructure_getstarted_button() {
	
	    mp.clickondataStructureGetstarted();
	}

	@Then("user click on register")
	public void user_click_on_register() {
		
	  mp.clickonRegister();
	}

	 
}
 
 
  

 
 
 

