package BasicsOfTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotaion2 {

	
	public void openDB()
	{
		System.out.println("Database Is Open");
		
	}
	
	public void CloseDB()
	{
		System.out.println("Database Is Closed");
	}
	@Test
	public void m4()
	{
		System.out.println("This Is m4 Method");
	}
	@Test
	public void m5()
	{
		System.out.println("This Is m5 Method");
	}
	@Test
	public void m6()
	{
		System.out.println("This Is m6 Method");
	}
	

}
