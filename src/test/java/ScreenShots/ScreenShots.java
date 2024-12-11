package ScreenShots;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		// 1 d.get("https://testautomationpractice.blogspot.com/");
		
		d.get("https://demowebshop.tricentis.com/");
		//Explicit wait
		//WebDriverWait myWait=new WebDriverWait(d,Duration.ofSeconds(10));
		//myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Upload Files']")));
		
		
	
		//1 taking full screenshot
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"/screenshots/fullpage1.png");
		sourcefile.renameTo(targetfile);
		
		
		
		//2 taking screenshot of specific section 
		
	/*	WebElement FeatureSS=d.findElement(By.xpath("//body/div/div[2]/div[1]"));
		File sourcefile=FeatureSS.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"/screenshots/feature.png");
		sourcefile.renameTo(targetfile);
		*/
		
		/*
		WebElement logo=d.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"/screenshots/logo.png");
		sourcefile.renameTo(targetfile);
		*/
				
				
	}

}
