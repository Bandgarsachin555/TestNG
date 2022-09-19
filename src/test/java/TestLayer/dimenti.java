package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dimenti {
	
	@Test(dependsOnMethods="m2")
	public void m1()
	{
				Assert.assertEquals(11, 12);
	}
	
	@Test(dependsOnMethods="m3")
	public void m2()
	{
		System.out.println("m2");
	}
	@Test
	public void m3()
	{
		System.out.println("m3");
	}
}
