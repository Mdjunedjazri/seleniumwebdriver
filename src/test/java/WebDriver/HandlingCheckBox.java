package WebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		
		//1 methods to click check box
				d.findElement(By.id("sunday")).click();
				d.findElement(By.id("monday")).click();
				
				//2 using for loop
				List<WebElement> checkboxes=d.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));	
				
				for(int i=0; i<checkboxes.size(); i++) {
					checkboxes.get(i).click();
				}
				
				//3 selecting only last 3 check boxes 
				//to find starting index subtract with the number of check boxes to be selected example 7-3=4
				
				
				for(int i=4; i<checkboxes.size(); i++) {
					checkboxes.get(i).click();
				}
				
				
				//4 to uncheck the box if it is selected 
		
		
		
		for(int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		
			
			
		}
		Thread.sleep(4000);
			
		for (int i=0; i<checkboxes.size();i++) {
			if (checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
				}
				
			d.close();	
			}
		}
		
	
		
	}


