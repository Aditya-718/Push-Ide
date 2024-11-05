package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Properties_Fw_Sel {
	@Test
	public static String fetchProp() throws FileNotFoundException, IOException
	{
		Properties p =new Properties();
		p.load(new FileInputStream("./Softwares/url.properties"));
		String val = p.getProperty("baseUrl");
		return val;
	}

}
