package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingtables {
	public static void main(String[] args) {
	WebDriver d =new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
	int row=d.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr")).size();
	System.out.println(row);
	int colm=d.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr//th")).size();
	System.out.println(colm);
	
	
	
	for(int r=1; r<row; r++)
	{
		for (int c=1; c<colm; c++)
		{
			String values=d.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(values+"\t");
		}
		System.out.println();
	}
	
	d.quit();

}
}