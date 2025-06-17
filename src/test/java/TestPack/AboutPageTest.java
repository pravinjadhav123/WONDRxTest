package TestPack;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import TestPack.BaseClass.BaseClass;
import TestPack.Util.Utility_Class;

public class AboutPageTest extends BaseClass {

	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = launchChromeDriver();
		driver.get(Utility_Class.getPropertiesData("URL"));
	}
	@Test
	public void verifyTitle() {
		String actualtitle = driver.getTitle();
		String expectedtitle = "WONDRx | Smart Rx Kit that digitizes your Rx in No Time!";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Second Assertion Verified" + expectedtitle);
	}
	
	
	@AfterMethod
	public void closwBrowser() throws InterruptedException {
		driver.close();
	}
	

}
