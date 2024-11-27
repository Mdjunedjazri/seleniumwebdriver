package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hanlingTables {
	public static void main(String[] args) {
		
	
	WebDriver d =new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://testautomationpractice.blogspot.com/");
	
	int row=d.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println(row);
	
	int colmn=d.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
	System.out.println(colmn);
	
	for(int r=2; r<row; r++)
	{
		for(int c=1; c<colmn; c++)
		{
			String values=d.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		
			System.out.print(values+"\t");
		}
		System.err.println();
	}

}
}
