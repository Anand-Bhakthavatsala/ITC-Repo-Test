package Guruschools13_maven.Guruschools13_maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsertDemo2 {
	
	@Test
	public void validateNo()
	{
		Assert.assertTrue(4<5);//execute or not ?
		System.out.println("True");
	}
	
	@Test
	public void validateNo2()
	{
		Assert.assertFalse(4>5);//execute or not ?
		System.out.println("false");
		
	}

}
