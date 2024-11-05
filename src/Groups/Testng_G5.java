package Groups;

import org.testng.annotations.Test;
@Test(groups = {"Functional TC"})
public class Testng_G5 {
	
	
	public void jL()
	{
		System.out.println("Jl did Tata to books in Panna");
	}
	@Test
	
	public void boDi()
	{
		System.out.println("Myan doing to Harshi or Bodi doing???");
	}
	@Test(groups = {"Functional TC"})
	public void MullT()
	{
		System.out.println("Mull T 3 times to GC");
	}

}
