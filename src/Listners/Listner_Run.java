package Listners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listner_Run {
	@Test
	public void Mc()
	{
		System.out.println("Message has been sent");
	}
	@Test(dependsOnMethods="Mc")
	public void Fd()
	{
		System.out.println("Message is waiting to get delivered");
		Assert.fail();
	}
	@Test(dependsOnMethods="Fd")
	public void Th()
	{
		System.out.println("Message Failed");
	}

}
