package com.qa.BasePage;
 
import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.PageLayer.HomePage;
import com.qa.PageLayer.SignInPage;
import com.qa.PageLayer.WatchDemoPage;
import com.qa.PageLayer.ProductsTabPage;
 
public class BasePage {
 
	public static WebDriver driver;
	public static HomePage hm;
	public static WatchDemoPage wd;
	public static SignInPage si;
	public static ProductsTabPage prod;
 
	@Before
	public void launchBrowser() {
		driver = new ChromeDriver();
		hm = new HomePage();
		wd = new WatchDemoPage();
		si = new SignInPage();
		prod = new ProductsTabPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.entrata.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@After
	public void closeBrowser() {
		driver.quit();
	}
}