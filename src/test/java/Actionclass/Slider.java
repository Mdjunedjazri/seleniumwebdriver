package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		
		//min Stider
		WebElement minSlider=d.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("Defoult Slider Position"+minSlider.getLocation());
		Actions ach=new Actions(d);
		ach.dragAndDropBy(minSlider, 100, 289).perform();
		System.out.println("Slider Position After action"+minSlider.getLocation());
		 
		Thread.sleep(3000);
		//max Slider
		WebElement maxSlider=d.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		System.out.println("Defoult Position"+maxSlider.getLocation());
		ach.dragAndDropBy(maxSlider, -100, 289).perform();
		System.out.println("Slider Position After action"+maxSlider.getLocation());
		
	}

}
