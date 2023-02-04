package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import crossBrowser.driverFactory;
 
public class register

{
	public static WebDriver driver=driverFactory.getdriver();

	By userName = By.id("id_username");
	By password1 = By.id("id_password1");
	By password2 = By.id("id_password2");
	By registeredmsg = By.xpath("//body/div[2]");
	By errormsg = By.xpath("//body/div[3]");
	By registerButton = By.xpath("//body/div[2]/div/div[2]/form/input[5]");

	public register()
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}	
	
	public void register(String Username, String Password, String confirm_Password) throws InterruptedException {

//		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(Username);
		Thread.sleep(500);
//		driver.findElement(password1).clear();
		driver.findElement(password1).sendKeys(Password);
		Thread.sleep(500);
//		driver.findElement(password2).clear();
		driver.findElement(password2).sendKeys(confirm_Password);
		driver.findElement(registerButton).click();
	}

	public void getErrorMsg() {
		driver.findElement(errormsg).getText();
	}

	public void getRegisterAlert() {
		driver.findElement(registeredmsg).getText();
	}

	public void getSignIn()
	{
		driver.findElement(password1).click();
	}
}
