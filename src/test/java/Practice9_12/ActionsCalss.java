package Practice9_12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCalss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//WebElement pointMe=driver.findElement(By.xpath("//div[@role='main']//p//span"));
		//WebElement edit=driver.findElement(By.xpath("(//span[normalize-space()='Edit'])[1]"));
		WebElement doubleclick=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions as =new Actions(driver);
		//as.moveToElement(pointMe).moveToElement(edit).click().build().perform();
		as.doubleClick(doubleclick).perform();
		
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		as.dragAndDrop(source, destination).perform();
		
		/*
		
		//slider
		WebElement minslider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		WebElement maxslider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println("min"+minslider.getLocation());
		System.out.println("max"+maxslider.getLocation());
		as.dragAndDropBy(maxslider, 1035, 1968).build().perform();
		*/
		//keyboard actions

		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Hello");
		as.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		as.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		as.keyDown(Keys.TAB).keyUp(Keys.UP).perform();
		as.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
	}

	

}
