package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicData {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\\\testdata\\\\Dynamin_myfile1.xlsx");
		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet=workbook.createSheet("dynamicData");
			try (Scanner sc = new Scanner (System.in)) {
				System.out.println("Enter number of rows ");
				int rows=sc.nextInt();
				System.out.println("Enter number of columns");
				int column=sc.nextInt();
				
				for (int r=0; r<=rows; r++)
					
					
				{
				XSSFRow Currentrow=sheet.createRow(r);
				for (int c=0; c<column; c++)
				{
					XSSFCell cell=Currentrow.createCell(c);
					cell.setCellValue(sc.next());
					

				}
				}
				
				workbook.write(file);
				workbook.close();
				file.close();
				
				System.out.println("file is created");
			}
			
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
