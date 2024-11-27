package SelfAutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.id("name")).sendKeys("Mohammed");
		d.findElement(By.cssSelector("[placeholder='Enter EMail']")).sendKeys("a@a.com");
	}

}
