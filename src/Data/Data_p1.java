package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_p1 {
	@Test(dataProvider = "Mailid_Pass")
	public void Face_Blog(String Un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Un);
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pwd);
        driver.findElement(By.cssSelector("button[name='login']")).click();
	}
	@DataProvider(name="Mailid_Pass")
	public Object[][] Mailid_Pass()
	{
		return new Object[][] {
			{"adityab008@gmail.com","abcxyz"},
			{"test123@gmail.com","Test!1234"},
		};
	}

}
