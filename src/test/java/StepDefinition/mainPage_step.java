package StepDefinition;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.mainPage;
import utilities.Loggerload;
 
public class mainPage_step  
{
        //WebDriver driver =new ChromeDriver();		
		//String URl="https://dsportalapp.herokuapp.com";
		
		mainPage mp=new mainPage();
		
		@Given("The user opens DS Algo portal link")
		public void the_user_opens_ds_algo_portal_link() throws IOException {
			Loggerload.info("opening DS ALGO portal link"); 
			//driver.get(URl);
            mp.getPage();
		}
	
		@When("user clicks {string} button")
		public void user_clicks_button(String string) {
		   mp.clickOngetStarted();
		}
		@Then("user should be redirected to the homepage and see {int} different collections")
		public void user_should_be_redirected_to_the_homepage_and_see_different_collections(Integer int1) {
		  String Page_Title=  mp.getPageTitle();
		  Loggerload.info("Page Title : "+Page_Title );
          assertEquals(Page_Title, "NumpyNinja", "Title do not match");
		}
		@Then("user click on the {string} dropdown arrow and sees {int} different collections")
		public void user_click_on_the_dropdown_arrow_and_sees_different_collections(String string, Integer int1) {
			mp.clickOndropDownDS();
		}
		@Then("user clicks any one collection from dropdown")
		public void user_clicks_any_one_collection_from_dropdown() {
		   mp.clickOneFromDropDown();
		}
		@Then("user get alert message {string}")
		public void user_get_alert_message(String string) {
		   String error_Message= mp.errorMessage();
		   Loggerload.info("Error Message : "+error_Message );
		}
		@Then("user click on Data Structure {string} button")
		public void user_click_on_data_structure_button(String string) {
			Loggerload.info("user click on datastructure getstarted button");
		    mp.clickondataStructureGetstarted();
		}
		@When("user clicks {string} in homePage")
		public void user_clicks_in_home_page(String string) {
			 mp.signIn();
			
		}
		@Then("user is redirected to Sign In page")
		public void user_is_redirected_to_sign_in_page() {
			String Page_Title=mp.getPageTitle();
			Loggerload.info("Page Title : "+Page_Title ); 
			assertEquals(Page_Title, "Login", "Title do not match");
		}
		@Then("user click on register")
		public void user_click_on_register() {
			Loggerload.info("user click on register");
		  mp.clickonRegister();
		}

	 
}
 
 
  

 
 
 

