package AssertPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	String str1="Hello";
	String str2="Hi";
	//AssertEquals
	//@Test
//	public void Test1()
//	{
//		Assert.assertEquals(str1, str2);
//	}
	//AssertNotEquals
//	public void Test2()
//	{
//		Assert.assertNotEquals(str1, str2);
//	}
	
	//AsserNull
//	@Test
//	public void Test3()
//	{
//	 Assert.assertNull(str2);	
//	}
	@Test
	public void test4()
	{
		Assert.assertNotNull(str1);
	}

}
