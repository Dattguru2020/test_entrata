package com.qa.PageLayer;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.BasePage.BasePage;
 
public class ProductsTabPage extends BasePage{
	@FindBy(xpath = "//button[@id='rcc-confirm-button']")
	private WebElement accept_cookies;
	@FindBy(xpath = "//div[contains(text(),'Products')]")
	private WebElement products;
	@FindBy(xpath = "//a[@class='fat-nav-links'][contains(text(),'Facility Management')]")
	private WebElement facility_management;
	@FindBy(xpath = "//a[@title='Facilities Management Product Page – Product Banner – Button']")
	private WebElement watchdemo_button;
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement first_name;
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement last_name;
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='Company']")
	private WebElement company_name;
	@FindBy(xpath = "//input[@id='Phone']")
	private WebElement phone_number;
	@FindBy(xpath = "//*[@id=\"Unit_Count__c\"]/option[2]")
	private WebElement unit_count;
	@FindBy(xpath = "//input[@id='Title']")
	private WebElement job_title;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement inner_watchdemo_button;
	Actions act = new Actions(driver);
	public ProductsTabPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyFacilityManagementPageUnderProductsTab() {
		accept_cookies.click();
		act.moveToElement(products).build().perform();
		facility_management.click();
		watchdemo_button.click();
		first_name.sendKeys("Yogesh");
		last_name.sendKeys("Thorat");
		email.sendKeys("reachyogeshthorat@gmail.com");
		company_name.sendKeys("Entrata");
		phone_number.sendKeys("9922443542");
		unit_count.click();
		job_title.sendKeys("SDET");
		inner_watchdemo_button.isDisplayed();
		System.out.println("Verified Facility Management Functionality under Products Tab");
	}
}