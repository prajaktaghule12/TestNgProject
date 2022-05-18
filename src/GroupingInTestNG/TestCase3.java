package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	@BeforeClass(alwaysRun=true)
	public void LaunchedBrowser()
	{
		System.out.println("Browser Launched");
	}
	@AfterClass(alwaysRun=true)
	public void ClosedBrowser()
	{
		System.out.println("Browser Closed");
	}
	
	@Test(groups="Smoke")
	public void Test7()
	{
		System.out.println("Test7");
	}
	@Test(groups="Functional")
	public void Test8()
	{
		System.out.println("Test8");
	}
	@Test(groups={"Functional","Regression"})
	public void Test9()
	{
		System.out.println("Test9");
	}
	

}
