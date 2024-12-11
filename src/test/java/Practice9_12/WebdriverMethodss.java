package Practice9_12;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodss {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		
		//printing URL
		System.out.println(driver.getCurrentUrl());
		
		// get title
		System.out.println(driver.getTitle());
		
		//getting window ID
		System.out.println(driver.getWindowHandle());
		
		
		
		//to get page source
		System.out.println(driver.getPageSource());
		
	
		
		
		
		
	}

}
