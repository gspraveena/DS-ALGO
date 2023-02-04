package StepDefinition;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.mainPage;
import utilities.Loggerload;
 
public class mainPage_pom  
{
        //WebDriver driver =new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();		
		//String URl="https://dsportalapp.herokuapp.com";
		
		mainPage mp=new mainPage();
		
		@Given("The user opens DS Algo portal link")
		public void the_user_opens_ds_algo_portal_link() throws IOException {
			Loggerload.info("opening DS ALGO portal link"); 
			//driver.get(URl);
            mp.getPage();
		}
		
		@Given("user get into the homepage")
		public void user_get_into_the_homepage() {
			Loggerload.info("user get into the homepage"); 
		    mp.clickOngetStarted();
			
		}

		@Then("user click on the dropdownDS arrow")
		public void user_click_on_the_dropdown_ds_arrow() {
			Loggerload.info("user click on the dropdownDS arrow"); 
			mp.clickOndropDownDS();
		}

		@Then("user get alert message")
		public void user_get_alert_message() {
			Loggerload.info("user get alert message");
			mp.msg();
		}

		@Then("user click on datastructure getstarted button")
		public void user_click_on_datastructure_getstarted_button() {
			Loggerload.info("user click on datastructure getstarted button");
		    mp.clickondataStructureGetstarted();
		}

		@Then("user click on register")
		public void user_click_on_register() {
			Loggerload.info("user click on register");
		  mp.clickonRegister();
		}

		 

	 
}
 
 
  

 
 
 

