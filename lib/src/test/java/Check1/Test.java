package Check1;
import Pages.GoogleSEarchPageObjects;
import Pages.Google_Search_btns;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	static WebDriver driver = null;
	
	public static void main(String args[]) {
		test1();
	}
	public static void test1() {
		String ProjectPath=System.getProperty("üser.dir");
		//System.setProperty("WebDriver.IE.driver", ProjectPath+"ÏEdriver.server.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com//");
		GoogleSEarchPageObjects obj=new GoogleSEarchPageObjects(driver);
		obj.setTextInSearchBox("selenium");
		obj.clickSearchbtn();
		
		driver.close();
	
	}

}
