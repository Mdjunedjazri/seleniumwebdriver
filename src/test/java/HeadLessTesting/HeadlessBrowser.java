package HeadLessTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	public static void main(String[] args) {
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--headless=new");
		WebDriver d=new ChromeDriver(op);
		d.get("https://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		WebElement logo=d.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		System.out.println(logo.isEnabled());
	}

}
