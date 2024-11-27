package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class iFrameEx1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		
		//frame 1
		d.get("https://ui.vision/demo/webtest/frames/");
		WebElement Frame1=d.findElement(By.xpath("//frame[@src='frame_1.html']"));
		d.switchTo().frame(Frame1);
		d.findElement(By.name("mytext1")).sendKeys("Mohammed");
		
		d.switchTo().defaultContent();  /// switch back to the main frame 
		
		
		//Frame 2 
		
		WebElement Frame2=d.findElement(By.xpath("//frame[@src='frame_2.html']"));
		d.switchTo().frame(Frame2);
		d.findElement(By.name("mytext2")).sendKeys("Juned");
		d.switchTo().defaultContent();d.switchTo().defaultContent();  /// switch back to the main frame 
		
		
		//Frame 3
		
		WebElement Frame3=d.findElement(By.xpath("//frame[@src='frame_3.html']"));
		d.switchTo().frame(Frame3);
		d.findElement(By.name("mytext3")).sendKeys("Jazri");
		
		
		// inner frame part of Frame 3
		d.switchTo().frame(0); //switching to frame using index
		d.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		
		
		//using javaScript Executer
		WebElement Rbutton=d.findElement(By.xpath("//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor jc = (JavascriptExecutor)d;
		Thread.sleep(2000);
		jc.executeScript("arguments[0].click();", Rbutton);
		
		
		
		
	}

}
