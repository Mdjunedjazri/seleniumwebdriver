package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		
		//Select Specific check box
		
		d.findElement(By.xpath("//input[@value='sunday']")).click();
		d.findElement(By.xpath("//input[@value='monday']")).click();
		
		// select all check box
		
		List<WebElement>checkbox=d.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));
		for (int i=4; i<=checkbox.size(); i++)
		{
			checkbox.get(i).click();
		}
		
		Thread.sleep(3000);
		/*
		 * for (WebElement check:checkbox)
		 
		{
			check.click();
		}
	*/	
	}

}
