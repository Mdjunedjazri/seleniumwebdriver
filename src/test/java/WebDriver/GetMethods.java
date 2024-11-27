package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d =new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource());
		String WID=d.getWindowHandle();
		System.out.println(WID);
		Thread.sleep(4000);
		d.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> WIDS=d.getWindowHandles();
		System.out.println(WIDS);
		
		d.close();
	
}
	
}
