package Practice9_12;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDom {
	public static void main(String[] args) {
		
	
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
	
	driver.switchTo().frame("pact1");
	JavascriptExecutor js =(JavascriptExecutor)driver;
	WebElement jse=(WebElement)js.executeScript("document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")" );
	
	String s="argument[0].setAttributevalue('value', 'Masala Teae')";
	js.executeAsyncScript(s, jse);
}
}
