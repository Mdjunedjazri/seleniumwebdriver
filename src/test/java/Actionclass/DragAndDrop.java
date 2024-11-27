package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
	WebDriver d =new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement box1=d.findElement(By.id("box2"));
	WebElement box2=d.findElement(By.id("box105"));
	WebElement box3=d.findElement(By.id("box1"));
	WebElement box4=d.findElement(By.id("box106"));
	WebElement box5=d.findElement(By.id("box3"));
	WebElement box6=d.findElement(By.id("box107"));
	
	
	Actions ach=new Actions(d);
	ach.dragAndDrop(box1, box2).perform();
	ach.dragAndDrop(box3, box4).perform();
	ach.dragAndDrop(box5, box6).perform();
	
	
	ach.dragAndDrop(box4, box1).perform();
	ach.dragAndDrop(box6, box3).perform();
	ach.dragAndDrop(box1, box5).perform();
	
	

}
}