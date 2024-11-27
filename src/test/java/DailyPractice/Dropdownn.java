package DailyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownn {
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement dropdown=d.findElement(By.xpath("//select[@class='form-control']"));
		Select drp= new Select (dropdown);
		drp.selectByValue("australia");
		drp.selectByIndex(3);
		drp.selectByVisibleText("India");
		
		List<WebElement> options=d.findElements(By.xpath("//select[@id='country']/option"));
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
	
	
	}

}
