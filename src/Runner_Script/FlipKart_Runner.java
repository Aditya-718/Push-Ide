package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Script_Pom.Generic_Script_Flipkart;
import Pom_Script_Pack.Pom_Script_FlipKart;

public class FlipKart_Runner extends Generic_Script_Flipkart {
	@Test
	public void FlipKart_Action()
	{
		Pom_Script_FlipKart po=new Pom_Script_FlipKart(driver);
		po.DataSend("Samsung s24 Ultra");
		po.ClickData();
		Assert.fail();
		po.PhoneSam();
		//po.AddCart();
	}
	
	

}
