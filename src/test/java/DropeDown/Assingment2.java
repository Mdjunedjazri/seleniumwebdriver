package DropeDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2 {
	
	
	//for hinden dropdown 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[normalize-space()='PIM']")).click();
		d.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		//d.findElement(By.xpath("//span[normalize-space()='Full-Time Contract']")).click();
		List<WebElement>options=d.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(options.size());
		Thread.sleep(4000);
		for (WebElement op:options) {
			System.out.println(op.getText());
		}
		
}
}
