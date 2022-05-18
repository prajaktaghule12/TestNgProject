package BasicsOfTestNg;

import org.testng.Reporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassAnnotations {
	//Login And LogOut Perform Only Once And Check All Functionality
	//Login--HomePage--Profile--Notification--LogOut
	@BeforeClass
	public void login()
	{
	System.out.println("Login Is Successful");
	Reporter.log("****Login Successful");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("LogOut Successful");
		Reporter.log("LogOut Successful");
	}
	@Test (priority=1)
	public void HomePage()
	{
		System.out.println("Entered In ProfilePage");
		Reporter.log("***HomePage Successful");
	}
	@Test(priority=2)
	public void ProfilePage()
	{
		System.out.println("Enter In Notification");
		Reporter.log("******ProfilePage Successful*****");
		
	}
	@Test(priority=3)
	public void Notification()
	{
		System.out.println("Enter In Notification");
		Reporter.log("*****Notification Successfull*****");
	}

}
