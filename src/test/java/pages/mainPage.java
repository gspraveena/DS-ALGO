package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mainPage {

	
	public static WebDriver driver=new FirefoxDriver();
 	
//	String URl="https://dsportalapp.herokuapp.com";
	
	By getStarted=By.xpath("//body/div[1]/div/div/a/button");
	By dropDownDS=By.xpath("//body/div[1]/nav/div/div[1]/div/a");
//			
	By alertMsg1=By.xpath("//body/div[2]");
	By DSgetStarted=By.xpath("//body/div[2]/div[1]/div/div/a");
	By registerBut=By.linkText("Register");
	
	public mainPage(WebDriver driver)
	{
		this.driver=driver;
	}
//	 public void getPage()
//	 {
//		driver.get(URl); 
//	 }
	public void clickOngetStarted()
	{
		
		driver.findElement(getStarted).click();
	}
	public void clickOndropDownDS()
	{
		driver.findElement(dropDownDS).click();
	}
	
	
	public void msg()
	{
		driver.findElement(alertMsg1).getText();
	}
	public void clickondataStructureGetstarted()
	{
		driver.findElement(DSgetStarted).click();
		driver.findElement(alertMsg1).isDisplayed();
	}
	public void clickonRegister()
	{
		driver.findElement(registerBut).click();
			
	}
 
}
