package HeadLessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToRemoveAutomatedMessage {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwiteches", new String[] {"enable-automation"});
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://demowebshop.tricentis.com/");
	}

}
