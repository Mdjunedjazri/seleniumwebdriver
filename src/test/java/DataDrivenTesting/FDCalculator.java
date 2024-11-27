package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver d =new ChromeDriver();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 d.manage().window().maximize();
		 d.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		String filepath=System.getProperty("user.dir")+"\\testdata\\FD Test Data.xlsx";
		int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for (int i=1; i<=rows; i++)
		{
			// 1 read data from excel 
			String Pir=ExcelUtils.getCellData(filepath, "Sheet1", 1, 0);
			String RateOfIntrest=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String Per1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String Per2=ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String freq=ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			String E_Mvalue=ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
			
			
			// 2 pass the above value 
			
			d.findElement(By.xpath("//input[@name='principal']")).sendKeys(Pir);
			d.findElement(By.xpath("//input[@name='interest']")).sendKeys(RateOfIntrest);
			d.findElement(By.xpath("//input[@name='tenure']")).sendKeys(Per1);
			
			Select day =new Select(d.findElement(By.xpath("//select[@id='tenurePeriod']")));
			day.selectByVisibleText(Per2);
			
			Select fredrp =new Select (d.findElement(By.xpath("//select[@name='frequency']")));
			fredrp.selectByVisibleText(freq);
			d.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();
			
			// validation
			
			String ActualValue=d.findElement(By.xpath("//span[@id='resp_matval']")).getText();
			if(Double.parseDouble(ActualValue)==Double.parseDouble(E_Mvalue)) {
				System.out.println("Test case pass");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Pass");
				ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
				
			}else {
				System.out.println("Test case fail");
				ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Fail");
				ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
			}
			Thread.sleep(4);
			d.findElement(By.xpath("//div[@class='CTR PT15']//a[2]")).click();
		}
		//ending for loop 
		d.quit();
	}

}
