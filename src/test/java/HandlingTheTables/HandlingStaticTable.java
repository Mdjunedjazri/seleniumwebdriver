package HandlingTheTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticTable {
public static void main(String[] args) throws InterruptedException {
	WebDriver d =new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://testautomationpractice.blogspot.com/");
	
	//1 to print total number of rows
	int row=d.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println("Totale Number of rows"+row);
	
	
	//2 to print total number of column 
	int colm=d.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(colm);
	
	// 3 to print specific row and column
	Thread.sleep(2000);
   String  name=	d.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
   System.out.println(name);
   
   //4 fetching all the data from the table 
   
   for (int r=2; r<=row; r++)
   {
	   for (int c=1; c<colm; c++)
	   {
		  
		   String values= d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		   System.out.print(values+"\t");
	   }
	   System.out.println();
	   
	   
   }
   
 
   
}
}
