package AssertPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert2 {
	@Test
	public void Sample1()
	{
		String str1="Hello";
		System.out.println(str1);
		Assert.assertEquals(str1,"hi");
		
		String str2="Hi";
		System.out.println(str2);
		Assert.assertEquals(str2,"Hi");
	}
	@Test
	
	
	public void Sample()
	{
//		SoftAssert s1=new SoftAssert();
//		s1.Sample1();
		System.out.println("Automation");
	}

}
