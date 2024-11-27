package SelfAutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx3 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver d = new ChromeDriver();
	d.get("https://bctprodapps.bahwancybertek.com/OA_HTML/RF.jsp?function_id=28716&resp_id=-1&resp_appl_id=-1&security_group_id=0&lang_code=US&params=KQ0ueFd3h5ncJDQ0.532EQ&oas=nVrIFaDl7hpe42ArV1jCLQ..");
	d.manage().window().maximize();
	d.findElement(By.xpath("//input[@id='unamebean']")).sendKeys("114543");
	d.findElement(By.xpath("//input[@id='pwdbean']")).sendKeys("Mdjuned@95");
	Thread.sleep(3000);
	d.findElement(By.id("SubmitButton")).click();
	d.findElement(By.xpath("//div[text()='Regularization']")).click();
	d.findElement(By.xpath("//div[text()='Attendance Details']")).click();

	Thread.sleep(3000);
	d.close();
	
	}
	
	

}
