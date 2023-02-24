package utilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.google.common.io.Files;
import pages.CollectionsPage;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class UsingFileOutputStreamNOTUSED {
	static String content;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// workbook object
   /*     XSSFWorkbook workbook = new XSSFWorkbook();
  
        // spreadsheet object
        XSSFSheet spreadsheet = workbook.createSheet(" output Data ");
        
        // creating a row object
        XSSFRow row;
  
        // This data needs to be written (Object[])
        //Map<String, Object[]> outputData  = new TreeMap<String, Object[]>();
        List<Map<String, String>> outputData = new ArrayList<Map<String, String>>();
        try {
			content = CollectionsPage.errorMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // writing the data into the sheets...
 
		String location=("C:\\Users\\Reka\\git\\DS-ALGO-94NN\\src\\test\\resources\\Exceldata\\LoginDsAlgo.xlsx");
//		String content="I am Reka NV hari darshana \n"
//				+ "I am learing Selenium";
		
		
		
		FileOutputStream outputStream=new FileOutputStream(location);
		// for writing raw byte array information(eg. images)
		byte[]  writeThis=content.getBytes();
		outputStream.write(writeThis);
//		workbook.write(outputStream);
		outputStream.close();
     
	  
	        // .xlsx is the format for Excel Sheets...
	        // writing the workbook into the file...
//	        FileOutputStream out = new FileOutputStream(
//	            new File("C:/savedexcel/GFGsheet.xlsx"));
*/
		try {
			content = CollectionsPage.errorMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String location1=("C:\\Users\\Reka\\git\\DS-ALGO-94NN\\src\\test\\resources\\Exceldata\\LoginDsAlgo.xlsx");
		String location="C:/Users/Reka/git/DS-ALGO-94NN/src/test/java/UsingFileOutputStream.txt";
//		String content="I am Reka NV hari darshana \n"
//				+ "I am learing Selenium";
		FileOutputStream outputStream=new FileOutputStream(location);
		// for writing raw byte array information(eg. images)
		byte[]  writeThis=content.getBytes();
		outputStream.write(writeThis);
		outputStream.close();
	}

}
