package SelfAutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.get("https://demo.opencart.com/");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//input[@name='search']")).sendKeys("Tab");
		d.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("camera");
		Thread.sleep(2000);
		d.close();
	}

}
