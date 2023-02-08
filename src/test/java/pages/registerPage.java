package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import crossBrowser.driverFactory;
import utilities.ConfigReader;
 
public class registerPage
{
	public static WebDriver driver=driverFactory.getdriver();
	By registerBut=By.linkText("Register");
	By user_Name = By.name("username");
	By password_1 = By.name("password1");
	By password_2 = By.name("password2");
	By registeredmsg = By.xpath("//body/div[2]");
	By errormsg = By.xpath("//body/div[3]");
	By registerButton = By.xpath(" //input[@value='Register']");

	public registerPage()
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}	
	
//	public void clickonRegister()
//	{
//		driver.findElement(registerBut).click();			
//	}
	
	public void getRegisterPage() throws IOException {
		ConfigReader.loadConfig();				
		String URL=ConfigReader.getHomePage();
		driver.get(URL);
		//driver.findElement(registerBut).click();
	}
	
	public void register_link(String username, String password, String confirm_password) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(registerBut).click();
		driver.findElement(user_Name).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(password_1).sendKeys(password);
		driver.findElement(password_2).sendKeys(confirm_password);
		driver.findElement(registerButton).click();
		Thread.sleep(3000);	
	}
	
	public void getErrorMsg() {
		driver.findElement(errormsg).getText();
	}

	public void getRegisterAlert() {
		driver.findElement(registeredmsg).getText();
	}

	public void getSignIn()
	{
		//driver.findElement(password_1).click();
	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}
	
}
