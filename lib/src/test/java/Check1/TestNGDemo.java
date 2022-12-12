package Check1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import Demo.Log4jDemo;
import Pages.GoogleSEarchPageObjects;


public class TestNGDemo {

	WebDriver driver=null;
	public static String browserName = null;
    public static Logger logger	= LogManager.getLogger(Log4jDemo.class);
    
    
    @BeforeTest
    public void setupTest() {
    	String projectpath = System.getProperty("user.dir");
    	PropertiesFile.getProperties();
    	System.out.println(browserName);
    	if(browserName.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/Chrome/chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	else
    		if(browserName.equalsIgnoreCase("Firefox")) {
        		System.setProperty("webdriver.gecko.driver", projectpath+"/drivers/Firefox/firefoxdriver.exe");
        		driver=new FirefoxDriver();
        	}
    	logger.info("Browser started");
    		
    }
    @Test
    public void googleSearch() {
    	driver.get("https://google.com");
    	logger.info("Navigated to google chrome");
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
