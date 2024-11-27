package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.avianca.com/en/");
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@aria-haspopup='true']//span[contains(text(),'Information and help')]")).click();
		//driver.close();
	}

}
