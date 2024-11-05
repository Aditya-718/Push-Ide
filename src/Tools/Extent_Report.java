package Tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {
	@Test
	public void Test_Re()
	{
		ExtentReports rep = new ExtentReports("./Reports/abc.html",false);
		ExtentTest test = rep.startTest("TC1");
		test.log(LogStatus.PASS, "Test case passed");
		test.log(LogStatus.FAIL, "Test Case failed");
		test.log(LogStatus.SKIP, "Test Case skippedd");
		rep.endTest(test);
		rep.flush();

	}

}
