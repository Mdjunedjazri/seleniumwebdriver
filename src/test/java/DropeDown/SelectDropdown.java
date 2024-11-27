package DropeDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement Dropdown=d.findElement(By.xpath("//select[@id='country']"));
		Select dropdown=new Select(Dropdown);
		
		//select the option from the dropedown
		
		//select by visible text 
		dropdown.selectByVisibleText("Germany");
		
		// select by value 
		Thread.sleep(3000);
		dropdown.selectByValue("japan");
		
		//select by index
		Thread.sleep(3000);
		dropdown.selectByIndex(8);
		
		//capture the options from the dropedown
		
		List<WebElement>options=dropdown.getOptions();
		System.out.println(options.size());
		
		/*for (int i=0; i<options.size(); i++) {
		
		System.out.println(options.get(i).getText());
		}
	*/
		for(WebElement op:options) {
			System.out.println(op.getText());
			
		}
	}

}
