package AssertPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	@Test
	public void Sample1()
	{
		SoftAssert soft=new SoftAssert(); 
		String str1="Hello";
		System.out.println("str1");
		soft.assertEquals(str1,"Hi");
		
		String str2="Hi";
		System.out.println(str2);
		soft.assertEquals(str2,"Hi");
		soft.assertAll();
	}
	@Test
	public void Sample2()
	{
		System.out.println("Automation");
	}

}
