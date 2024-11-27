package TestNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	WebDriver d;
	@BeforeClass 
	void setup() {
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
	}
	
	
	
	@Test (dataProvider="dp")
		void testcase(String Email, String PWD) {
			d.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			d.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys(Email);
			d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PWD);
			d.findElement(By.xpath("//input[@value='Login']")).click();
			
			boolean status=d.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
			if (status==true)
			{
				d.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
				Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		
			
			
	}
		@AfterClass
		void close()
		{
			
			d.close();
		}

		@DataProvider(name="dp")
		Object [][] loginData()
		{
			Object data[][]= { 
					{"mdjunedjazri2011@gmail.com", "Mdjuned@95"},
					{"abc@gmail.com", "test123"},
					{"xyz@gmail.com", "test123"},
					{"123@gmail.com", "test123"},
					{"mdjunedjazri2011@gmail.com", "Mdjuned@95"},
					
			 					};
			return data;
	
			
		}
		
}	
	

