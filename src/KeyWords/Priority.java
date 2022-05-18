package KeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {
	//@BeforeClass
	//@AfterClass
	//@Test
	@BeforeClass
	public void OpenUrl()
	{
		System.out.println("Url Is Opened");
	}
	@Test (priority=1)
	public void Test1()
	{
		System.out.println("Test1 Successful");
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2 Successful");
	}
	@Test (priority=3)
	public void Test3()
	{
	  System.out.println("Test3 Successful");
	}
	@AfterClass
	public void Logout()
	{
		System.out.println("Logout Successful");
	}
	
	
			
	

}
