package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://text-compare.com/");
	driver.findElement(By.id("inputText1")).sendKeys("hello");
	
	Actions as=new Actions(driver);
	as.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	as.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	as.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	as.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	
}		

}
