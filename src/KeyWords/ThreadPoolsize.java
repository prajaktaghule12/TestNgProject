package KeyWords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolsize {
	@Test(invocationCount=3,threadPoolSize=5)
	public void LaunchBrowser()
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChormeDriver\\chromedriver_win32_101\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	}

}
