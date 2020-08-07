package maventestspractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mvmdemo2Test {
	
	@Test(priority = 1)
	public void addTest()
	{
		System.out.println("add");
		int a=12;
		int b=13;
		Assert.assertEquals(25, a+b);
		
	}
	
	
	@Test(priority = 2)
	public void subTest()
	{
		System.out.println("sub");
		int a=12;
		int b=13;
		Assert.assertEquals(1, b-a);
		
	}
	
	

	@Test(priority = 3)
	public void mulTest()
	{
		System.out.println("mul");
		int a=12;
		int b=13;
		Assert.assertEquals(156, a*b);
		
	}
	
	

}
