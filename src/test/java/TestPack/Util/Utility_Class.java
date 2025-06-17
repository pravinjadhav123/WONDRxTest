package TestPack.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utility_Class {
	static WebDriver driver;
	
	public static String getPropertiesData(String key) throws IOException {
		FileInputStream fs = new FileInputStream("application.properties"); 
		Properties prop = new Properties();
		prop.load(fs);
		
		String keyValue = prop.getProperty("URL");
		System.out.println(keyValue);
		
		return keyValue;	
		
		
	}
		
		public static void verifyUrl(WebDriver driver, String expectedurl) {		
			String actualurl = driver.getCurrentUrl();
			Assert.assertEquals(actualurl, expectedurl);
			System.out.println("First Assertion Verified");
	}
		public static void ScreeshotTake() {
			Date d = new Date();
			SimpleDateFormat set = new SimpleDateFormat("(dd-MM-yyy)_(HH-mm-ss)");
			String date = set.format(d);
			File sourece1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\User\\eclipse-workspace\\SauceDemo"+date+".jpg");
			
		}
		public static void applyWait() {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			
		}
		public static void popupHandle() {
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
		}
		
		
}
	


