package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report_Imp {
	public RemoteWebDriver driver;
	@Test
	public void gen() throws InterruptedException
	{
		ExtentReports rep = new ExtentReports("./Reports/re1.html",false);
		 ExtentTest test = rep.startTest("Facebook Login");
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		 driver= new ChromeDriver();
		 test.log(LogStatus.INFO,"Test case execution started");
		 driver.get("https://www.facebook.com/");
		 test.log(LogStatus.PASS,"Navigated to FaceBook Site");
		 driver.findElement(By.id("email")).sendKeys("adityab008@gmail.com");
		 test.log(LogStatus.PASS,"Entered the Username");
		 driver.findElement(By.name("pass")).sendKeys("Test");
		 test.log(LogStatus.PASS, "Password has been entered");
		 Thread.sleep(2000);
		 driver.close();
		 test.log(LogStatus.PASS, "Browser  Successfully closed");
		 rep.flush();
		 
		 ExtentTest test1 = rep.startTest("FB Test Execution");
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		 driver= new ChromeDriver();
		 test1.log(LogStatus.INFO,"Test case execution started");
		 driver.get("https://www.facebook.com/");
		 test1.log(LogStatus.FAIL,"Unable to Navigate to Facebook page");
		 driver.findElement(By.id("email")).sendKeys("adityab008@gmail.com");
		 test1.log(LogStatus.FAIL,"Username not entered");
		 driver.findElement(By.name("pass")).sendKeys("Test");
		 test1.log(LogStatus.FAIL, "Pwd not entered");
		 Thread.sleep(2000);
		 driver.close();
		 test1.log(LogStatus.FAIL, "Browser  not closed");
		 rep.flush();
	}

}
