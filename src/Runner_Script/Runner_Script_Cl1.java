package Runner_Script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script_Pom.Generic_Script_Cl;
//import POM_FW_Generic.POM_Script1;
import Pom_Script_Pack.Pom_Script_Cl1;

public class Runner_Script_Cl1 extends Generic_Script_Cl{
	@Test(dataProvider="Mail_id")
	public void Fb_Run(String Un1,String pwd)
	{
		Pom_Script_Cl1	pl= new Pom_Script_Cl1(driver);
		pl.data_Uname12(Un1);
		pl.data_Password12(pwd);
		pl.data_Click12();
	}
@DataProvider(name="Mail_id")
	public Object[][] Mail_id()
	{
		return new Object[][] {
			{"adityab008@gmail.com","adi@1223"},
			{"test12@gmail.com", "test@12"},
		};
	}

}
