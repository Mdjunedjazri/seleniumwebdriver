package AutoSuggestedDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement>elm=d.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(elm.size());
		Thread.sleep(4000);
		for (int i=0; i<elm.size(); i++) {
			System.out.println(elm.get(i).getText());
			Thread.sleep(4000);
			if (elm.get(i).getText().equals("selenium")) {
				elm.get(i).click();
				break;
			}
		}
	}

}
