package JavaScripExicutorPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendKeys {
public static void main(String[] args) {
	WebDriver d =new ChromeDriver();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.manage().window().maximize();
    d.get("https://testautomationpractice.blogspot.com/");
    WebElement nameTB=d.findElement(By.xpath("//input[@placeholder='Enter Name']"));
    
    JavascriptExecutor js =(JavascriptExecutor)d;
    js.executeScript("arguments[0].setAttribute('value', 'juned')",nameTB);
    
    
   WebElement redioBtn=d.findElement(By.xpath("//input[@value='male']"));
   js.executeScript("arguments[0].click()", redioBtn);
	
}
}
