package ParameterizationXml;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTestCase {

	//private static final TimeUnit Timeunits = null;
	WebDriver driver;
	//chrome browser->hitUrl->varify facebookurl
	//Ttile Of The Facebook Page
	//Username Field
    //PasswardField
	//Login Button
	@Parameters("browser")
	@Test(priority=1)
	public void crossBrowserTesting (String browser)
	{
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChormeDriver\\chromedriver_win32_101\\chromedriver.exe");
	       driver=new ChromeDriver();
	  
	  }else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\FireFoxDriver\\geckodriver.exe");
	      driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.out.println("Wrong Browser Is Selected");
	  }
	 // driver.manage().deleteAllCookies();
	  driver.get("www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
		
	}
	@Test(priority=2)
	public void verifyCurrentUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
	    //Reporter.log("verifyCurrentUrl",true);
	}
	@Test
	public void verifyPageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		//Reporter.log("verifyPageTitle",true);
	}
	@Test
	public void verifyUserNameField()
	{
		//input[@name="email"]
	WebElement UserName = driver.findElement(By.xpath("//input[@name=\"email\"]"));
	Assert.assertTrue(UserName.isDisplayed());
	Assert.assertTrue(UserName.isEnabled());
	UserName.sendKeys("Prajakta");
	//Reporter.log("verifyUserNameField",true);
	}
	
	
	}


