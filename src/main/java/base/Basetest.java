package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Basetest {
 protected WebDriver driver;

	
@BeforeSuite
public void openUrl() {
	driver = new ChromeDriver();
	driver.get("https://spicegems-064.myshopify.com/");
	driver.manage().window().maximize();
	
}

@AfterSuite
public void tearDown() {
	// driver.quit();
}

}
