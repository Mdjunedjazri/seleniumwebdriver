package FileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFileUpload {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		String s="C:\\\\Users\\\\juned\\\\Downloads\\\\ACCESS MODIFIER.txt";
		String s1="C:\\\\Users\\\\juned\\\\Downloads\\\\STRING 1.txt";
		d.findElement(By.xpath("//input[@type='file']")).sendKeys(s +"\n" +s1);
		
		
	}

}
