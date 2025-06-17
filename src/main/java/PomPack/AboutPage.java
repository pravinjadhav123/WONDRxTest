package PomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	@FindBy(xpath = "//a[contains(text(),'Doctors')]")
	private WebElement doctors ;
	
	@FindBy(xpath = "//a[contains(text(),'Consumers')]")
	private WebElement consumer;
	
	@FindBy(xpath = "//a[contains(text(),'Providers')]")
	private WebElement provider;
	
	@FindBy(xpath = "//a[contains(text(),'Blogs')]")
	private WebElement blogs;
	
	@FindBy(xpath = "//a[contains(text(),'FAQs')]")
	private WebElement faqs;
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement contactUs;	
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicy;	
	
	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	private WebElement termsCondition;
	
	
	
	public AboutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void doctorsPage() {
		doctors.click();
	}
	public void consumerPage() {
		consumer.click();
	}
	public void providerPage() {
		provider.click();
	}
	public void blogsPage() {
		blogs.click();
	}
	public void faqsPage() {
		faqs.click();
	}
    public void contactUsPage() {
	contactUs.click();
    }    
    public void privacyPolicyPage() {
    	privacyPolicy.click();
    }
    public void termsConditionPage() {
    	termsCondition.click();
    }
    
	

}
