package DailyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[] args) {
		
	
	WebDriver d =new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://www.google.com/");
	d.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
	String s="selenium tutorial";
	List<WebElement> options=d.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	options.size();
	
	for (int i=0; i<=options.size(); i++)
	{
		System.out.println(options.get(i).getText());
		if (options.get(i).getText().equals(s))
		{
			options.get(i).click();
			break;
		}
	}
	

	
	/*
	for (WebElement option:options)
	{
		System.out.println(option.getText());
		
	
	}
	*/

	
}
}