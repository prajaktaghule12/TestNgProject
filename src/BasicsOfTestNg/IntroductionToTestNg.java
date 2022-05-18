package BasicsOfTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IntroductionToTestNg {
	//open url->Login->LogOut
	//For Every Action->Seperate Method->Method Name Should Be relevant to your action
	
	@Test (priority=1)
	public void Openurl()
	{
		System.out.println("Url Is Open");
		Reporter.log("****Url******");
	}
	@Test (priority=2)
	public void Login()
	{
		System.out.println("Login Is Successful");
		Reporter.log("*****Login*******");
	}
	@Test (priority=3)
	public void Logout()
	{
		System.out.println("Logout Is Successful");
		Reporter.log("*****LogOut******");
	}

}
