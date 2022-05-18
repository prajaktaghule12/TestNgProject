package ParameterizationXml;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeCase1 {
	
		WebDriver driver;
		
		@Parameters("browser")
		@Test (priority=1)
		public void crossbrowserTesting(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChormeDriver\\chromedriver_win32_101\\chromedriver.exe");
				driver = new ChromeDriver(); 
				
			}else if (browser.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver(); 
				
			}else {
				System.out.println("Wrong Browser Selected");
			}
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test(priority=2)
		public void VerifyCurrentUrl() {
			
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		}
		
		@Test(priority=3)
		public void VerifyPageTitle() {
			Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		}
		
		@Test(priority=4)
		public void VerifyUsernameField() {
			WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
			Assert.assertTrue(username.isDisplayed());
			username.sendKeys("Paresh");
		}
		
		@Test(priority=5)
		public void VerifyPasswordField() {
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			Assert.assertTrue(password.isDisplayed());
			password.sendKeys("Paresh@1123");
		}
		
		
		@Test(priority=6)
		public void ClickLoginButton() {
			WebElement LoginBtn = driver.findElement(By.xpath("//input[@id='email']"));
			Assert.assertTrue(LoginBtn.isEnabled());
			LoginBtn.click();
		}
		
	}


