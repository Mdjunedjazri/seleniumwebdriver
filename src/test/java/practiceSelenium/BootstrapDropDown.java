package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	//	d.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
	
		
		//open dropdown options 
		d.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select all  the options and findout the size 
		
		List <WebElement> options=d.findElements(By.xpath("//ul[contains(@class,'multiselect')]//a//label"));
		System.out.println(options.size());
		
		//print all the options from dropdown
	
		
		for(WebElement op:options) {
			System.out.println(op.getText());
			
		}
		for(WebElement opp:options) {
			opp.click();
		
	}

	}
}
