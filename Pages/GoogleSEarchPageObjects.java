package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSEarchPageObjects {
	WebDriver driver=null;
	By textbox = By.xpath("//input[contains(@name,'q')]");
//	By searchbtn=By.xpath("//input[contains(@name,'btnK')]");
	
	public GoogleSEarchPageObjects(WebDriver driver){
		this.driver=driver;
	}
	
	public void setTextInSearchBox(String data) {
		driver.findElement(textbox).sendKeys(data);
		
	}
   public void clickSearchbtn() {
	   driver.findElement(textbox).sendKeys(Keys.RETURN);
		 
   }
}
