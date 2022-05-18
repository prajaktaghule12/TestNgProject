package BasicsOfTestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MethodAnnotationExample {
	//login--Homepage--logout
	//login--Profile--Logout
	//Login--Notification--Logput
	//solution--Login--Homepage--Profile--Notification--LogOut
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login Is Successful");
		Reporter.log("*******Login Successful******");
	}
	@AfterMethod
	public void LogOut()
	{
		System.out.println("LogOut Is Successful");
		Reporter.log("*********LogOut Successful*******");
	}
	@Test(priority=1)
	public void Homepage()
	{
		System.out.println("Enter In HomePage");
		Reporter.log("*********Enter In HomePage***********");
	}
	@Test(priority=2)
	public void Profile()
	{
		System.out.println("Enter In ProfilePage");
		Reporter.log("***********Enter In ProfilePage*********");
	}
	@Test(priority=3)
	public void Notification()
	{
		System.out.println("Enter In Notification");
		Reporter.log("********Enter In Notification********");
		
	}
	
	

}

