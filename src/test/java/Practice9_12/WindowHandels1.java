package Practice9_12;

import java.time.Duration;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String>WindoID=driver.getWindowHandles();
		for (String windID:WindoID)
		{
			String title=driver.switchTo().window(windID).getTitle();
			System.out.println(title);
			
			if (title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.close();
			}
		}
		
		
	}

}
