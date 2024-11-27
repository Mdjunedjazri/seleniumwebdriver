package WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationn {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().window().maximize();
		d.navigate().to("https://demowebshop.tricentis.com/");
	
		d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.navigate().back();
		System.out.println(d.getCurrentUrl());
		d.navigate().forward();
		System.out.println(d.getCurrentUrl());
		d.navigate().refresh();
		//d.close();
	}

}
