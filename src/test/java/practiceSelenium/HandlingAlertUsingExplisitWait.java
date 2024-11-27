package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertUsingExplisitWait {
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(d,Duration.ofSeconds(10));
	d.get("https://the-internet.herokuapp.com/javascript_alerts");
	d.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert mylert=mywait.until(ExpectedConditions.alertIsPresent());
	System.out.println(mylert.getText());
	mylert.accept();
		
	}
	
	//for authenticated popup 
	/*
	
	EX URL:https://the-internet.herokuapp.com/basic_auth
	here we pass userName and Pass along with the URL (Also called as URL injection)
	http://username:password@the-internet.herokuapp.com/basic_auth
	 * 
	 */

}
