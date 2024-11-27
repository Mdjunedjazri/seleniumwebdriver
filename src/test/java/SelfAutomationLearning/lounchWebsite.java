package SelfAutomationLearning;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class lounchWebsite {
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String s=d.getTitle();
		System.out.println(s);
		if(s.equals("OrangeHRM1")) {
			System.out.println("TestCase is Passed");
		}else {
			System.out.println("TestCase is Failed");
		}
	d.close();
	}
	
	

}
