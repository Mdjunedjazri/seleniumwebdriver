package FileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFileUpload {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		d.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\juned\\Downloads\\ACCESS MODIFIER.txt");
	}

}
