package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser()
	{
		System.out.println("Browser Is Launched");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser()
	{
		System.out.println("Browser Is Closed");
	}
	@Test(groups="Smoke")
	public void Test4()
	{
		System.out.println("Test4");
	}
	@Test(groups="Functional")
	public void Test5()
	{
		System.out.println("Test5");
	}
	@Test(groups= {"Functional","Regression"})
	public void Test6()
	{
		System.out.println("Test6");
	}
	

}
