package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class paralleTesting {
	
	WebDriver d;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup (String br) throws InterruptedException
	{   
		
		switch(br.toLowerCase()) {
		case "chrome":d=new ChromeDriver();break;
		case "edge":d=new EdgeDriver();break;
		case "firefox":d=new FirefoxDriver();break;
		default:System.out.println("invalid Browser");return;
		}
		
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testlogo()
	{
		boolean logo=d.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
		
		
	}

	
	@Test(priority=2)
	void testUrl() {
		Assert.assertEquals(d.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=3)
	void pageTile()
	{
		Assert.assertEquals(d.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	
	void closeBrowser()
	{
		d.quit();
	}
}
