package Generic_Script_Pom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Properties_Fw_Sel;

public class Generic_Script_Flipkart implements Framework_Constants {
	public WebDriver driver;
	@BeforeMethod
	public void Flip_login() throws FileNotFoundException, IOException
	{
		System.setProperty(Key, value);
		driver= new ChromeDriver();
		driver.get(Properties_Fw_Sel.fetchProp());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void Flip_Action_close(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
	Generic_Photo.getPhoto(driver);
		}
	driver.close();
	}

}
