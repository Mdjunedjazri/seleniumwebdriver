package Practice9_12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {
	
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement>elements=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']/div"));
		System.out.println(elements.size());
	
	
		for(int i=0; i<elements.size(); i++) {
			System.out.println(elements.get(i).getText());
			elements.get(i).click();
		
		
		}
	}

}
