package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int tab_size=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Table size is "+tab_size);
		
		int row_size=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Table size is "+row_size);
		
		
		 for (int r=2; r<=tab_size; r++)
		   {
			   for (int c=1; c<row_size; c++)
			   {
				  
				   String values= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				   System.out.print(values+"\t");
			   }
			   System.out.println();
			   
			   
		   }
		
		
	}

}
