package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		//WebElement Logo=d.findElement(By.xpath("img[alt='nopCommerce demo store']"));
		//System.out.println(Logo.isDisplayed());
		
		boolean a=d.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println(a);
		WebElement Male_RB=d.findElement(By.xpath("//input[@id='male']"));
		System.out.println("Male Button Status is "+Male_RB.isSelected());
		Male_RB.click();
		System.out.println("Male Button Status is "+Male_RB.isSelected());
		Thread.sleep(3000);
		
		boolean Droupdown=d.findElement(By.xpath("//select[@id='country']")).isDisplayed();
		System.out.println(Droupdown);
		d.findElement(By.xpath("//input[@id='sunday']")).click();
		d.findElement(By.xpath("//input[@id='monday']")).click();
		d.findElement(By.xpath("//input[@id='tuesday']")).click();
		d.findElement(By.xpath("//input[@id='wednesday']")).click();
		d.findElement(By.xpath("//input[@id='thursday']")).click();
		d.findElement(By.xpath("//input[@id='friday']")).click();
		d.findElement(By.xpath("//input[@id='saturday']")).click();
		WebElement day=d.findElement(By.xpath("//input[@id='sunday']"));
		System.out.println("day is "+day.isEnabled());
		d.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(3000);
		d.close();
		Thread.sleep(3000);
	d.quit();
		
	}

}
