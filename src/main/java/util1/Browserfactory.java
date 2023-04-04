package util1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserfactory {
	static WebDriver driver;
	public static WebDriver init() {
		System.setProperty("webdriver.edge.driver","/Users/khushbuchaudhary/Downloads/edgedriver_mac64/msedgedriver")
		;
	 driver= new EdgeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/106/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
public static void teardown() {
	driver.close();
}

}
