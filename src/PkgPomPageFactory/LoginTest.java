package PkgPomPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChormeDriver\\chromedriver_win32_101\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	@Test
	public void LoginPageTest()
	{
	  LoginPage lg=new LoginPage(driver);
	 lg.verifyFacebookLoginPageLogo();
	 lg.verifyFacebookLoginPageTagline();
	 lg.verifyFacebookLoginPageCreatePageLink();
	 lg.verifyFacebookLoginPageForgotPasswordLink();
	 lg.verifyFacebookLoginPageCreatePageLink();
	 lg.verifyFacebookLoginFooterLinksSize();
	 lg.setFacebookLoginPageUsername();
	 lg.setFacebookLoginPagePassword();
	 lg.clickFacebookLoginPageLoginBtn();
	 lg.clickFacebookLoginPageLoginBtn();
	  
	}
	@AfterClass
	public void tearDown()
	{
	 // driver.quit();
	}

}
