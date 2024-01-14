package com.qa.PageLayer;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
 
import com.qa.BasePage.BasePage;
public class HomePage extends BasePage{
	@FindBy(xpath = "//a[@class='button-default solid-dark-button'][normalize-space()='Watch Demo']")
	private WebElement watchdemo;
	@FindBy(xpath = "//a[@class='button-default outline-dark-button']")
	private WebElement signin;
	@FindBy(xpath = "//button[@id='rcc-confirm-button']")
	private WebElement accept_cookies;
	@FindBy(xpath = "//div[contains(text(),'Products')]")
	private WebElement products;
	@FindBy(xpath = "//div[@class='main-nav-link'][contains(text(),'Solutions')]")
	private WebElement solutions;
	@FindBy(xpath = "//div[@class='header-nav-item']/following-sibling::div/a")
	private WebElement resources;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyHomePage() {
		accept_cookies.click();
		watchdemo.isEnabled();
		signin.isEnabled();
		products.isEnabled();
		solutions.isEnabled();
		resources.isEnabled();
		System.out.println("Verifed Home Page");
	}
}