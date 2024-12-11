package WebDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAndHandels2 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		d.findElement(By.id("name")).sendKeys("Mohammed Juned Jazri");
		d.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("java");
		d.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement> links=d.findElements(By.tagName("a"));
		int linkCount=links.size();
		System.out.println("Total number of Linksare:"+linkCount);
		
		for(int i=0; i<linkCount; i++) {
			d.findElements(By.tagName("a")).get(i).click();
			
		Set<String> links1=d.getWindowHandles();
		for(String AllLinks:links1)
		{
			
		}
		System.out.println(links1);  
	}
	}
}

