package com.qa.PageLayer;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.BasePage.BasePage;
 
public class SignInPage extends BasePage{
	@FindBy(xpath = "//button[@id='rcc-confirm-button']")
	private WebElement accept_cookies;
	@FindBy(xpath = "//a[@class='button-default outline-dark-button']")
	private WebElement signin;
	@FindBy(xpath = "//a[@title='Client Login Button']")
	private WebElement pm_login_button;
	@FindBy(xpath = "//input[@name='company_user[username]']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='company_user[password]']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement inner_signin_button;
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifySignInPage() {
		accept_cookies.click();
		signin.click();
		pm_login_button.click();
		username.sendKeys("ythorat");
		password.sendKeys("ythorat");
		inner_signin_button.isDisplayed();		
		System.out.println("Verified Sign In Functionality");
	}
}