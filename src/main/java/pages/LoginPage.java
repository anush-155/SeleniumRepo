package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void login() {
		driver.findElement(By.id("password")).sendKeys("1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
