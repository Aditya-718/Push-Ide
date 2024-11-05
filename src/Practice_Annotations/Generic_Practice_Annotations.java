package Practice_Annotations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Generic_Script_Pom.Generic_Photo;

public class Generic_Practice_Annotations extends Generic_Photo {
	public WebDriver driver;
	@BeforeTest
	public void Meta_Launch()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void Meta_Url()
	{
		driver.get("https://www.facebook.com/");
	}
	@BeforeMethod
	public void Meta_Login() throws InterruptedException
	{
	      driver.findElement(By.cssSelector("input[type='text']")).sendKeys("adityab008@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc@123");
	        driver.findElement(By.cssSelector("button[name='login']")).click();
	}
	@Test
	public void action() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Upendra");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Upendra']")).click();
		
	}
	@AfterMethod
	public void Photo() throws IOException
	{
		Generic_Photo.getPhoto(driver);
	}
	@AfterClass
	public void Success()
	{
		System.out.println("Liked the photo of UI");
	}
	@AfterTest
	public void Meta_close()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	

}
