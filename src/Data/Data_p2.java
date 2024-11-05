package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_p2 {
	@Test
	public void Test_Sho()
	{

	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.shoppersstack.com/signup");
    driver.findElement(By.name("First Name")).sendKeys();
    driver.findElement(By.name("Last Name")).sendKeys();
    driver.findElement(By.id("Phone Number")).sendKeys();
    driver.findElement(By.id("Email Address")).sendKeys();
}
	@DataProvider(name="Signup_Data")
	public Object[][] Signup_Data(){
		return new Object[][] {
			{"Aditya","B"}
		};
	}
}