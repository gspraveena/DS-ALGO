package pages;
import java.io.FileInputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import crossBrowser.driverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;

public class CollectionsPage {
	public static WebDriver driver=driverFactory.getdriver();
  //******************************  Login  ***************************************
    By login_Username=By.name("username");
    By login_Password=By.name("password");;
    By login_Button=By.xpath("//input[@value='Login']");
    
  //******************************  DataStructure  ***************************************
    private static Properties properties;
    ElementsUtils eleUtil = new ElementsUtils();
    String DataStructureURL="https://dsportalapp.herokuapp.com/data-structures-introduction/";
  //By getStartedDS=By.xpath("//a[@href='data-structures-introduction']");
	String tryEditorURL=ConfigReader.tryEditorURL();	   
	By getTimeComplexity=By.xpath("//a[contains(text(),'Time Complexity')]");
	By tryhere=By.xpath("//a[contains(text(),'Try here>>>')]");
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	//By editorInput=By.xpath("//textarea[@tabindex='0']");
	//@FindBy (xpath="//textarea[contains(@id,'editor')]")WebElement editorInput;
	By enterPythonText=By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	//By whiteBox=By.xpath("//span[@class='cm-builtin']");
	By runButton=By.xpath("//button[contains(text(),'Run')]");
	By runBtn=By.xpath("//form[@id='answer_form']//button");
	By pythonOutPut=By.id("output");
	
  //******************************  Array  ***************************************	
	@FindBy (xpath="//a[contains(@href,'array')]")WebElement arrayLink;
	@FindBy (xpath="//a[contains(text(),'Arrays in Python')]")WebElement arraysInPython;
	@FindBy (xpath="//a[contains(text(),'Try here>>>')]")WebElement tryHere;
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
	public CollectionsPage()
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}	
	
	//******************************  Login  ***************************************
	public void LoginPage() throws IOException {
		ConfigReader.loadConfig();				
		String URL=ConfigReader.getLoginPage();
		driver.get(URL);
	}

	
	public void loginWithCredentials(String username, String password) throws InterruptedException {
		driver.findElement(login_Username).sendKeys(username);	
		driver.findElement(login_Password).sendKeys(password);
		driver.findElement(login_Button).click();
	}
	
	public String login_page() {
		String title = driver.getTitle();
		return title;
	}
	
	//******************************  Data Structure  ***************************************
//	public void dataStructPage() throws IOException {	
//		//String url = properties.getProperty("DataStructuresIntroduction");		
//		driver.get(DataStructureURL);
//	}
	
	public void dataStructure()
	{
		//driver.findElement(getStartedDS).click();	
		driver.get(DataStructureURL);
	}
	
	public void TryHere() 	
	{   JavascriptExecutor executor= (JavascriptExecutor) driver;
	    executor.executeScript("window.scrollBy(0,750)", "");
		driver.findElement(getTimeComplexity).click();
		driver.findElement(tryhere).click();	
	}
	public void enterPythonCode(int sheetNumber, int rownumber) throws InvalidFormatException, IOException 
	{		
		String code=eleUtil.getCodefromExcel(sheetNumber, rownumber);
		eleUtil.enterCode(code,editorInput);
		driver.findElement(runButton).click();		
	}
	
	public String getExpectedResult(Integer sheetNumber, Integer rowNumber) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetNumber, rowNumber);
		return expectedResult;
	}
	
	public void backToHome() throws IOException {
		ConfigReader.loadConfig();				
		String URL=ConfigReader.getHomePage();
		driver.get(URL);
		
	}
	
	//******************************  Array  ***************************************

	public void clickArray() throws IOException {
		ConfigReader.loadConfig();				
		String URL=ConfigReader.getArrayUrl();
		driver.get(URL);
		
	}
	public void clickArrayInPython() {
		arraysInPython.click();
	}
	public void clicktryHere() {
		tryHere.click();
	}
	public void enterPythonCode(String sheetName, int rownumber) throws InvalidFormatException, IOException 
	{		
		String code=eleUtil.getCodefromExcel(sheetName, rownumber);
		eleUtil.enterCode(code,editorInput);
		driver.findElement(runButton).click();		
	}
	public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNumber);
		return expectedResult;
	}

	
}
