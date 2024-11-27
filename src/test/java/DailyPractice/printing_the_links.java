package DailyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; vt6
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printing_the_links {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//for(WebElement link:links) {
		 //System.out.println( link.);
		//}

}
}
