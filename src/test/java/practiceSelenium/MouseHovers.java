package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovers {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions ac=new Actions(driver);
	ac.moveToElement(Desktop).moveToElement(mac).build().perform();
	mac.click();

}
}
