package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver d =new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	d.get("https://testautomationpractice.blogspot.com/");
	WebElement dropdown=d.findElement(By.xpath("//select[@id='country']"));
	Select sc=new Select(dropdown);
	
	Thread.sleep(3000);
	//select by visible text 
	
	sc.selectByIndex(3);
	
	//select by visible text
	
	sc.selectByVisibleText("France");
	
	
	// select by value
	
	sc.selectByValue("china");
	
	// to print all the drop down values 
	List<WebElement> options=sc.getOptions();
	System.out.println(options.size());
	
	for(WebElement op:options)
	{
		System.out.println(op.getText());
	}
	
}
}
