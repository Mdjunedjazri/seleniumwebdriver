package Practice9_12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String year="2029";
		String month="May";
		String date="26";
		 
		driver.findElement(By.xpath("//p[normalize-space()='Date Picker 1:']//input[@type='text']")).click();
		
		// select month and year 
		
		while(true) 
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if (currentMonth.equals(month) && currentYear.equals(year))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		
		for (WebElement dt:dates)
		{
			System.out.println(dt.getText());
			if(dt.getText().equals(date)) {
			dt.click();
			break;
			}
		}
		
		
	}
	

}
