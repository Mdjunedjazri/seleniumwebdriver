package practiceSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandell {
	public static void main(String[] args) {
		 WebDriver d =new ChromeDriver();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 d.manage().window().maximize();
		 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 d.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	//	 String Wid=d.getWindowHandle();
		// System.out.println(Wid);d.quit();
		Set<String> WID=d.getWindowHandles();
		for(String WOID:WID)
		{
			String titile=d.switchTo().window(WOID).getTitle();
			System.out.println(WOID);
			System.out.println(titile);
			
		}
		 
		d.quit();
	}

}
