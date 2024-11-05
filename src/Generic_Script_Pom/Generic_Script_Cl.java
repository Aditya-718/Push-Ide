package Generic_Script_Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Script_Cl {
	public WebDriver driver;
	
	@BeforeMethod
	public void Log_FB()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void Fb_Close()
	{
		driver.close();
	}

}
