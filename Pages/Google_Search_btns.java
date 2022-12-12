package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Search_btns {
    
	public static WebElement getSearchinputBox(WebDriver driver) {
	WebElement e=driver.findElement(By.xpath("//input[contains(@name,'q')]"));
	return e;
	}
	
	public static WebElement getSearchtBoxbtn(WebDriver driver) {
		WebElement e=driver.findElement(By.xpath("//input[contains(@name,'btnK')]"));
		return e;
		}
	
}
