package TestPack;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PomPack.AboutPage;
import TestPack.BaseClass.BaseClass;
import TestPack.Util.Utility_Class;

public class HomePage_Links extends BaseClass{
	WebDriver driver;
	AboutPage page;
	
	
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = launchChromeDriver();
		driver.get(Utility_Class.getPropertiesData("URL"));
		page = new AboutPage(driver);
		
	}
	@Test
	public void verifyDoctorsPageLink() {
		page.doctorsPage();
		System.out.println("Verify Doctors ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/doctors";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
		
	}
	@Test
	public void verifyConsumerPageLink() {
		page.consumerPage();
		System.out.println("Verify Consumer ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/consumer";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}
	@Test
	public void verifyProviderPageLink() {
		page.providerPage();
		System.out.println("Verify Provider ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/providers";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}

	@Test
	public void verifyBlogsPageLink() {
		page.blogsPage();
		System.out.println("Verify BLOGS ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/blogs";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}
	public void verifyFaqsPageLink() {
		page.faqsPage();
		System.out.println("Verify FAQs ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/faqs";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}
	public void verifyContactUsPageLink() {
		page.contactUsPage();
		System.out.println("Verify contact ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/contact";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}
	public void verifyPrivacyPolicyPageLink() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		page.privacyPolicyPage();
		System.out.println("Verify privacyPolicyPage ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/privacypolicy";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}
	public void verifyTermsConditionPageLink() {
		page.termsConditionPage();
		System.out.println("Verify termsConditionPage ULR");
		String ActURL = driver.getCurrentUrl();
		String ExpURL = "https://www.wondrx.com/termsconditions";
		boolean result = ActURL.equals(ExpURL);
		System.out.println(result);
	}
	
}
