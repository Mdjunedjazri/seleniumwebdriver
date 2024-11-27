package HandlingTheTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagination {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		int page_size=d.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		System.out.println(page_size);
		
		for (int p=1; p<=page_size; p++) {
			 WebElement pages=d.findElement(By.xpath("//ul[@id='pagination']//li["+p+"]"));
			 Thread.sleep(3000);
			 pages.click();
			 
			
		}
	}

}
