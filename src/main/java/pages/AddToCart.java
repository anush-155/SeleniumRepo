package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
WebDriver driver;
	
AddToCart(WebDriver driver){
	this.driver = driver;
}
	public void atc() {
		driver.findElement(By.name("add")).clear();
		driver.findElement(By.name("checkout")).click();
	}
	
}
