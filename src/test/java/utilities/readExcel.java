package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class readExcel {
	String[][] data=null;
	WebDriver driver;
	public String[][] getExcelData() throws IOException
	{
		FileInputStream excel=new FileInputStream("C:\\Users\\Reka\\Desktop\\New\\Eclipse\\loginData1.xlsx");
		XSSFWorkbook workBook= new XSSFWorkbook(excel);
		XSSFSheet sheet=workBook.getSheetAt(0);
		int noOfRows = sheet.getLastRowNum()+1;
	    int noOfColumns = sheet.getRow(0).getLastCellNum();
	    String[][] dataTable = new String[noOfRows][noOfColumns];
	    Loggerload.info(" reading excel file");
	    for (int i = sheet.getFirstRowNum(); i < sheet.getLastRowNum() + 1; i++) {
	        Row row = sheet.getRow(i);
	        for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
	            Cell cell = row.getCell(j);
	            dataTable[i][j] = cell.getStringCellValue();
	        }
	    }
	    return dataTable;
	}
}
