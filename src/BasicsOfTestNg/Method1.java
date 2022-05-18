package BasicsOfTestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Method1 {
	@BeforeMethod 
	public void login() 
	{
		System.out.println("=======login is suceesfully=========");
		Reporter.log("login succesfull");
	}
	@AfterMethod
	 public void logout() 
	{
		 System.out.println("=======log out is succesfully=========");
		 Reporter.log("log out succesfull");
		 
	 }
	@Test(priority=1)
	public void Homepage() 
	{
		System.out.println("====enter in homepage succefully====");
		Reporter.log("enter in homepage succefull");
	}
	@Test(priority=2)
	public void Profilepage() 
	{
		System.out.println("======profile page succesfully======");
		Reporter.log("profile page succesfull");
	}
	@Test(priority=3)
	public void Notification() 
	{
		System.out.println("==========these is notification=============");
		Reporter.log("these is notification run succesfull");
	}
	
	
	
	
	
	
	
	
	
}


