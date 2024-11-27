package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("manual");
		row.createCell(1).setCellValue(28);
		row.createCell(2).setCellValue("num");
		
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("sql");
		row1.createCell(1).setCellValue(28);
		row1.createCell(2).setCellValue("num");
		
		XSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue("automation");
		row2.createCell(1).setCellValue(28);
		row2.createCell(2).setCellValue("num");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		
		
	}

}
