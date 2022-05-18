package BasicsOfTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation1 {

	@BeforeTest
	public void openDB()
	{
		System.out.println("Database Is Open");
		
	}
	@AfterTest
	public void CloseDB()
	{
		System.out.println("Database Is Closed");
	}
	@Test
	public void m1()
	{
		System.out.println("This Is m1 Method");
	}
	@Test
	public void m2()
	{
		System.out.println("This Is m2 Method");
	}
	@Test
	public void m3()
	{
		System.out.println("This Is m3 Method");
	}
	

	
}
