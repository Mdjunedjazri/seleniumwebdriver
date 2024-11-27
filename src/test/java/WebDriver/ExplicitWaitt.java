package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		WebDriverWait Mywait=new WebDriverWait(d,Duration.ofSeconds(10));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		WebElement e =Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		e.sendKeys("Admin");
		WebElement e1 =Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		e1.sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		d.close();
		
	}

}
