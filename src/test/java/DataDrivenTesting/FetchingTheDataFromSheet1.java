package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchingTheDataFromSheet1 {
	public static void main(String[] args) throws IOException {
		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Pre-Prod Userlist(AutoRecovered).xlsx");
	try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(1).getLastCellNum();
		System.out.println("the number of rows are "+row);
		System.out.println("the number of rows are "+cell);
		workbook.close();
		file.close();
	}
	}

}
