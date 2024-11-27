package DropeDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment {
	//using select class
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement dropdown=d.findElement(By.id("country-list"));
		
		
		//selecting using select class 
		
		Select Dropdown= new Select (dropdown);
		Dropdown.selectByVisibleText("China");
		
		Dropdown.selectByValue("3");
		
		Dropdown.selectByIndex(5);
		Thread.sleep(4000);
	
		List<WebElement>Cdpn=Dropdown.getOptions()	;
		System.out.println(Cdpn.size());
		
		for(WebElement listdp:Cdpn) {
			System.out.println(listdp.getText());
		}
	
		
		
		
	}
	

}
