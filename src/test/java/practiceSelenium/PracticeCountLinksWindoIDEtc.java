package practiceSelenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCountLinksWindoIDEtc {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello");
		List<WebElement> links=d.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		d.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		List<WebElement>numlinks=d.findElements(By.xpath(" //div[@id='Wikipedia1_wikipedia-search-results']//a"));
		System.out.println(numlinks.size());
		
		
		for (WebElement link:numlinks)
		{
			System.out.println(link.getText());
             link.click();
		}
		
		Set<String> WID=d.getWindowHandles();
		for(String WOID:WID)
		{
			String titile=d.switchTo().window(WOID).getTitle();
			System.out.println(WOID);
			System.out.println(titile);
			
		d.close();
			
		
		}
		
		d.quit();
	
		
	

	
	}
}

