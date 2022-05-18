package KeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {

	@BeforeClass
	public void LaunchedBrowser()
	{
		System.out.println("Browser Is Launched");
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Browser is Closed");
	}
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login Is Successful");
	}
	@AfterMethod
	public void logout()
	{
	 System.out.println("LogOut Is Successful");	
	}
	@Test (priority=2,invocationCount=5)
	public void HomePageTest()
	{
		System.out.println("Home Page Is Tested");
	}
	@Test (priority=1)
	public void ProfilePageTest()
	{
		System.out.println("Profile Page Is Tested");
	}
	
	
	
}
