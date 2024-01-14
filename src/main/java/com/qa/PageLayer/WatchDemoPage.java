package com.qa.PageLayer;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.BasePage.BasePage;
 
public class WatchDemoPage extends BasePage {
	@FindBy(xpath = "//a[@class='button-default solid-dark-button'][normalize-space()='Watch Demo']")
	private WebElement watchdemo;
	@FindBy(xpath = "//button[@id='rcc-confirm-button']")
	private WebElement accept_cookies;
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
	private WebElement watchdemo_button;
	public WatchDemoPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyWatchDemoPage() {
		accept_cookies.click();
		watchdemo.click();
		first_name.sendKeys("Yogesh");
		last_name.sendKeys("Thorat");
		email.sendKeys("reachyogeshthorat@gmail.com");
		company_name.sendKeys("Entrata");
		phone_number.sendKeys("9922443542");
		unit_count.click();
		job_title.sendKeys("SDET");
		watchdemo_button.isDisplayed();
		System.out.println("Verified WatchDemo Functionality");
	}
}