package Listners;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_Eg1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
		
	}
	

}
