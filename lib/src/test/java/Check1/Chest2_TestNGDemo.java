package Check1;
import Pages.Google_Search_btns;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.annotations.Test; 

public class Chest2_TestNGDemo {
	static WebDriver driver = null;
	@BeforeTest
	public static void setUP() {
		String ProjectPath=System.getProperty("üser.dir");
		//System.setProperty("WebDriver.IE.driver", ProjectPath+"ÏEdriver.server.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com//");
	}
	
	@Test
	public static void verify() {
		
		GoogleSEarchPageObjects obj=new GoogleSEarchPageObjects(driver);
		obj.setTextInSearchBox("selenium");
		obj.clickSearchbtn();
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
