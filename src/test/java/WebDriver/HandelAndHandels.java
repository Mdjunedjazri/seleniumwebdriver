package WebDriver;


import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAndHandels {
	public static void main(String[] args) {
		
	WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> WindoID=d.getWindowHandles();
		for (String WindID:WindoID) {
			String title=d.switchTo().window(WindID).getTitle();
			System.out.println(title);
			if (title.equals("Human Resources Management Software | OrangeHRM")) {
				System.out.println(d.getCurrentUrl());  
		
		
		
		}
		
			}
		
	}
}



