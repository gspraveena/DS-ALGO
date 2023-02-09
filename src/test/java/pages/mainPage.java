package pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crossBrowser.driverFactory;
import utilities.ConfigReader;

public class mainPage {

	public static WebDriver driver=driverFactory.getdriver();	
	//public static WebDriver driver=new ChromeDriver();
	//String URL=ConfigReader.getHomePage();
	//String URl="https://dsportalapp.herokuapp.com";
	
	By getStarted=By.xpath("//a[@href='/home']");
	@FindBy (xpath="//a[contains(text(),'Data Structures')]")WebElement dropDown;
	@FindBy (linkText ="Stack")WebElement dropDown_stack;
	@FindBy (linkText ="Sign in")WebElement sign_In;
	@FindBy (xpath="//a[contains(@href,'data-structures-introduction')]")WebElement dataStructureDropDown;
	By registerBut=By.linkText("Register");
	//alert 
	@FindBy (xpath="//*[@class='alert alert-primary']")WebElement alert_msg;
	public mainPage()
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	
	public void getPage() throws IOException
	 {
		ConfigReader.loadConfig();				
		String URL=ConfigReader.getApplicationUrl();
		driver.get(URL);		
	 }
	public void clickOngetStarted()
	{	
		driver.findElement(getStarted).click();
	}
	public void clickOndropDownDS()
	{
		dropDown.click();
	}
	public void clickOneFromDropDown() {
		dropDown_stack.click();
	}
	
	public void clickondataStructureGetstarted()
	{
	dataStructureDropDown.click();
		
	}
	public void signIn() {
		sign_In.click();
	}
	public void clickonRegister()
	{
		driver.findElement(registerBut).click();
			
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title; 
	}

	public String errorMessage() {
		String error_Message = alert_msg.getText();
		return error_Message;
	}
 
}
