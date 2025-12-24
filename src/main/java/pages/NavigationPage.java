package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {
  WebDriver driver;
  public NavigationPage(WebDriver driver){
	  this.driver = driver;
  }
	public void dismissPopup() {
		driver.switchTo().alert().dismiss();
	}
	public void selectProduct() {
		driver.findElement(By.partialLinkText("Axor Apex")).click();
	}

}
