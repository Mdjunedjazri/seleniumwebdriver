package SelfAutomationLearning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class LounchingBrowser {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver d=new EdgeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		String Title=driver.getTitle();
		//String Title1=d.getTitle();
		if(Title.equals("Your Store")) 
		{
			System.out.println("TestCase Pass");
		}else 
		{
			System.out.println("TestCase Fail");
		}
		driver.close();
	
	}
	

}
