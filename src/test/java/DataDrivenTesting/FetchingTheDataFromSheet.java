package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FetchingTheDataFromSheet {
	public static void main(String[] args) throws IOException {
		
	
	FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
	try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
		XSSFSheet  sheet=workbook.getSheetAt(0);
		int totalrow=sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		System.out.println("number of  row:"+ totalrow);
		System.out.println("number of  cell:"+totalcell);
		
		for(int r=0; r<=totalrow; r++)
		{
			
		XSSFRow currentRow=sheet.getRow(r);
		
			for (int c=0; c<totalcell; c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
				
			}
		System.out.println();
	}
}
	}
}


