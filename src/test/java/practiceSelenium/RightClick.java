package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		Actions as=new Actions(driver);
		as.contextClick(button).perform();
		
	}

}
